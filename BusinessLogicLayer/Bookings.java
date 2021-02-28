package BusinessLogicLayer;

/*
* author BrandonFrade
*/

public class Bookings {

    public Client getClient() {
		return clientid;
	}
	public void setClient(Client clientid) {
		this.clientid = clientid;
	}

	localDate eventDay;										//calls the confirmed date of the event
	char type;												//Type of event taking place
	int people;												//How many people will be attending
	Decor Decor = new Decor();
	Venue Venue = new Venue();
	Event Event = new Event(Venue,eventDay, people);

    public Event getEvent() {
		return eventid;
	}
	public void setEvent(Event Eventid) {
		this.eventid = eventid;
	}

	char mealType								//The Meal type of the foods such as how many adultmeals, kidsmeals, etc.
	Decor Decor = new Decor();
	Food Food = new Food(Decor,mealType);

    public Food getFood() {
		return mealID;
	}
	public void setFood(Food mealID) {
		this.mealID = mealID;
	}

	char address											//Venue's address
	Venue Venue = new Venue(Venue,address);

    public Venue getVenue() {
		return venueid;
	}
	public void setVenue(Venue venueid) {
		this.venueid = venueid;
	}

	char decorRequests, decorYN, decorPrice										//Decor type, if its needed and the price 
	Event Event = new Event();
	Decor Decor = new Decor(Event, decorRequests, decornYN, decorPrice);

    public Decor getDecor() {
		return theme;
	}
	public void setDecor(Decor theme) {
		this.theme = theme;
	}
}