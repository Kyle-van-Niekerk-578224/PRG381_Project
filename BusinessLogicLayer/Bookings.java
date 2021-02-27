package BusinessLogicLayer;

/*
 *
 * author BrandonFrade 
*/

public class Bookings {

    public Client getClient() {
		return clientid;
	}
	public void setClient(Client clientid) {
		this.clientid = clientid;
	}

    public Event getEvent() {
		return eventid;
	}
	public void setEvent(Event Eventid) {
		this.eventid = eventid;
	}

    public Food getFood() {
		return mealtype;
	}
	public void setFood(Food mealtype) {
		this.mealtype = mealtype;
	}

    public Venue getVenue() {
		return venueid;
	}
	public void setVenue(Venue venueid) {
		this.venueid = venueid;
	}

    public Decor getDecor() {
		return theme;
	}
	public void setDecor(Decor theme) {
		this.theme = theme;
	}
}
