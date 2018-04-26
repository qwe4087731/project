package org.phoenix.mybatis.generate.plugin;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

public class MyJavaTypeResolver extends JavaTypeResolverDefaultImpl {

	public FullyQualifiedJavaType calculateJavaType(IntrospectedColumn introspectedColumn) {
		String columnName = introspectedColumn.getActualColumnName();
		if (columnName.startsWith("is_")) {
			columnName = columnName.substring("is_".length());
			return new FullyQualifiedJavaType(Boolean.class.getName());
		}
		return super.calculateJavaType(introspectedColumn);
	}

	// public String calculateJdbcTypeName(IntrospectedColumn introspectedColumn) {
	// String javaPropertyName = introspectedColumn.getActualColumnName();
	// System.out.println(javaPropertyName);
	// if (javaPropertyName.startsWith("is_")) {
	// javaPropertyName = javaPropertyName.substring("is_".length());
	// System.out.println(javaPropertyName);
	// return javaPropertyName;
	// }
	// return super.calculateJdbcTypeName(introspectedColumn);
	//
	// }
}
