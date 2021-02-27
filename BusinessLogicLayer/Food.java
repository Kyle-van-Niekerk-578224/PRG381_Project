package BusinessLogicLayer;


public class Food {
    
    int noCourses; // ask for the number of courses the client wants
    String courseDescr; // description of the cource
    float coursePrice; // Price per course
    float totalPrice; // Total Price

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

    public float getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(float coursePrice) {
        this.coursePrice = coursePrice;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

}
