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
        public Employee(int workingDays,int workingHours, int empRate)
        {
            this.workingDays=workingDays;
            this.workingHours=workingHours;
            this.empRate=empRate;
            this.empHours=0;
            this.totalWorkingDays=1;
            this.totalWorkingHours=0;
            this.salaryPerDay=0;
            this.totalWage=0;
        }
        public void calcEmpWage()
        {

                        while(totalWorkingDays<=workingDays && totalWorkingHours<=workingHours)
                        {
                                int jobType=(int)(Math.random()*3);
                                //System.out.println(jobType);
                                switch(jobType)
                                {
                                        case 1:
                                                empHours=8;
                                                break;
                                        case 2:
                                                empHours=4;
                                                break;
                                        case 0:
                                                empHours=0;
                                                break;
                                }
                                totalWorkingHours+=empHours;
                                salaryPerDay=empHours*empRate;
                                totalWage+=salaryPerDay;
                                totalWorkingDays++;
                        }
                
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
                Employee DMART = new Employee(20,100,20);
                Employee RELIANCE = new Employee(10,40,4);
                DMART.calcEmpWage();
                RELIANCE.calcEmpWage();
                DMART.display();
                RELIANCE.display();
        }
    }
    
