package com.employeewage;

public class EmpWageBuilderIf {
	/**
	 * 
	 * UC3 To Calculate Part time Employee and Wage
	 */
	public static void main(String[] args) {
		// Constants
		int IS_PART_TIME = 1; // Employee is part time present
		int IS_FULL_TIME = 20; // Employee is fulltime present
		int EMP_RATE_PER_HOUR = 20; // Part time rate of theemployee
		// Variables
		int empHrs = 0;
		int empWage = 0;
		// Computation
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == IS_PART_TIME)
			empHrs = 4;
		else if (empCheck == IS_FULL_TIME)
			empHrs = 8;
		else
			empHrs = 0;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);
	}
}
