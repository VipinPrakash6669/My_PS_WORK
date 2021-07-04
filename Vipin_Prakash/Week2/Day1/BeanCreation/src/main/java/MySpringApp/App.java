package MySpringApp;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		Coach coach =applicationContext.getBean("swimCoach",Coach.class);
		System.out.println(coach.getDailyWork());
		System.out.println(coach.getDailyFortune());
		applicationContext.close();
	}
}
