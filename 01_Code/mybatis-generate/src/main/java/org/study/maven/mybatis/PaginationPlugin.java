package org.study.maven.mybatis;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;

public class PaginationPlugin extends PluginAdapter {

	public boolean validate(List<String> warnings) {
		return true;
	}

	// @Override
	// public boolean clientDeleteByExampleMethodGenerated(Method method,
	// TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
	// // TODO Auto-generated method stub
	// return super.clientDeleteByExampleMethodGenerated(method, topLevelClass,
	// introspectedTable);
	// //topLevelClass对java类的DOM封装
	// }
	//
	@Override
	public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable) {
		// 一个是topLevelClass，该类的实例就是表示当前正在生成的类的DOM结构，
		// 第二个introspectedTable是代表的runtime环境，包含了所有context中的配置，一般从这个类中去查询生成对象的一些规则
		// TODO Auto-generated method stub
		generateToString(introspectedTable, topLevelClass);
		return true;
	}

	private void generateToString(IntrospectedTable introspectedTable,
			TopLevelClass topLevelClass) {
		// //
		// 首先创建一个Method对象，注意，这个Method是org.mybatis.generator.api.dom.java.Method，
		// // 这个Method是MBG中对对象DOM的一个抽象；因为我们要添加方法，所以先创建一个；
		// Method method = new Method();
		//
		// // 设置这个方法的可见性为public，代码已经在一步一步构建这个方法了
		// method.setVisibility(JavaVisibility.PUBLIC);
		//
		// // 设置方法的返回类型，这里注意一下的就是，returnType是一个FullyQualifiedJavaType；
		// // 这个FullyQualifiedJavaType是MGB中对Java中的类型的一个DOM封装，这个类在整个MBG中大量使用；
		// //
		// FullyQualifiedJavaType提供了几个静态的方法，比如getStringInstance，就直接返回了一个对String类型的封装；
		// method.setReturnType(FullyQualifiedJavaType.getStringInstance());
		//
		// // 设置方法的名称，至此，方法签名已经装配完成；
		//		method.setName("toString"); //$NON-NLS-1$
		//
		// // 判断当前MBG运行的环境是否支持Java5（这里就可以看出来IntrospectedTable类的作用了，主要是查询生成环境的作用）
		// if (introspectedTable.isJava5Targeted()) {
		// // 如果支持Java5，就在方法上面生成一个@Override标签；
		//			method.addAnnotation("@Override"); //$NON-NLS-1$
		// }
		// // 访问上下文对象（这个context对象是在PluginAdapter初始化完成后，通过setContext方法设置进去的，
		// //
		// 通过getCommentGenerator方法得到注释生成器，并调用addGeneralMethodComment为当前生成的方法添加注释；
		// // 因为我们没有提供自己的注释生成器，所以默认的注释生成器只是说明方法是通过MBG生成的，对应的是哪个表而已；
		// // 这句代码其实非常有意义，通过这句代码，我们基本就可能了解到MBG中对于方法注释的生成方式了；
		// context.getCommentGenerator().addGeneralMethodComment(method,
		// introspectedTable);
		//
		// // OK，调用addBodyLine开始为方法添加代码了
		// // 可以看到，确实，只是简单的把要生成的代码通过String拼装到了method的body中而已；
		// // 想到了什么？确实，我想到了Servelt的输出方法。MBG默认的方法体具体的实现，就是像Servlet那样通过String输出的；
		// // 所以，这才会为我们后面准备用Velocity来重写MBG提供了依据，我们只是给MBG添加一个MVC的概念；
		//		method.addBodyLine("StringBuilder sb = new StringBuilder();"); //$NON-NLS-1$
		//		method.addBodyLine("sb.append(getClass().getSimpleName());"); //$NON-NLS-1$
		//		method.addBodyLine("sb.append(\" [\");"); //$NON-NLS-1$
		//		method.addBodyLine("sb.append(\"Hash = \").append(hashCode());"); //$NON-NLS-1$
		//
		// // 接下来要准备拼装类的字段了；
		// StringBuilder sb = new StringBuilder();
		//
		// //
		// 通过topLevelClass得到当前类的所有字段，注意，这里的Field是org.mybatis.generator.api.dom.java.Field
		// // 这个Field是MBG对字段的一个DOM封装
		//
		// for (Field field : topLevelClass.getFields()) {
		//
		// // 得到字段的名称；
		// String property = field.getName();
		// // 重置StringBuilder；
		// sb.setLength(0);
		//
		// // 添加字段的输出代码；
		//			sb.append("sb.append(\"").append(", ").append(property) //$NON-NLS-1$ //$NON-NLS-2$
		//					.append("=\")").append(".append(").append(property) //$NON-NLS-1$ //$NON-NLS-2$
		//					.append(");"); //$NON-NLS-1$
		//
		// // 把这个字段的toString输出到代码中；所以才看到我们最后生成的代码结果中，每一个字段在toString方法中各占一行；
		// method.addBodyLine(sb.toString());
		// }
		//
		//		method.addBodyLine("sb.append(\"]\");"); //$NON-NLS-1$
		//		method.addBodyLine("return sb.toString();"); //$NON-NLS-1$
		//
		// // 把拼装好的方法DOM添加到topLevelClass中，完成方法添加；
		// topLevelClass.addMethod(method);

		Field tableName = new Field();
		tableName.setStatic(true);
		tableName.setVisibility(JavaVisibility.PUBLIC);
		tableName.setFinal(true);
		tableName.setType(FullyQualifiedJavaType.getStringInstance());
		tableName.setName("TABLENAME");
		tableName.setInitializationString("\""
				+ introspectedTable.getFullyQualifiedTable()
						.getIntrospectedTableName() + "\"");
		topLevelClass.addField(tableName);
		List<IntrospectedColumn> columns = introspectedTable.getAllColumns();
		for (IntrospectedColumn column : columns) {
			Field field = new Field();
			field.setStatic(true);
			field.setVisibility(JavaVisibility.PUBLIC);
			field.setFinal(true);
			field.setType(FullyQualifiedJavaType.getStringInstance());
			field.setName(column.getActualColumnName().toUpperCase());
			field.setInitializationString("\"" + column.getActualColumnName()
					+ "\"");
			topLevelClass.addField(field);
		}
	}

	@Override
	public boolean clientGenerated(Interface interfaze,
			TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		Set<FullyQualifiedJavaType> importedTypes = new TreeSet<FullyQualifiedJavaType>();
		FullyQualifiedJavaType selectType = new FullyQualifiedJavaType(
				"org.study.maven.mybatis.SelectCriterion");
		FullyQualifiedJavaType countType = new FullyQualifiedJavaType(
				"org.study.maven.mybatis.CountCriterion");
		FullyQualifiedJavaType updateType = new FullyQualifiedJavaType(
				"org.study.maven.mybatis.UpdateCriterion");
		FullyQualifiedJavaType deleteType = new FullyQualifiedJavaType(
				"org.study.maven.mybatis.DeleteCriterion");
		importedTypes.add(selectType);
		importedTypes.add(countType);
		importedTypes.add(updateType);
		importedTypes.add(deleteType);
		importedTypes.add(new FullyQualifiedJavaType(
				"org.apache.ibatis.annotations.Param"));

		FullyQualifiedJavaType recordType = new FullyQualifiedJavaType(
				introspectedTable.getBaseRecordType());

		FullyQualifiedJavaType listType = FullyQualifiedJavaType
				.getNewListInstance();
		listType.addTypeArgument(recordType);

		Method method = new Method();
		method.setReturnType(listType);
		method.setName("selectByCriterion");
		method.addParameter(new Parameter(selectType, "criterion"));
		interfaze.addMethod(method);

		method = new Method();
		method.setReturnType(FullyQualifiedJavaType.getIntInstance());
		method.setName("countByCriterion");
		method.addParameter(new Parameter(countType, "criterion"));
		interfaze.addMethod(method);

		method = new Method();
		method.setReturnType(FullyQualifiedJavaType.getIntInstance());
		method.setName("updateByCriterion");
		method.addParameter(new Parameter(recordType, "record",
				"@Param(\"record\")"));
		method.addParameter(new Parameter(updateType, "criterion",
				"@Param(\"criterion\")"));
		interfaze.addMethod(method);

		method = new Method();
		method.setReturnType(FullyQualifiedJavaType.getIntInstance());
		method.setName("deleteByCriterion");
		method.addParameter(new Parameter(deleteType, "criterion"));
		interfaze.addMethod(method);

		interfaze.addImportedTypes(importedTypes);
		return super.clientGenerated(interfaze, topLevelClass,
				introspectedTable);
	}
	// @Override
	// public boolean modelFieldGenerated(Field field,
	// TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn,
	// IntrospectedTable introspectedTable, ModelClassType modelClassType) {
	// return super.modelFieldGenerated(field, topLevelClass,
	// introspectedColumn, introspectedTable, modelClassType);
	//
	// Field newField = new Field();
	// field.setVisibility(JavaVisibility.PROTECTED);
	// field.setType(new FullyQualifiedJavaType(
	// "com.MutiModule.common.vo.mybatis.pagination.Page"));
	// field.setName(name);
	// topLevelClass.addField(field);
	// char c = name.charAt(0);
	// String camel = Character.toUpperCase(c) + name.substring(1);
	// Method method = new Method();
	// method.setVisibility(JavaVisibility.PUBLIC);
	// method.setName("set" + camel);
	// method.addParameter(new Parameter(new FullyQualifiedJavaType(
	// "com.MutiModule.common.vo.mybatis.pagination.Page"), name));
	// method.addBodyLine("this." + name + "=" + name + ";");
	// commentGenerator.addGeneralMethodComment(method, introspectedTable);
	// topLevelClass.addMethod(method);
	// method = new Method();
	// method.setVisibility(JavaVisibility.PUBLIC);
	// method.setReturnType(new FullyQualifiedJavaType(
	// "com.MutiModule.common.vo.mybatis.pagination.Page"));
	// method.setName("get" + camel);
	// method.addBodyLine("return " + name + ";");
	// commentGenerator.addGeneralMethodComment(method, introspectedTable);
	// topLevelClass.addMethod(method);
	// }

}