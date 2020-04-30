
public class Empdailywage {
			
	public static void main(String[] args){
	
		System.out.println("Welcome to the Employee wage computation Program");
	    int isPartTime=1; 
		int isFullTime=2; 
		int empRatePerHr=20; 
		int empHrs=0;
		int attendance=(int)(Math.random()*3); 
		int salary=0;

		switch(attendance)
		{ 
		case 1:
			empHrs=8; 
		  break;
		case 2: 
			empHrs=4; 
			break;
		default: 
			empHrs=0; 
			break; 
		}

		salary=empHrs*empRatePerHr ;

		System.out.println("Salary Of Employee= "+salary );

     }
}
		
