/******
Author: Filippo Zallocco
Date: 2/28/2023
Subject: Java code for power calculation

In this file, I import the util class to create two scanner objects and fetch user inputs, which I later use as parameters for the power function I define in the Power class. The program works with both integer and decimal inputs; however, the program returns only double data type outputs for the sake of simplicity. In case I review my code and find a more elegant solution to the output, I will replace this file with a new one. Please share your feedback!
******/
import java.util.*;

class Power{

	int Base, Exponent;

	Power() {}

	Power(int Base, int Exponent) {this.Base=Base; this.Exponent=Exponent;}

	public double Mypower(int base, int exp){

		if(exp>=0){

			int Prod=1;
			for(int a=0; a<exp; a++){
		
				Prod*=base;
		
			}//end of loop

			double Myprod=Prod;
			return Myprod;

		}//end of if
		else{

			double Ratio=1.00;
			int Prod=1;
			exp*=-1;
			float Base=(float)base;
			for(int a=0; a<exp; a++) {

				Prod*=base;

			}//end of loop

			Ratio=Ratio/Prod;
			return Ratio;
		}//end of else

	}//end of Mypower

	public static void main(String[] args){

		System.out.println("Enter base /return/ exponent:\n");
		Scanner scOne = new Scanner(System.in);
		Scanner scTwo = new Scanner(System.in);
		int base=scOne.nextInt();
		int exponent=scTwo.nextInt();

		Power pw = new Power();

		double power = pw.Mypower(base, exponent);

		System.out.println("Power is : " + power);
	
	}//end of main

}//end of class
