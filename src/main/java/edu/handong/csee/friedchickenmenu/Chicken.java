package edu.handong.csee.friedchickenmenu;
/**
 * This class stores Chicken's name, its price and ratings
 * This class has mName, mPrice and mRatings members
 * mName is String class type, and it stores chicken's name
 * mPrice is integer type, and it has chicken's price value
 * mRatings is integer type and it is ratings of the chicken
 * This class has Constructor, getmName(), setmName(), getmPrice(), setmPrice(), getmRatings(), setmRatings() methods
 * In Constructor, by inputting (String)name, (int)price and (int) ratings, initialize called class
 * getmName() input void and returns mName
 * setmName() input mName to this.mName and returns nothing
 * getmPrice() input void and returns mPrice
 * setmPrice() input mPrice to this.mPrice and returns nothing
 * getmRatings() input void and returns mRatings
 * setmRatings() input mRatings to this.mRatings and returns nothing
 * @author leehyunji0715
 *
 */

public class Chicken {//This is public class named Chicken
	String mName = new String();//Instantiate String class type mname
	int mPrice;//call integer 'mPrice'
	int mRatings;//call integer 'mRatings'
	public Chicken() {//Instantiate Chicken class' instance variable to base value
		mName = "\0";//initialize nName nothing
		mPrice = 0;//initialize nPrice 0
		mRatings = 0;//initialize nRatings 0
	}
	public Chicken(String name,int price,int ratings) {//This is public class named Chicken and input String name, integer price and integer ratings
		this.mName = name;//input name which is String class type to this.mName
		this.mPrice = price;//input price which is integer type to this.mPrice
		this.mRatings = ratings;//input ratings which is integer type to this.mRatings
	}
	public String getmName() {// this is getter which gets mName String value
		return mName;// return mName String
	}
	public void setmName(String nName) {//this is setter which stores nName String to this.mName
		this.mName = nName;//allocate nName String value to this.mName
	}
	public int getmPrice() {// this is getter which gets mPrice integer value
		return mPrice;//return mPrice integer value
	}
	public void setmPrice(int nPrice) {//this is setter which stores nPrice integer to this.mPrice
		this.mPrice = nPrice;//allocate nPrice integer value to this.mPrice
	}
	public int getmRatings() {// this is getter which gets mRatings integer value
		return mRatings;//return mRatings integer value
	}
	public void setmRatings(int nRatings) {//this is setter which stores nRatings integer to this.mRatings
		this.mRatings = nRatings;//allocate nRatings integer value to this.mRatings
	}
	
}
