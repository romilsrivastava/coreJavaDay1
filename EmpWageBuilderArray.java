public class EmpWageBuilderArray{
	public static final int PartTime = 1;
	public static final int FullTime = 2;

	private int numOfCompany = 0;
	private int CompanyEmpUC10();
	private companyEmpwageArray;

	public EmpWageBuilderArray(){
		companyEmpwageArray = new CompanyEmpUC10[5];
	}

	private void addCompanyEmpWage(String companyname,int emprateperhour,int workingdays,int maxhourspermonth){
		companyEmpwageArray[numOfCompany] = new CompanyEmpUC10[companyname , emprateperhour , workingdays , maxhourspermonth ];
		numOfCompany++;
	}
	private void computeEmpwage(){
		for(int i = 0; i < numOfCompany; i++){
			companyEmpwageArray[i].settotalEmpwage(this.computeEmpwage(companyEmpwageArray[i]));
			System.out.println(companyEmpwageArray[i]);
		}
	}
	private int computeEmpwage(CompanyEmpUC10 companyEmpUC10){
		int hrs=0 , totalhrs=0, totalworkingdays=0;
		while(totalhrs<=maxhourspermonth && totalworkingdays<workingdays){
			totalworkingdays++;
			int empcheck = (int) Math.floor(Math.random()*10)%3;
			switch(empcheck){
				case Part_Time:
					hrs=4;
					break;
				case Full_Time:
					hrs=8;
					break;
				default:
					hrs=0;
			}
			totalhrs += hrs;
			System.out.println("Day :" + totalworkingdays + " " + "Emphrs :" + hrs );
		}
		return totalhrs * companyEmpwageUC10.emp_rate_per_hour;
	}
	public static void main(String[] args){
		EmpwageBuilderArray empwagrbuilder = new EmpwageBuilderArray();
		empwagrbuilder.addCompanyEmpWage["bsnl",40,21,400];
		empwagrbuilder.addCompanyEmpWage["Sephora",60,86,600];
		empwagrbuilder.computeEmpwage();

	}

}
