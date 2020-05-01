public class EmployeWage{
public static void main(String[] args) 
    {
    	System.out.println("Welcome to the Employee Wage Computation program");
    	//declartion
	     private static final int IS_PART_TIME=1;
		 private static final int IS_FULL_TIME=2;
		 private static final int MAX_HRS_IN_MONTH=100; 
		 private static final int EMP_RATE_PER_HR=20; 
		 private static final int NUM_WORKING_DAYS=20;
		 private static final int totalEmpHr=0; 
		 private static final int totalWorkingDays=0;
		//check the condition if the employee are working maxm_hrs & no.of working day

		while(totalEmpHr <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS)
		{
			totalWorkingDays++; 
			//checking attandance
			int attendance=(int)(Math.random()*3); 
			int empHrs=0;
			switch(attendance) 
			{ case 1:
				empHrs=8; 
				break; 
			case 2:
				empHrs=4;
				break;
			default:
				empHrs=0;
				break; 
			} 
			totalEmpHr=(totalEmpHr+empHrs); 
		} 
		//calculating salary of an employee
		int totalSalary=(totalEmpHr*EMP_RATE_PER_HR);
		System.out.println("Salary Of Employee= "+totalSalary );

     }
}
