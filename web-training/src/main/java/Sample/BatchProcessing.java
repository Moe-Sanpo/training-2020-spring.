package sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class BatchProcessing {

	@Autowired
	Sample count;

	@Scheduled(initialDelay = 3000, fixedDelay = 5000)
	public void initialDelay() {
		System.out.println(count.getCount());
	}
}
