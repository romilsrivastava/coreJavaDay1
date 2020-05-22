import java.util.Random;
public class totalWorking {
	public static void main(String[] args) {
		Random rand = new Random();
		int WagePerHour=20;
		int FullDayHour=16;
		int PartTimeHour=8;
		int WorkingDayPerMonth=20;
		int MaxHrs=rand.nextInt(200);
		int MaxDays=rand.nextInt(30);
		double randomc=Math.floor(Math.random() * 10) % 3;
		int random= (int)randomc;
		switch (random) {
			case 1:
			  System.out.println ("employee is present for full time");
			  if ( MaxHrs < 100 && MaxDays < 20){
	        int DailyWageFullTime=( WagePerHour*FullDayHour );
			  int MonthlyWageFullTime=( WagePerHour*FullDayHour*WorkingDayPerMonth );
           System.out.println(MonthlyWageFullTime);}
			  else{
					System.out.println("out of limit");}
			  break;
			case 2:
				if ( MaxHrs < 100 && MaxDays < 20){
				System.out.println("employee is present for part time");
				int DailyWagePartTime=( WagePerHour*PartTimeHour );
				int MonthlyWagePartTime=( WagePerHour*PartTimeHour*WorkingDayPerMonth );
				System.out.println(MonthlyWagePartTime);}
				else{
				   System.out.println("out of limit");}
				break;
			default :
				System.out.println("employee is absent");
		}
	}
}
