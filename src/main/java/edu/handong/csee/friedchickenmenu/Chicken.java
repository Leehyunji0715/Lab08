package edu.handong.csee.friedchickenmenu;

public class Chicken {
	String mName = new String();
	int mPrice;
	int mRatings;
	public Chicken(String Name,int Price,int Ratings) {
		this.mName = Name;
		this.mPrice = Price;
		this.mRatings = Ratings;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String nName) {
		this.mName = nName;
	}
	public int getmPrice() {
		return mPrice;
	}
	public void setmPrice(int mPrice) {
		this.mPrice = mPrice;
	}
	public int getmRatings() {
		return mRatings;
	}
	public void setmRatings(int mRatings) {
		this.mRatings = mRatings;
	}
	
}
