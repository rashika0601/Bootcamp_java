public class EmployeWage{
public static void main(String[] args) 
    {
    	System.out.println("Welcome to the Employee Wage Computation program");
    	//decleare 
	    int isPartTime=1; 
		int isFullTime=2; 
		int empRatePerHr=20; 
		int empHrs=0;
		int attendance=(int)(Math.random()*3); 
		int salary=0;
		//checking attandance
		switch(attendance)
		{ 
		//checking part time /full rime
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
		//calculating salary of an employee
		salary=empHrs*empRatePerHr ;

		System.out.println("Salary Of Employee= "+salary );

     }
}
