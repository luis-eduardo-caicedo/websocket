package com.websocket.test;

import java.time.Duration;
import java.time.Instant;

public class Test {

	public static void main(String[] args) {
		try {
			String input = "2020-06-05T00:34:11.739Z";
			//if (input.endsWith("Z")) {
			//	input = input.substring(0, input.length() - 1);
		//	}
			Instant utcDateTime = Instant.parse(input);
			System.out.print(utcDateTime + "\n");
			Instant utcDateTimeSyst = Instant.now();
			System.out.print(utcDateTimeSyst + "\n");
			Duration d = Duration.between(utcDateTimeSyst, utcDateTime);
			System.out.print(d.toMinutes() + "\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
