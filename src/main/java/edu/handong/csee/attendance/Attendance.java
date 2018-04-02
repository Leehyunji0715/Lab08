package edu.handong.csee.attendance;
import java.util.Random;

public class Attendance {
	Random randomGen = new Random();
	String mName;
	int mGrade, mRandAbsence=randomGen.nextInt(11);
	long mStrudentNumber;
	public Attendance() {
		mName="\0";
		mGrade = 0;
		mStrudentNumber =0;
	}
	public Attendance(String name, int grade, long studentNumber) {
		this.mName = name;
		this.mGrade = grade;
		this.mStrudentNumber = studentNumber;
	}
	void printResult() {
		if(mRandAbsence>=6) {
			System.out.println("I’m sorry, "+ mName + ". You failed this course");
		}
		else {
			System.out.println("Congratulation "+mName+"! you passed this course!");
		}
	}
}

