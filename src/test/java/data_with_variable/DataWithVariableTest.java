package data_with_variable;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DataWithVariableTest {

	User user;
	Investment investment;
	Dividend dividend;

	@BeforeEach
	void setUp(){
		//given
		user = new User();
		user.name = "배재현";
		user.rrn = "931109-1352123";

		investment = new Investment();
		investment.user = user;
		investment.amount = 4;
		investment.price = 1200;

		dividend = new Dividend();
		dividend.user = user;
		dividend.investment = investment;
		dividend.amount = 3;
		dividend.price = 900;
	}

	@Test
	@DisplayName("배정 정보 확인 시 주민등록번호 노출 테스트")
	void print_dividend_information_with_rrn_test(){
		//when
		String dividendInfo = dividend.getDividend();

		//then
		assertThat(dividendInfo).isEqualTo("사용자 정보 : 배재현(931109-1352123) "
			+ "투자 구좌 : 4, 투자 금액 : 1200, "
			+ "배정 구좌 : 3, 배정 금액 : 900");
	}

	@Test
	@DisplayName("투자 정보 확인 시 주민등록번호 노출 테스트")
	void print_investment_information_with_rrn_test(){
		//when
		String investmentInfo = investment.getInvestment();

		//then
		assertThat(investmentInfo).isEqualTo("사용자 정보 : 배재현(931109-1352123) "
			+ "투자 구좌 : 4, 투자 금액 : 1200");
	}

}