package edu.handong.csee.friedchickenmenu;

public class Controller {

	public static void main(String[] args) {
		Chicken menu1 = new Chicken();
		Chicken menu2 = new Chicken();
		Chicken menu3 = new Chicken();
		menu1.setmName("Cheese_mustard");
		menu2.setmName("Honey_mustard");
		menu3.setmName("Spiey_mustard");
		menu1.setmPrice(16000);
		menu2.setmPrice(16000);
		menu3.setmPrice(16000);
		menu1.setmRatings(3);
		menu2.setmRatings(4);
		menu3.setmRatings(1);
		menu1.mName = menu1.getmName();
		menu2.mName = menu2.getmName();
		menu3.mName = menu3.getmName();
		menu1.mPrice = menu1.getmPrice();
		menu2.mPrice = menu2.getmPrice();
		menu3.mPrice = menu3.getmPrice();
		menu1.mRatings = menu1.getmRatings();
		menu2.mRatings = menu2.getmRatings();
		menu3.mRatings = menu3.getmRatings();
		System.out.println(menu1.mName+"'s rating is "+menu1.mRatings);
		System.out.println(menu2.mName+"'s rating is "+menu2.mRatings);
		System.out.println(menu3.mName+"'s rating is "+menu3.mRatings);
	}

}
