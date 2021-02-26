package BusinessLogicLayer;
//Event
abstract class Event{

    char[] type;        //This might be easier to work with using databases than converting strings
	float price = 5;	//value needs to be decided upon
	Venue eventVenue;
    int people;

    public boolean checkBookingDay(int days){
         if (days > 15)
         {
             return true;
         }
         else return false;
    }
        //this will have the invoice multiply the  price of ordered adult meals by 0.85.

    public boolean checkPeople(int people){
        if (people < 50)
        {
            return true;
        }
        else return false;
        //this will have the invoice multiply the total price by 0.5 if 15 or fewer day remain.
    }

    //Getters and setters
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

    public Venue getEventVenue() {
        return eventVenue;
    }

    public void setEventVenue(Venue eventVenue) {
        this.eventVenue = eventVenue;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
		this.people = people;
	}
}



