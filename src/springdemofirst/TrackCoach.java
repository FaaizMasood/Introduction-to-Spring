package springdemofirst;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneservice;
	
	public TrackCoach() {} // this is kind of a hack 
	public TrackCoach(FortuneService fortuneservice) {
		super();
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5k";
	}

	@Override
	public String getDailyFortune() {
		return "DI in Track Coach" + fortuneservice.getFortune();
	}
	@Override
	public String getRandomFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	// add in it method 
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside the doMyStartupStuff method");
	}
	
	// add the destroy method 
	public void doMyCleanupStudd() {
		System.out.println("TrackCoach: inside the doMyCleanupStudd method");
	}
}
