package cn.jpp.constants;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeUtil {

	public static final String DEFAULT_DATE_PATTERN = "yyMMdd";
	
	public static Date parseDate(String dateStr, String pattern) {
		Date date = null;
		try {
			if (dateStr != null) {
				SimpleDateFormat sdf = new SimpleDateFormat();
				sdf.applyPattern(pattern);
				sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));
				date = sdf.parse(dateStr);
			}
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
		return date;
	}
	public static Date parseDate(String dateStr) {
		return parseDate(dateStr, DEFAULT_DATE_PATTERN);
	}
	public static String formatDate(Date date, String pattern) {
		String dateStr = "";
		if (date != null) {
			SimpleDateFormat sdf = new SimpleDateFormat();
			sdf.applyPattern(pattern);
			sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));
			dateStr = sdf.format(date);
		}
		
		return dateStr;
	}
	public static String formatDate(Date date) {
		return formatDate(date, DEFAULT_DATE_PATTERN);
	}
	public static java.sql.Date parseSqlDate(Date date) {
		return new java.sql.Date(date.getTime());
	}

	public static java.sql.Date parseSqlDate(String dateStr, String format) {
		Date date = parseDate(dateStr, format);
		return parseSqlDate(date);
	}

	public static java.sql.Timestamp parseSqlTimestamp(String dateStr, String format) {
		Date date = parseDate(dateStr, format);
		if (date != null) {
			long t = date.getTime();
			return new java.sql.Timestamp(t);
		} else
			return null;
	}

    public static Long addDate(Long date, long day) {
        return date + 3600 * 24 * 1000 * day;
    }
    
	public static String format(Long date, String format) {
		String result = "";
		try {
			if (date != null) {
				java.text.DateFormat df = new java.text.SimpleDateFormat(format);
				df.setTimeZone(TimeZone.getTimeZone("GMT+8"));
				result = df.format(new Date(date));
			}
		} catch (Exception e) {
		}
		return result;
	}

	public static int getYear(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c.get(Calendar.YEAR);
	}

	public static int getMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c.get(Calendar.MONTH) + 1;
	}

	public static int getDay(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c.get(Calendar.DAY_OF_MONTH);
	}

	public static int getHour(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c.get(Calendar.HOUR_OF_DAY);
	}

	public static int getMinute(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c.get(Calendar.MINUTE);
	}

	public static int getSecond(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c.get(Calendar.SECOND);
	}

	public static long getMillis(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c.getTimeInMillis();
	}

	public static Date addDate(Date date, int day) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DAY_OF_MONTH, day);
		return c.getTime();
	}

	private static long diff(Date minDate, Date maxDate, TimeUnit unit) {
		long difference = maxDate.getTime() - minDate.getTime();
		long res = difference;
		switch (unit) {
		case DATE:
			res = difference / (3600 * 24 * 1000);
			break;
		case HOUR:
			res = difference / (3600 * 1000);
			break;
		case MINUTE:
			res = difference / (60 * 1000);
			break;
		case SECOND:
			res = difference / 1000;
			break;

		default:
			break;
		}
		
		return res;
	}

	public static int diffDate(Date minDate, Date maxDate) {
		return (int) diff(minDate, maxDate, TimeUnit.DATE) + 1;
	}

	private enum TimeUnit {
		DATE, HOUR, MINUTE, SECOND
	}
}