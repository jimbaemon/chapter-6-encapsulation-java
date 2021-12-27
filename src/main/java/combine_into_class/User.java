package combine_into_class;

public class User {
	private final String name;
	private final ResidentRegistrationNumber residentRegistrationNumber;

	public User(final String name, final String rrn) {
		this.name = name;
		residentRegistrationNumber = new ResidentRegistrationNumber(rrn);
	}

	public String getName() {
		return name;
	}

	public String residentRegistrationNumber() {
		return residentRegistrationNumber.number();
	}

	public String residentRegistrationNumberWithMask(){return residentRegistrationNumber.numberWithMask();}

}
