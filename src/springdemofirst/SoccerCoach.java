package springdemofirst;

public class SoccerCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Be like Ronaldo";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}
	


	@Override
	public String getRandomFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
