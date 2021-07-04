package MySpringApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
	//define bean for sad fortune service
	@Bean
	public FortuneService sadfortuneService()
	{
		return new SadFortuneService();
	}
	//define bean for swim coach and inject dependency for swim coach
	@Bean
	public Coach swimCoach()
	{
		return new SwimCoach();
	}
	//
}
