public class dailyWage {
	public static void main(String[] args) {
		int WagePerHour=20;
		int FullDayHour=8;
		double randomc=Math.floor(Math.random() * 10) % 2;
		int random= (int)randomc;
		switch (random) {
			case 1:
			  System.out.println ("employee is present for full time");
	        int dailywage=(( WagePerHour*FullDayHour ));
           System.out.println(dailywage);
			  break;
			case 2:
				System.out.println("employee is absent");
       }
	}
}

