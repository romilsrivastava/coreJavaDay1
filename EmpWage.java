public class EmpWage{
	public static final int parttime = 1;
	public static final int fulltime = 2;

	private final String companyname;
	private final int emprateperhour;
	private final int workingdays;
	private final int maxhourspermonth;

	public EmpWage(String companyname,int emprateperhour,int workingdays,int maxhourspermonth){
		this.companyname = companyname;
		this.emprateperhour = emprateperhour;
		this.workingdays = workingdays;
		this.maxhourspermonth = maxhourspermonth;

	}
	private int calculateTotalEmpwage(){
		int hrs=0 , int totalhrs=0, int totalworkingdays=0;
		while(totalhrs<=maxhourspermonth && totalworkingdays<workingdays){
			totalworkingdays++;
			int empcheck = (int) Math.floor(Math.random()*10)%3;
			switch(empcheck){
				case partitme:
					hrs=4;
					break;
				case fulltime:
					hrs=8;
					break;
				default:
					hrs=0;
			}
			totalhrs += hrs;
			System.out.println("Day :" + totalworkingdays + " " + "Emphrs :" + hrs );
		}
		return totalhrs * emprateperhour;
	}
	public static void main(String[] args) {
		
		EmpWage Bsnl = new EmpWage("Bsnl" , 100 , 20 , 100);
		EmpWage Airtel = new EmpWage("Airtel" , 200 , 24 , 100);
		System.out.println("Total Empwage for " + Bsnl.companyname + ":" + Bsnl.calculateTotalEmpwage());
		System.out.println("Total Empwage for " + Airtel.company_name + ":" + Airtel.calculateTotalEmpwage());
	}

} 
