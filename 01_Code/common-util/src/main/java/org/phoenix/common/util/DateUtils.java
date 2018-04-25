package org.phoenix.common.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DateUtils {
	private static final ThreadLocal<Map<String, DateFormat>> df = new ThreadLocal<Map<String, DateFormat>>();
	public static final String DATE_FORMAT_YYYY_MM_DD = "yyyy-MM-dd";

	public static Date getTodayZeroTime() {
		Calendar cal = Calendar.getInstance();
		setTodayZeroTime(cal);
		return cal.getTime();
	}

	public static void setTodayZeroTime(Calendar cal) {
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
	}

	public static String formatDate(Date date) {
		return format(date, DATE_FORMAT_YYYY_MM_DD);
	}

	public static String format(Date date, String format) {
		if (date == null)
			return null;
		DateFormat dateFormat = getDateFormat(format);
		return dateFormat.format(date);
	}

	public static Date parse(String dateStr, String format) throws Exception {
		if (dateStr == null)
			return null;

		DateFormat dateFormat = getDateFormat(format);
		return dateFormat.parse(dateStr);
	}

	private static DateFormat getDateFormat(String format) {
		Map<String, DateFormat> map = df.get();
		if (map == null) {
			map = new HashMap<String, DateFormat>();
			df.set(map);
		}
		DateFormat dateFormat = map.get(format);
		if (dateFormat == null) {
			dateFormat = new SimpleDateFormat(format);
			map.put(format, dateFormat);
		}
		return dateFormat;
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println(DateUtils.format(new Date(), "yyyy-MM-dd"));
		new Thread(new Runnable() {
			public void run() {
				System.out.println(DateUtils.format(new Date(), "yyyy-MM-dd HH:mm"));
			}
		}).start();
		Thread.sleep(1000);
		Thread.sleep(2000000);
	}
}
