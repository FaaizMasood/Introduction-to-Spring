package springdemofirst;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// setup private fields for literals
	private String emailAddress;
	private String team;
	
	
	
	// no arg contructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no arg contructor");
	}

	
	// new setter method called by spring when we inject 
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside no setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling";
	}

	////generate the setter methods for these private fields 
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside no setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("CricketCoach: inside no setter method - setTeam");
		this.team = team;
	}


	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}


	@Override
	public String getRandomFortune() {
		return fortuneService.getRandomFortune();
	}

}
