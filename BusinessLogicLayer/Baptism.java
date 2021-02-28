package BusinessLogicLayer;

class Baptism extends Event{

    //private String myString = "Baptism";
    private String type = "Baptism";      //This might be easier to work with using databases than converting strings
    private float price;

    
    public Baptism(Venue eventVenue, int people) {
        super(eventVenue, people);
    //    this.setType(toCharArray());
        this.price = 10;	//value needs to be decided upon
	}

    /*
    public char[] toCharArray(){    //  <- This converts a string to char[]
        return this.myString.toCharArray();
    }
    */

    // getters and setters:

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
