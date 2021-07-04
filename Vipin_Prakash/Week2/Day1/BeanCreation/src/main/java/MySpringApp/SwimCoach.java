package MySpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	@Autowired
	FortuneService fortuneService;
	public String getDailyWork() {
		// TODO Auto-generated method stub
		return "Swim 12";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getfortune();
	}

}
