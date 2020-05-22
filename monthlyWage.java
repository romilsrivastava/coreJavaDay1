public class monthlyWage {
	public static void main(String[] args) {
		int WagePerHour=20;
		int FullDayHour=16;
		int PartTimeHour=8;
		int WorkingDayPerMonth=20;
		double randomc=Math.floor(Math.random() * 10) % 3;
		int random= (int)randomc;
		switch (random) {
			case 1:
			  System.out.println ("employee is present for full time");
	        int DailyWageFullTime=( WagePerHour*FullDayHour );
			  int MonthlyWageFullTime=( WagePerHour*FullDayHour*WorkingDayPerMonth );
           System.out.println(MonthlyWageFullTime);
			  break;
			case 2:
				System.out.println("employee is present for part time");
				int DailyWagePartTime=( WagePerHour*PartTimeHour );
				int MonthlyWagePartTime=( WagePerHour*PartTimeHour*WorkingDayPerMonth );
				System.out.println(MonthlyWagePartTime);
				break;
			default :
				System.out.println("employee is absent");
		}
	}
}
