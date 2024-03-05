package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {

		//		年代を宣言
		int userAge = 30;
		//		使用量の宣言
		int serviceCost = 0;

		//		各年代と使用量の判定
		switch (userAge) {
		case 10 -> serviceCost = 1000;
		case 20 -> serviceCost = 2000;
		case 30 -> serviceCost = 3000;
		case 40 -> serviceCost = 3000;
		case 50 -> serviceCost = 4000;
		case 60 -> serviceCost = 4000;
		case 70 -> serviceCost = 5000;
		case 80 -> serviceCost = 5000;
		default -> serviceCost = 500;
		}
		//結果を表示
		System.out.println(userAge + "代の料金は" + serviceCost + "円");
	}

}
