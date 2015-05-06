package aop.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSportsObjects {

	public static void main(String[] args) {
		//load application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("sports.xml");
		
		//get bean
		SportObject so = ctx.getBean("sportObject",SportObject.class);
		
		//print 
		System.out.println(so.getFootball().getBall());
		

	}

}
