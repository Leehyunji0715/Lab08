package edu.handong.csee.attendance;

public class Controller {

	public static void main(String[] args) {
	Attendance student1 = new Attendance("Jess",4,21400999);
	Attendance student2 = new Attendance("Kent",2,21700111);
	Attendance student3 = new Attendance("Lucas",1,21833222);
	Attendance student4 = new Attendance("Martha",2,21733444);
	student1.printResult();
	student2.printResult();
	student3.printResult();
	student4.printResult();

	}

}
