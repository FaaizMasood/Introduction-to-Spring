package springdemofirst;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve a bean from spring container 
		// this will read that bean and apply the interface class 
		Coach theCoach = context.getBean("myCoach", Coach.class); 
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class); 
		
		// check to see if these are same beans 
		boolean result = (theCoach == alphaCoach);
		System.out.println("pointing to the same object? " + result);
		//---------
		System.out.println("memory location of theCoach " + theCoach);
		//---------
		System.out.println("memory location of alphaCoach " + alphaCoach);
		
		// close context 
		context.close();
	}

}
