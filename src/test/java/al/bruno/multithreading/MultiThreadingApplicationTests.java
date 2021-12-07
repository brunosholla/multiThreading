package al.bruno.multithreading;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Scheduled;

import al.bruno.multithreading.services.TaskTest;

@SpringBootTest
class MultiThreadingApplicationTests {

	static final ScheduledExecutorService SCHEDULER = new ScheduledThreadPoolExecutor(0);

	@Autowired
	private TaskTest testService;

}
