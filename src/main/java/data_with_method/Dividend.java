package data_with_method;

public class Dividend {
	private final User user;
	private final Investment investment;
	private final int amount;
	private final int price;

	public Dividend(final User user, final Investment investment, final int amount, final int price) {
		this.user = user;
		this.investment = investment;
		this.amount = amount;
		this.price = price;
	}

	public String getDividend(){
		StringBuilder sb = new StringBuilder();
		sb.append("사용자 정보 : ");
		sb.append(user.getName());
		sb.append("(").append(user.getRrn()).append(") ");
		sb.append("투자 구좌 : ").append(investment.getAmount()).append(", ");
		sb.append("투자 금액 : ").append(investment.getPrice()).append(", ");
		sb.append("배정 구좌 : ").append(amount).append(", ");
		sb.append("배정 금액 : ").append(price);
		return sb.toString();
	}
}
