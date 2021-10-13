//EmpLoyee Wage Builder

public class EmpWageBuilder {
	//constant
	public static final int is_full_time = 1;
	public static final int is_part_time = 2;
	public static final int empRatePerHr = 20;
	public static final int numOfWorkingday = 2;
	public static final int maxHrInMonth = 100;
	//main method
	public static void main(String args[]) {

		//variables
		int empHours = 0;
		int empWage = 0;
		int totalWorkingDay = 0;
		int totalEmpHours = 0;

		while (totalEmpHours <= maxHrInMonth && totalWorkingDay < numOfWorkingDay){
			tottalWorkingDay++;
			//Generate random value to check employee do work full time, part time or absent
			double empcheck = Math.floor(Math.random()*10) % 3;

			//Condition statement switch case
			switch(empcheck){
				case is_full_time:
					empHours = 8;
					break;
				case is_part_time:
					empHours = 4;
					break;
				default:
					empHours = 0;
			}

			//Calculat employee wage
			empWage = empHours * empRatePerHr;
			System.out,println("Employee Wage : " + empWage);
			totalEmpWage += empWage;
			
			totalEmpHours += empHours;
			System.out.println("Working day : " + totalWorkingDay + " and Employee Hours : " + empHours)
		}
		System.out.println("Monthly Wage Of Employee : " + totalEmpWage);
		int totalEmpWage = totalEmpHours * empRatePerHour;
		System.out.println("Monthly Employee Wage is " + totalEmpWage);
	}
}
