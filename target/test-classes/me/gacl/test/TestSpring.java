package me.gacl.test;

import me.gacl.service.UserService;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	@Test
	public void test() {
		// 通过spring.xml配置文件创建Spring的应用程序上下文环境
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"classpath:spring.xml");
		// 从Spring的IOC容器中获取bean对象
		UserService userService = (UserService) ac.getBean("userService");
		// 执行测试方法
		Assert.assertEquals("hello world", userService.test());

	}
}