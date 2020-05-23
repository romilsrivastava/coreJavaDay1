public class empWageRefactor {
   public static final int fulltimehour = 1;
	public static final int parttimehour = 2;
	public static final int emprateperhour = 20;
	public static final int workingdays = 20;
	public static final int maxworkingdays = 100;

	public static void main(String[] args) {
      empwageCalc();
   }

	static void empwageCalc() {
		int empHrs = 0, empWage = 0, totalEmpWage = 0, totalWorkingDays = 0, totalEmpHrs = 0;
		while (totalEmpHrs <= maxworkingdays && totalWorkingDays < workingdays) {
			totalWorkingDays++;
		int empCheck = (int)(Math.random() * 10) %3;
		switch (empCheck) {
				case 1:
					System.out.println("Employee is Present");
					empHrs = 8;
					break;
				case 2:
					System.out.println("Employee is Present");
					empHrs = 4;
					break;
				default:
					System.out.println("Employee is Absent");
					empHrs = 0;
					break;
				}
		empWage = empHrs * emprateperhour;
		totalEmpWage += empWage;
		System.out.println("Emp Wage: " + empWage);
		}
		System.out.println("totalwage: " + totalEmpWage);
	}
}
