package springdemofirst;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// 1. Load the spring config file
		// 2. reterive the bean from spring container 
		// 3. call methods on this bean 
		// 4. close the context
		
		
		// 1. 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 2.
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class); 
		
		// 3. 
		// lets come back later..., back now 
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// after setter methods for literals
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		//testing random fortune service 
		System.out.println(theCoach.getRandomFortune());
		// 4. 
		context.close();
	}

}
