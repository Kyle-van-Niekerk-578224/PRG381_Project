package BusinessLogicLayer;
/*
* author BrandonFrade
*/

//Client
public class Client{
	private char[] clientid;
	private char[] name;
	private char[] surname;
	private char[] phoneNumber;
	private char[] email;
	private char[] bankDetails;
	private char[] address;

	//This class only contains getters and setters

	public char[] getClient() {								// Gets the clientid
	return clientid;
}

	public void setClient(char[] clientid) {
	this.clientid = clientid;
}

	public char[] getName() {								// Gets the client's name
		return name;
	}

	public void setName(char[] name) {
		this.name = name;
	}

	public char[] getSurname() {							// Gets the client's Surname
		return surname;
	}

	public void setSurname(char[] surname) {
		this.surname = surname;
	}

	public char[] getNumber() {								// Gets the client's Phone Number
		return phoneNumber;
	}

	public void setNumber(char[] phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public char[] getEmail() {								// Gets the client's Email address
		return email;
	}

	public void setEmail(char[] email) {
		this.email = email;
	}

	public char[] getBank() {								// Gets the client's Bank Details
		return bankDetails;
	}

	public void setBank(char[] bankDetails) {
		this.bankDetails = bankDetails;
	}

	public char[] getAddress() {							// Gets the client's Physical Address
		return address;
	}

	public void setAddress(char[] address) {
		this.address = address;
	}
}