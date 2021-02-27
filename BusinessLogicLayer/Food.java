package BusinessLogicLayer;

public class Food {
    
    int noCourses; // ask for the number of food courses the client wants
    String courseDescr; // description of the food cource
    double coursePrice; // Price per course
    double totalPrice; // Total Price
    double foodDiscount = 0.15; // Discount on Adult food course is 15% if more than 40 people

    public int getNoCourses() {
        return noCourses;
    }

    public void setNoCourses(int noCourses) {
        this.noCourses = noCourses;
    }

    public String getCourseDescr() {
        return courseDescr;
    }

    public void setCourseDescr(String courseDescr) {
        this.courseDescr = courseDescr;
    }

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getFoodDiscount() {
		return foodDiscount;
	}

	public void setFoodDiscount(double foodDiscount) {
		this.foodDiscount = foodDiscount;
	}

}
