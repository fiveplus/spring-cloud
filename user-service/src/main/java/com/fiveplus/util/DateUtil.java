package com.fiveplus.util;

import java.util.Date;

public class DateUtil {
	public static final String DATE_FORMAT="yyyy-MM-dd HH:mm:ss";
	public static long getDateToLong(Date date){
		return date.getTime();
	}
}
