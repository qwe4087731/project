package org.zsl.testmybatis;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iguan.entity.model.CHBasicInfoApp;
import com.iguan.service.ch.CHBasicInfoAppService;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	@Resource
	private CHBasicInfoAppService userService = null;

	@Test
	public void test1() {
		//保证 id 为100的数据存在
		CHBasicInfoApp app = userService.findById(100);
		
		logger.info(app.toString());
	}
}
