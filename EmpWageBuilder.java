//EmpLoyee Wage Builder

public class EmpWageBuilder {

	public static void main(String args[]) {

		//constant
		int is_full_time = 1;
		int is_part_time = 2;
		int empRatePerHr = 20;

		//variables
		int empHours = 0;
		int empWage = 0;

		//Generate random value to check employee do work full time, part time or absent
		double empcheck = Math.floor(Math.random()*10) % 3;

		//Condition statement switch case
		switch(empcheck){
			case is_full_time:
				empHours = 8;
				break;
			case is_part_time
				empHours = 4;
				break;
			default:
				empHours = 0;
		}
		//Calculat employee wage
		empWage = empHours * empRatePerHr;
		System.out,println("Employee Wage : " + empWage);
	}
}
