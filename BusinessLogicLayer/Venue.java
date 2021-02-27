package BusinessLogicLayer;
//Venue
public class Venue{
	private char[] name;
	private char[] address;
	private char[] number;
	int venueID;

	//This class only contains getters and setters

	public char[] getName() {
		return name;
	}

	public void setName(char[] name) {
		this.name = name;
	}

	public char[] getAddress() {
		return address;
	}

	public void setAddress(char[] address) {
		this.address = address;
	}

	public char[] getNumber() {
		return number;
	}

	public void setNumber(char[] number) {
		this.number = number;
	}

	public int getVenueID() {
		return venueID;
	}

	public void setVenueID(int venueID) {
		this.venueID = venueID;
	}
	
}