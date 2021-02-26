package BusinessLogicLayer;

class YearEnd extends Event{

    private String myString = "Year-End Function";
    private char[] type;      //This might be easier to work with using databases than converting strings
    private float price;

    public YearEnd(Venue eventVenue, int people) {
        super(eventVenue, people);
        this.setType(toCharArray());
        this.price = 11;	//value needs to be decided upon
	}

    public char[] toCharArray(){    //  <- This converts a string to char[]
        return this.myString.toCharArray();
    }


    // getters and setters:

    public char[] getType() {
        return type;
    }

    public void setType(char[] type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
