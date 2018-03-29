package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBase {
	
	public ApplicationContext getContext(){
		String[] conf = {"conf/spring-mvc.xml","conf/spring-mybatis.xml"};
		return new ClassPathXmlApplicationContext(conf);
	}
}
