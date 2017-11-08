package org.study.maven.mybatis;

import java.util.Properties;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;

@Intercepts({ @Signature(type = Executor.class, method = "update", args = {
		MappedStatement.class, Object.class }) })
public class MyPlugin implements Interceptor {
	public Object intercept(Invocation invocation) throws Throwable {
		System.out.println("before...");
		Object obj = invocation.proceed();
		System.out.println("after...");
		return obj;
	}

	public Object plugin(Object target) {
		System.out.println("调用生成代理对象");
		return Plugin.wrap(target, this);
	}

	public void setProperties(Properties properties) {
		// TODO Auto-generated method stub
	}
}
