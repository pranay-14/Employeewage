import java.util.*;

public class Employee
{
	public static void main(String args[])
	{
		int wagePerHour=20, workHours=8;
		int isFullTime=1;
		int totalWage=0;
		int salaryPerDay=0;
		int partTimeWorkHours=4;
		int totalWorkingHours=0;
		System.out.println("Welcome to Employee Wage calculation");
		for(int day=1;day<=20;day++)
		{
			while(totalWorkingHours<100)
			{
				int jobType=((int)(Math.random()*3 + 1));
                		switch(jobType)
				{
				case 3:
					System.out.println("Employee is absent");
					salaryPerDay=0;
					totalWorkingHours+=0;
					break;
				case 2:
					System.out.println("Employee is a part time");
	                        	salaryPerDay = wagePerHour * partTimeWorkHours;
        	                	System.out.println("Salary of Employee per day is : " + salaryPerDay);
					totalWorkingHours+=partTimeWorkHours;
					break;
				case 1:
					System.out.println("Employee is Full time Employee");
        	                	salaryPerDay = wagePerHour * workHours;
	                        	System.out.println("Salary of Employee per day is : " + salaryPerDay);
					totalWorkingHours+=workHours;
					break;
				}
				totalWage+=salaryPerDay;
			}
		}
	System.out.println("The total month salary is given as : " +totalWage);
	System.out.println("The sum of total working hours is : " +totalWorkingHours);
	}
}
