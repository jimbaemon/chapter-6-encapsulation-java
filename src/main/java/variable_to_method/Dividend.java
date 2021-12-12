package variable_to_method;

public class Dividend {
	public User user;
	public Investment investment;
	public int amount;
	public int price;

	public String getDividend(){
		StringBuilder sb = new StringBuilder();
		sb.append("사용자 정보 : ");
		sb.append(user.name);
		sb.append("(").append(user.rrn).append(") ");
		sb.append("투자 구좌 : ").append(investment.amount).append(", ");
		sb.append("투자 금액 : ").append(investment.price).append(", ");
		sb.append("배정 구좌 : ").append(amount).append(", ");
		sb.append("배정 금액 : ").append(price);
		return sb.toString();
	}
}
