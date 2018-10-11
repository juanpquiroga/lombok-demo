package co.com.rockthorum.lombokdemo.dto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Synchronized;

public class SynchronizedDemo {
	private DateFormat format = new SimpleDateFormat("MM-dd-YYYY");

	@Synchronized
	public String synchronizedFormat(Date date) {
	    return format.format(date);
	}
}
