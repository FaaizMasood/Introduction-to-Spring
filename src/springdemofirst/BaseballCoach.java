package springdemofirst;

public class BaseballCoach implements Coach {
	// define a private field for dependency 
	private FortuneService fortuneService;
	// define a constructor for dependecy injection 
	public BaseballCoach(FortuneService thefortuneservice) {
		fortuneService = thefortuneservice;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins batting";
	}

	@Override
	public String getDailyFortune() {
		// use my fortune service to get a fortune 
		//System.out.println("hello");
		return fortuneService.getFortune();
	}

	@Override
	public String getRandomFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
