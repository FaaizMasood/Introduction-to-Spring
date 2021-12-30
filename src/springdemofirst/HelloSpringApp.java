package springdemofirst;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file 
		// this will load the file so this application will read whatever is written there
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve a bean from spring container 
		// this will read that bean and apply the interface class 
		Coach theCoach = context.getBean("myCoach", Coach.class); 
		
		// call methods on the bean 
		// we will print the method in the interface based on the name in xml file
		System.out.println(theCoach.getDailyWorkout());
		//System.out.println("Hello");
		
		// new method for fortune service
		//System.out.println(theCoach.getDailyFortune());
		
		// close the context 
		context.close();
	}

}
