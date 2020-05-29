package Sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateBean {
	@Bean
	public Sample getCount() {
		return new Sample();
	}
}
