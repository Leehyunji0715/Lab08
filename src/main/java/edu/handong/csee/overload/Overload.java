package edu.handong.csee.overload;

public class Overload {

	public static void main(String[] args) {
		double average1 = getAverage(40,50);
		double average2 = getAverage(1,2,3);
		char average3 = getAverage('b','d');
		System.out.println(average1);
		System.out.println(average2);
		System.out.println(average3);
	}
	public static double getAverage(double first, double second) {
		return (first+second)/2;
	}
	public static double getAverage(double first, double second,double third) {
		return (first + second + third) / 3.0;
	}
	public static char getAverage(char first, char second) {
		return (char)(((int)first + (int)second)/2);
	}
}
