package task1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		
		System.out.println(date);
		
		Calendar calendar = Calendar.getInstance();

		calendar.add(Calendar.MONTH, -1);

		System.out.println(date.getTime());
	}

}
