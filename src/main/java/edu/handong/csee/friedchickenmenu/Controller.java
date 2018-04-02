package edu.handong.csee.friedchickenmenu;

public class Controller {

	public static void main(String[] args) {
		Chicken menu1 = new Chicken("Cheese_mustard",16000,1);
		Chicken menu2 = new Chicken("Honey_mustard",16000,1);
		Chicken menu3 = new Chicken("Spiey_mustard",16000,1);

		menu1.setmRatings(3);
		menu2.setmRatings(4);
		menu3.setmRatings(1);

		menu1.mRatings = menu1.getmRatings();
		menu2.mRatings = menu2.getmRatings();
		menu3.mRatings = menu3.getmRatings();
		System.out.println(menu1.mName+"'s rating is "+menu1.mRatings);
		System.out.println(menu2.mName+"'s rating is "+menu2.mRatings);
		System.out.println(menu3.mName+"'s rating is "+menu3.mRatings);
	}

}
