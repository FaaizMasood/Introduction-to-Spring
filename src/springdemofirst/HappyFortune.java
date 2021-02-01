package springdemofirst;

import java.util.Random;

public class HappyFortune implements FortuneService {
	
	@Override
	public String getFortune() {
		return "Today is my lucky day";
	}
	
	@Override
	public String getRandomFortune() {

		String[] res = new String[] {"first fortune: you will get a job","first fortune: you will get a billion dollar"
				,"first fortune: you will get a private jet","first fortune: you will get a ps5","first fortune: you will get a CEO of google"};
		
		Random random = new Random();
		int index = random.nextInt(res.length - 1);
		return res[index];
	}

}
