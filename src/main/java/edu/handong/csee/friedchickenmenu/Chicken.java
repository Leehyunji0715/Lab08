package edu.handong.csee.friedchickenmenu;

public class Chicken {
	String mName = new String();
	int mPrice;
	int mRatings;
	public Chicken() {
		mName = "\0";
		mPrice = 0;
		mRatings = 0;
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
