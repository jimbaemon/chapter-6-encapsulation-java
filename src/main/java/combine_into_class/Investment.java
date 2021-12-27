package combine_into_class;

public class Investment {
	private final User user;
	private final int amount;
	private final int price;

	public Investment(final User user, final int amount, final int price) {
		this.user = user;
		this.amount = amount;
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public int getPrice() {
		return price;
	}

	public String getInvestment(){
		StringBuilder sb = new StringBuilder();
		sb.append("사용자 정보 : ");
		sb.append(user.getName());
		sb.append("(").append(user.residentRegistrationNumberWithMask()).append(") ");
		sb.append("투자 구좌 : ").append(amount).append(", ");
		sb.append("투자 금액 : ").append(price);
		return sb.toString();
	}
}
