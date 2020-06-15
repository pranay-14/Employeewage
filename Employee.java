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
		System.out.println("Welcome to Employee Wage calculation");
		for(int day=1;day<=20;day++)
		{
				int jobType=((int)(Math.random()*3 + 1));
                		switch(jobType)
				{
				case 3:
					System.out.println("Employee is absent");
					salaryPerDay=0;
					break;
				case 2:
					System.out.println("Employee is a part time");
	                        	salaryPerDay = wagePerHour * partTimeWorkHours;
        	                	System.out.println("Salary of Employee per day is : " + salaryPerDay);
					break;
				case 1:
					System.out.println("Employee is Full time Employee");
        	                	salaryPerDay = wagePerHour * workHours;
	                        	System.out.println("Salary of Employee per day is : " + salaryPerDay);
					break;
				}
			totalWage+=salaryPerDay;
		}
	System.out.println("The total month salary is given as : " +totalWage);
	}
}
