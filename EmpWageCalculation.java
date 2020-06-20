import java.util.*;

class Employee
{
        public int empHours;
        public int totalWorkingDays;
        public int totalWorkingHours;
        public int salaryPerDay;
        public int totalWage;
        public int workingDays;
        public int workingHours;
        public int empRate;
        public int fullTimeHours;
        public int partTimeHours;
        public Employee(int workingDays,int workingHours, int empRate, int fullTimeHours, int partTimeHours)
        {
            this.workingDays=workingDays;
            this.workingHours=workingHours;
            this.empRate=empRate;
            this.fullTimeHours=fullTimeHours;
            this.partTimeHours=partTimeHours;
            this.empHours=0;
            this.totalWorkingDays=1;
            this.totalWorkingHours=0;
            this.salaryPerDay=0;
            this.totalWage=0;
        }
        public int calcEmpWage()
        {

                        while(totalWorkingDays<=workingDays && totalWorkingHours<=workingHours)
                        {
                                int jobType=(int)(Math.random()*3);
                                switch(jobType)
                                {
                                        case 1:
                                                totalWorkingHours+=fullTimeHours;
                                                salaryPerDay=fullTimeHours*empRate;
                                                totalWorkingDays++;
                                                break;
                                        case 2:
                                                totalWorkingHours+=partTimeHours;
                                                salaryPerDay=partTimeHours*empRate;
                                                totalWorkingDays++;
                                                break;
                                        case 0:
                                                salaryPerDay=0;
                                                break;
                                }
                                totalWage+=salaryPerDay;   
                        }
            return totalWage;
        }
        public void display()
        {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("The total working hours of employee is " +totalWorkingHours);
            System.out.println("The total salary for employee is " +totalWage);
            System.out.println("--------------------------------------------------------------------");
        }
        
}
    public class EmpWageCalculation
    {
        public static void main(String args[])
        {
            HashMap<String,Integer> companies=new HashMap<>();

            System.out.println("Enter the number of companies");
            Scanner scanner=new Scanner(System.in);
            int numberOfCompanies=scanner.nextInt();
            for(int i=0;i<numberOfCompanies;i++){
                System.out.println("Enter the wage per hour");
                int empRate=scanner.nextInt();
                System.out.println("Enter the total number of working days");
                int workingDays=scanner.nextInt();
                System.out.println("Enter the total number of working hours");
                int workingHours=scanner.nextInt();
                System.out.println("Enter the fullTime hours");
                int fullTimeHours=scanner.nextInt();
                System.out.println("Enter the parttime hours");
                int partTimeHours=scanner.nextInt();
                System.out.println("Enter the name of the company");
                String CompanyName=scanner.next();
                Employee comp=new Employee(workingDays, workingHours, empRate, fullTimeHours, partTimeHours);
                comp.calcEmpWage();
                companies.put(CompanyName,comp.calcEmpWage());
            }
    
            System.out.println(companies);

	    System.out.println("Enter the name of the company to search");
            String searchEnterprise=scanner.next();

            if(companies.containsKey(searchEnterprise))
            {
                System.out.println("Daily Wage of: "+searchEnterprise+" is Rs."+companies.get(searchEnterprise));
            }
            else
            {
                System.out.println("No such company");
            }
        }
    }
    
