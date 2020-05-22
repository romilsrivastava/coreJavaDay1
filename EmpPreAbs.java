public class EmpPreAbs {
	public static void main(String[] args) {
		int isFullTime=1;
		double randomc=Math.floor(Math.random() * 10) % 2;
		if ( isFullTime == randomc )
			System.out.println(" employee is present ");
		else
			System.out.println(" employee is absent ");
	}
}
