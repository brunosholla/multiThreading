package al.bruno.multithreading.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskTest {
	private final Logger log = LoggerFactory.getLogger(TaskTest.class);
	// Output time format
	private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:sss");

	@Scheduled(fixedRate = 1000)
	private void sayHello() {

		log.error("Task1 started at {}", format.format(new Date()));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.error("Task1 ended at {}", format.format(new Date()));
	}

	@Scheduled(fixedRate = 1000)
	private void sayHello2() {
		log.error("Task2 started at {}", format.format(new Date()));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.error("Task2 ended at {}", format.format(new Date()));
	}

	@Scheduled(fixedRate = 1000)
	private void sayHello3() {
		log.error("Task3 started at {}", format.format(new Date()));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.error("Task3 ended at {}", format.format(new Date()));
	}

	@Scheduled(fixedRate = 1000)
	private void sayHello4() {
		log.error("Task4 started at {}", format.format(new Date()));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.error("Task4 ended at {}", format.format(new Date()));
	}

	@Scheduled(fixedRate = 1000)
	private void sayHello5() {
		log.error("Task5 started at {}", format.format(new Date()));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.error("Task5 ended at {}", format.format(new Date()));
	}
}