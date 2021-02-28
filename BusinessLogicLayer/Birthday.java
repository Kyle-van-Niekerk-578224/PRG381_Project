package BusinessLogicLayer;

class Birthday extends Event{

//    private String myString = "Birthday";
    private String type = "Birthday";      //This might be easier to work with using databases than converting strings
    private float price;

    public Birthday(Venue eventVenue, int people) {
        super(eventVenue, people);
//        this.setType(toCharArray());
        this.price = 11;	//value needs to be decided upon
	}


    // getters and setters:

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
