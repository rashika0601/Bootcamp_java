
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

public class EmployeWage{

public static void main(String[] args) 
    {
     System.out.println("Welcome to the Employee wage computation");    	
     // decleartion
	int attendance=(int)(Math.random()*2); 
	int salary; 
    int empRatePerHr=20; 
	int empHrs=8; 
	// Checking attandance
		if (attendance == 1) 
			// Calculating salary according to attandance and working hrs and rate per hrs
            salary=empHrs*empRatePerHr ; 
	        else
		  salary=0;
                    
                System.out.println("Daily Wage of an Employee= " +salary);    
     }

     static final int IS_PART_TIME=1; 
	static final int IS_FULL_TIME=2; 
	
	private final String company;
	private final int empRatePerHour; 
	private final int maxHoursPerMonth; 
	private final int numOfWorkingDays;
	
	
	public EmployeWage(String company, int empRatePerHour, int maxHoursPerMonth, int numOfWorkingDays)
        {
	
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.maxHoursPerMonth = maxHoursPerMonth;
		this.numOfWorkingDays = numOfWorkingDays;
	}

         private int computeEmpWage() 
           {
		int empHrs=0, totalEmpHrs=0,totalWorkingDays=0;
		while(totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays)
                {
			 totalWorkingDays++; 
			 int attendance=(int)(Math.random()*3); 
			 switch(attendance) 
			 { case IS_FULL_TIME:empHrs=8;
			 break; 
			 case IS_PART_TIME:empHrs=4;
			 break;
			 default:empHrs=0; 
			 break; 
			 } 
			 totalEmpHrs=(totalEmpHrs+empHrs); 
			 System.out.println("Days= "+ totalWorkingDays+ " Emp Hr: "+empHrs);
		}
			
			 
		return totalEmpHrs*empRatePerHour;
		
	}
	
	public static void main(String[] args)
        {
		EmployeWage  dmart=new EmployeWage("Dmart",20,2,10);
		System.out.println("Total Employee Wage for Company "+ dmart.company+" is: "+dmart.computeEmpWage());
                EmployeWage  reliance=new EmployeWage("Reliance",10,2,20);
		System.out.println("Total Employee Wage for Company "+ reliance.company+" is: "+reliance.computeEmpWage());
  }
}


