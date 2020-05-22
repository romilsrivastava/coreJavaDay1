public class PartFullTimeUC4 {
	public static void main(String[] args) {
		int WagePerHour=20;
		int FullDayHour=16;
		int PartTimeHour=8;
		double randomc=Math.floor(Math.random() * 10) % 3;
		int random= (int)randomc;
		switch (random) {
			case 1:
			  System.out.println ("employee is present for full time");
	        int DailyWageFullTime=( WagePerHour*FullDayHour );
           System.out.println(DailyWageFullTime);
			  break;
			case 2:
				System.out.println("employee is present for part time");
				int DailyWagePartTime=( WagePerHour*PartTimeHour );
				System.out.println(DailyWagePartTime);
				break;
			default :
				System.out.println("employee is absent");
		}
	}
}
