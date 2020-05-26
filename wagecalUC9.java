public class WagecalUC9{
	public static final int PartTime = 1;
	public static final int FullTime = 2;

	private final String companyname;
	private final int emprateperhour;
	private final int workingdays;
	private final int maxhourspermonth;
	private int totalEmpwge;

	public WagecalUC9(String companyname,int emprateperhour,int workingdays,int maxhourspermonth){
		this.companyname = companyname;
		this.emprateperhour = emprateperhour;
		this.workingdays = workingdays;
		this.maxhourspermonth = maxhourspermonth;

	}
	private int calEmpwage(){
		int hrs=0 , totalhrs=0, totalworkingdays=0;
		while(totalhrs <= maxhourspermonth && totalworkingdays < workingdays){
			totalworkingdays++;
			int empcheck = (int) Math.floor(Math.random()*10)%3;
			switch(empcheck){
				case PartTime:
					hrs=4;
					break;
				case FullTime:
					hrs=8;
					break;
				default:
					hrs=0;
			}
			totalhrs += hrs;
			System.out.println("Day :" + totalworkingdays + " " + "Emphrs :" + hrs );
		}
		totalEmpwage= totalhrs * emprateperhour;
		return totalEmpwage;
	}
	public String toString(){
		return "Total Empwage " +companyname + ":" + totalEmpwage;
	}
	public static void main(String[] args) {

		WagecalUC9 jio = new WagecalUC9("jio" , 1000 , 60 , 800);
		WagecalUC9 bsnl = new WagecalUC9("bsnl" , 2000 , 50 , 700);
		jio.calEmpwage();
		System.out.println(jio);
		bsnl.calEmpwage();
		System.out.println(bsnl);
	}

}
