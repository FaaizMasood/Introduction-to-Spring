package springdemofirst;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// retrieve a bean from spring container 
		// this will read that bean and apply the interface class 
		Coach theCoach = context.getBean("myCoach", Coach.class); 
		
		System.out.println(theCoach.getDailyWorkout());
		
		
		
		// close context 
		context.close();
	}

}
