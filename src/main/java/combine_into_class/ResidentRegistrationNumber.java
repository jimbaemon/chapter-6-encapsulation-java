package combine_into_class;

public class ResidentRegistrationNumber {
	private final static String REGEX_RRN = "(.{6}$)";

	private final String number;

	public ResidentRegistrationNumber(final String number) {
		this.number = number;
	}

	public String number(){
		return number;
	}

	public String numberWithMask() {
		return number.replaceAll(REGEX_RRN, "******");
	}
}
