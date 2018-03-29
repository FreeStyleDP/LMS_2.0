package test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import practice.project.dao.InformMapper;
import practice.project.entity.Inform;

public class TestInformMapper extends TestBase{
	
	private InformMapper informMapper;
	
	@Before
	public void init(){
		informMapper = super.getContext().getBean("informMapper",InformMapper.class);
	}
	@Test
	public void testSelectByPrimaryKey(){
		Inform inform = informMapper.selectByPrimaryKey("0c6b43f6-ada8-4eba-a859-c7f3ad68ea10");
		System.out.println(inform);
	}
	@Test
	public void testSelectByCondition(){
		Inform record = new Inform();
		List<Inform> inform = informMapper.selectByCondition(record);
		for (Inform inform2 : inform) {
			System.out.println(inform2);
		}
	}
}
