package com.kk.log;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

/**
 * 보통 System.out.println 말고 log를 찍으라고들 한다. 형태도 보기 좋지만, System.out.println은 속도가 더 느리다던데
 * 한번 비교해보자.
 */
@Slf4j
@SpringBootTest
public class LogTimeTest {



	@Test
	void printlnTest() throws Exception {
		// given
		String method = "printlnTest";
		int n = 100_0000;
		long start = System.currentTimeMillis();
		// when
		for (int i = 0; i < n; i++) {
			System.out.println("해윙");
		}
		long end = System.currentTimeMillis();
		// then
		long cost = end - start;
		log.info("{}-{}, cost: {}ms", method, n, cost);
		// 09:29:29.167 [Test worker] INFO com.kk.log.LogTimeTest -- printlnTest-1000000, cost: 1804ms
	}

	@Test
	void logInfoTest() throws Exception {
		// given
		String method = "logInfoTest";
		int n = 100_0000;
		long start = System.currentTimeMillis();
		// when
		for (int i = 0; i < n; i++) {
			log.info("해윙");
		}
		long end = System.currentTimeMillis();
		// then
		long cost = end - start;
		log.info("{}-{}, cost: {}ms", method, n, cost);
		// 09:31:08.335 [Test worker] INFO com.kk.log.LogTimeTest -- logInfoTest-1000000, cost: 2349ms
	}

	@Test
	void logDebugTest() throws Exception {
		// given
		String method = "logDebugTest";
		int n = 100_0000;
		long start = System.currentTimeMillis();
		// when
		for (int i = 0; i < n; i++) {
			log.debug("해윙");
		}
		long end = System.currentTimeMillis();
		// then
		long cost = end - start;
		log.info("{}-{}, cost: {}ms", method, n, cost);
		// 09:32:55.618 [Test worker] INFO com.kk.log.LogTimeTest -- logDebugTest-1000000, cost: 5ms
		// 2024-05-21 09:47:14.243 [Test worker]  INFO com.kk.log.LogTimeTest - logDebugTest-1000000, cost: 2244ms
	}
}
