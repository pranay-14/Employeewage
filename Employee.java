import java.util.*;

public class Employee
{
	static int getWorkHours()
	{
		int empHours;
		int jobType=((int)(Math.random()*3 + 1));
		if(jobType==1)
		{
			empHours=8;
		}
		else if(jobType==2)
		{
			empHours=4;
		}
		else
		{
			empHours=0;
		}
	return empHours;
	}
	public static void main(String args[])
	{
		int wagePerHour=20;
		int isFullTime=1;
		int totalWage=0;
		int salaryPerDay=0;
		int totalWorkingHours=0;
		int totalDays=1;
		System.out.println("Welcome to Employee Wage calculation");
		while(totalWorkingHours<100 && totalDays<=20)
		{
         		int eHours=getWorkHours();
			salaryPerDay=eHours*wagePerHour;
			totalWorkingHours+=eHours;
			totalWage+=salaryPerDay;
			System.out.println("The salary on " + totalDays + " is " +salaryPerDay);
			totalDays++;		}
	System.out.println("The total month salary is given as : " +totalWage);
	System.out.println("The sum of total working hours is : " +totalWorkingHours);
	}
}
