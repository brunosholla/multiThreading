package al.bruno.multithreading.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@Configuration
@EnableAsync
public class TaskConfig {

	/**
	 * @Description: all scheduled tasks are placed in a thread pool, and
	 *               different threads are used when the scheduled task is
	 *               started
	 * @return
	 * @Date: May 28, 2019
	 */
	@Bean
	public TaskScheduler taskScheduler() {
		ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
		// Set the scheduler execution thread to 5
		scheduler.setPoolSize(5);
		return scheduler;
	}

}