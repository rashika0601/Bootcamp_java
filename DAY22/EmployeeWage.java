
class EmployeWage{
    static final int IS_PART_TIME=1; 
	static final int IS_FULL_TIME=2; 
	static final int MAX_HRS_IN_MONTH=10; 
	static final int EMP_RATE_PER_HR=20; 
	static final int NUM_WORKING_DAYS=20;
	
	public static int caclEmpWageForCompany(String company,int empRate,int numOfDays,int maxHrs) {
		int empHrs=0, totalEmpHrs=0,totalWorkingDays=0;
		while(totalEmpHrs <= maxHrs && totalWorkingDays < numOfDays) {
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
			 int totalEmpWage=(totalEmpHrs*empRate);
			  System.out.println("Total Emp Wage for Company "+company+" is ="+totalEmpWage );
			 
		return totalEmpWage;
		
	}
public static void main(String[] args) 
    {
	   int totalWage=caclEmpWageForCompany("dmart",20,2,10);    
     }
}