package com.websocket.util;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class Util {

	public static String compareUTC(String clientUTC) {
		Duration d = null;
		try {
			Instant utcDateTime = Instant.parse(clientUTC);
			Instant utcDateTimeSyst = Instant.now();
			d = Duration.between(utcDateTimeSyst, utcDateTime);
			if (String.valueOf(d.toMinutes()).equals("0")) {
				return ram15And42();
			}
			return "Error, Diferecia horaria no permitida " + d.toHours() + ":" + d.toMinutes();
		} catch (Exception e) {
			return "Error";
		}
	}

	public static String ram15And42() {
		Random random = new Random();
		int rand = 0;
		while (true) {
			rand = random.nextInt(43);
			if (rand > 15 && rand < 43)
				break;
		}
		return String.valueOf(rand) + "°";
	}

}
