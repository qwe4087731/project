package org.phoenix.common.util;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.CompactXmlSerializer;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.phoenix.common.constant.CharSetConsts;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/*
 * 
 * http://htmlcleaner.sourceforge.net/parameters.php#transform
 * 
 */
public class XPathUtils {
	private static XPathFactory xfactory = XPathFactory.newInstance();

	public static String html2xmlstr(String html_data) throws Exception {
		HtmlCleaner cleaner = new HtmlCleaner();
		CleanerProperties properties = cleaner.getProperties();
		// 忽略注释
		properties.setOmitComments(true);
		// 忽略script，style标签
		properties.setPruneTags("script,style");
		// 忽略命名空间
		properties.setNamespacesAware(false);
		// 忽略DOCTYPE声明
		properties.setOmitDoctypeDeclaration(true);
		// properties.setUseEmptyElementTags(false);

		// CleanerTransformations transformations =
		// new CleanerTransformations();
		// TagTransformation tt = new TagTransformation("br");
		// transformations.addTransformation(tt);
		// properties.setCleanerTransformations(transformations);

		TagNode node = cleaner.clean(html_data);
		// 此版本会最大性兼容不规范的html代码
		// utf-8表示生成的xml文件<?xml version="1.0" encoding="utf-8"?>
		String xmlData = new CompactXmlSerializer(properties).getAsString(node,
				CharSetConsts.UTF_8);

		return xmlData;
	}

	private static Object eval(Document doc, String xpath, QName qname)
			throws Exception {
		XPath path = xfactory.newXPath();
		XPathExpression compile = path.compile(xpath);
		return compile.evaluate(doc, qname);
	}

	public static String stringOfXpath(String xmlData, String xpath)
			throws Exception {
		Document doc = getDoc(xmlData);
		return stringOfXpath(doc, xpath);
	}

	public static String stringOfXpath(Document doc, String xpath)
			throws Exception {
		return ((String) eval(doc, xpath, XPathConstants.STRING)).trim();
	}

	public static List<String> stringListOfXpath(String xmlData, String xpath)
			throws Exception {
		Document doc = getDoc(xmlData);
		return stringListOfXpath(doc, xpath);
	}

	public static List<String> stringListOfXpath(Document doc, String xpath)
			throws Exception {
		NodeList nodeList = nodeListOfXpath(doc, xpath);
		return nodeListToStringList(nodeList);
	}

	public static Node nodeOfXpath(String xmlData, String xpath)
			throws Exception {
		Document doc = getDoc(xmlData);
		return nodeOfXpath(doc, xpath);
	}

	public static Node nodeOfXpath(Document doc, String xpath) throws Exception {
		return (Node) eval(doc, xpath, XPathConstants.NODE);
	}

	public static NodeList nodeListOfXpath(String xmlData, String xpath)
			throws Exception {
		Document doc = getDoc(xmlData);
		return nodeListOfXpath(doc, xpath);
	}

	public static NodeList nodeListOfXpath(Document doc, String xpath)
			throws Exception {
		return (NodeList) eval(doc, xpath, XPathConstants.NODESET);
	}

	private static List<String> nodeListToStringList(NodeList nodeList) {
		if (nodeList == null || nodeList.getLength() <= 0) {
			return null;
		}

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.TEXT_NODE) {
				list.add(node.getTextContent().trim());
			} else {
				return null;
			}
		}
		return list;
	}

	private static Document getDoc(String xmlData) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		// 设置为true，<xsd:hello>会去校验xsd是否有效，设置为false不会去校验
		factory.setNamespaceAware(false);
		factory.setIgnoringComments(true);
		// <![CDATA[>sdf]]>会转换成"&gt;sdf",false则仍然是<![CDATA[>sdf]]>
		factory.setCoalescing(true);
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder
				.parse(new InputSource(new StringReader(xmlData)));
		return doc;
	}

	public static void main(String[] args) throws Exception {
		// String data =
		// "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Frameset//EN\" \"http://www.w3.org/TR/html4/frameset.dtd\"><!--NewPage--><html><script>123213</script><title/><hello src=\"a b\" test=\"中國\">123</hello><xsd:world></html>";
		// String str = html2xmlstr(data);
		// // System.out.println(str);
		// str =
		// "<!--NewPage--><xsd:hello><world>sdfsdf<br/>sdfds</world><world>ccc</world></xsd:hello>";
		// str = html2xmlstr(str);
		// System.out.println(str);
		// // Document doc = getDoc(str);
		// NodeList nodeList= nodeListOfXpath(str, "//hello/world");
		// System.out.println("=======================");
		// for(int i = 0; i < nodeList.getLength(); i++)
		// {
		// Node node = nodeList.item(i);
		// System.out.println(node.getNodeName());
		// System.out.println("-------------------");
		// }
		// for(String s : list)
		// {
		// System.out.println(s);
		// System.out.println("-----------");
		// }
		// for (int i = 0; i < nodeList.getLength(); i++) {
		// System.out.println(nodeList.item(i).getNodeName());
		// System.out.println(nodeList.item(i).getChildNodes().toString());
		// }
		// System.out.println("-----------------------");
		// StringWriter writer = new StringWriter();
		// javax.xml.transform.TransformerFactory
		// .newInstance()
		// .newTransformer()
		// .transform(new javax.xml.transform.dom.DOMSource(doc),
		// new javax.xml.transform.stream.StreamResult(writer));
		// System.out.println(writer.toString());
		String url = "https://www.baidu.com/";

		String data = null;
		long time1 = System.currentTimeMillis();
		try {
			data = HttpUtils.getData(url, CharSetConsts.UTF_8);
		} catch (Exception e) {
			e.printStackTrace();
		}
		long time2 = System.currentTimeMillis();
		System.out.println((time2 - time1) / 1000);
		data = html2xmlstr(data);
		System.out.println(data);

		List<String> datas = stringListOfXpath(data, "//a/text()");
		for (String d : datas) {
			System.out.println(d);
		}

	}
}
