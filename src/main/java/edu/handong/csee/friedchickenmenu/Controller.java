package edu.handong.csee.friedchickenmenu;
/**
 * This class is for operating 'Chicken'class and shows chickens' name and their ratings
 * This class has main() method
 * @author leehyunji0715
 *
 */
public class Controller {//This class is public named Controller

	public static void main(String[] args) {//This is main method
		Chicken menu1 = new Chicken("Cheese_mustard",16000,1);//Instantiate Chicken class named menu1 and initialize with "Cheese_mustard",16000,1 
		Chicken menu2 = new Chicken("Honey_mustard",16000,1);//Instantiate Chicken class named menu2 and initialize with "Honey_mustard",16000,1
		Chicken menu3 = new Chicken("Spicey_mustard",16000,1);//Instantiate Chicken class named menu3 and initialize with "Spicey_mustard",16000,1

		menu1.setmRatings(3);//input rating value(3) to menu1's this.mRatings
		menu2.setmRatings(4);//input rating value(4) to menu2's this.mRatings
		menu3.setmRatings(1);//input rating value(1) to menu3's this.mRatings

		menu1.mRatings = menu1.getmRatings();//give rating value(3) to menu1.mRatings
		menu2.mRatings = menu2.getmRatings();//give rating value(4) to menu2.mRatings
		menu3.mRatings = menu3.getmRatings();//give rating value13) to menu3.mRatings
		System.out.println(menu1.mName+"'s rating is "+menu1.mRatings);//print out menu1's name and its own rating
		System.out.println(menu2.mName+"'s rating is "+menu2.mRatings);//print out menu2's name and its own rating
		System.out.println(menu3.mName+"'s rating is "+menu3.mRatings);//print out menu3's name and its own rating
	}

}
