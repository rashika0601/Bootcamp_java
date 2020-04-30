
public class Empdailywage {
			
	public static void main(String[] args){
	
		System.out.println("Welcome to the Employee wage computation Program");
	int attendance=(int)(Math.random()*2); 
		int salary; 
                int empRatePerHr=20; 
	        int empHrs=8; 
		if (attendance == 1) 
                  salary=empHrs*empRatePerHr ; 
	        else
		  salary=0;
                    
                System.out.println("Daily Wage of an Employee= " +salary);    
     }
}

		
