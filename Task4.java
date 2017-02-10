package task4;

import java.util.Formatter;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter form = new Formatter();
		for(int i=2;i<11;i++){
			form.format("%."+ i+ "f"+ "%n", Math.PI);
		}
			System.out.println(form.toString());
		}
			
	}



