package kadai_017;

abstract public class Kato_Chapter17 {

	//姓を表す
	String familyName = "加藤";
	//	 名を表す
	String givenName = "";
	//	 住所を表す
	String address = "東京都中野区〇×";

	//	 共通の紹介を出力
	public void commonIntroduce() {

		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");

	}

	//	 個別の紹介を出
	abstract public void setGivenName();

	abstract public void eachIntroduce();

	//	 紹介を実行
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		System.out.println();
	}
}
