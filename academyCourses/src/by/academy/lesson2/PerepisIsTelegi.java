package by.academy.lesson2;

public class PerepisIsTelegi {

	public static void main(String[] args) {
		//проверочка
		int s = 23497;
	
		int m, h, d, w;
		int sec, min, hours, day, week;
		
		sec = s % 60;
		m = (s - sec) / 60;
		min = m % 60;
		h = (m - min) / 60;
		hours = h % 60;
		d = (h - hours) / 24;
		day = d % 24;
		w = (d - day) / 7;
		week = w % 7;
		
		System.out.println(week + " недель " + day +" дней " + hours + " часов " + min + " минут " + sec + " секунд");
		
	}

}
