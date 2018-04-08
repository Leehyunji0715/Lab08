package edu.handong.csee.attendance;
import java.util.Random;//Import java.util.Random to use random integer 0 to 10
/**
 * This class shows student's status about a course
 * This class has mName, mGrade, mRandAbsence members
 * mName is String class type and stands for student's name
 * mGrade is integer and this is student's grade
 * mRandAbsence is integer which stands for student's number of absence
 * This class has Constructor and printResult() method
 * Constructor
 * printResult()
 * @author leehyunji0715
 *
 */
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
			System.out.println(mName + ". You didn't attend class "+mRandAbsence+" times\n");
		}
		else {
			System.out.println("Congratulation "+mName+"! you passed this course!");
			System.out.println(mName + ". You didn't attend class "+mRandAbsence+" times\n");
		}
	}
}

