package BusinessLogicLayer;

public class Food {
    
	int mealID;	//ID of the meal type
	String mealType;	//States whether it is adults meal, or kids meal, etc
	String mealChoice;	//Sub devision of mealtype eg. Hamburgers and chips
	double mealPrice;	//price of the mealChoice for 1 Person
	double foodDiscount = 0.15;

	public int getMealID() {
		return mealID;
	}

	public void setMealID(int mealID) {
		this.mealID = mealID;
	}

	public String getMealType() {
		return mealType;
	}

	public void setMealType(String mealType) {
		this.mealType = mealType;
	}

	public double getMealPrice() {
		return mealPrice;
	}

	public void setMealPrice(double mealPrice) {
		this.mealPrice = mealPrice;
	}

	public double getFoodDiscount() {
		return foodDiscount;
	}

	public void setFoodDiscount(double foodDiscount) {
		this.foodDiscount = foodDiscount;
	}

	public String getMealChoice() {
		return mealChoice;
	}

	public void setMealChoice(String mealChoice) {
		this.mealChoice = mealChoice;
	}

}
