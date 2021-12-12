package data_with_method;

public class User {
	private final static String REGEX_RRN = "(.{6}$)";

	private final String name;
	private final String rrn;

	public User(final String name, final String rrn) {
		this.name = name;
		this.rrn = rrn;
	}

	public String getName() {
		return name;
	}

	public String getRrn() {
		return rrn;
	}

	public String getRrnWithOutMask() {
		return rrn;
	}


	public static String maskSSN(String rrn) {
		if (rrn == null || "".equals(rrn) || rrn.length() < 6)
			return rrn;
		return rrn.replaceAll(REGEX_RRN, "******");
	}

}
