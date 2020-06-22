import java.util.*;

interface companyName
{
        public int calcEmpWage(int workingHours, int workingDays, int empRate);
        public void display();
}

class employeeName implements companyName
{
        public int totalWorkingDays=1;
        public int totalWorkingHours=0;
        public int salaryPerDay=0;
        public int totalWage=0;
        public int fullTimeHours=8;
        public int partTimeHours=4;
    public int calcEmpWage(int workingHours, int workingDays, int empRate)
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

public class EmpWageCalculationInterface 
{
        
    public static void main (String args[])
    {
        companyName DMART = new employeeName();
        DMART.calcEmpWage(100,20,8);
        DMART.display();
    }    
}
