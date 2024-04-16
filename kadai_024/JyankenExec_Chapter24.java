package kadai_024;

public class JyankenExec_Chapter24 {

	//	メイン実行クラス

	public static void main(String[] args) {

		//		じゃんけんクラスのインスタンスを作成
		Jyanken_Chapter24 jyanken = new Jyanken_Chapter24();
		//		じゃんけんの手を入力する
		String myChoice = jyanken.getMyChoice();
		//		対戦相手のジャンケンの手が乱数で選ばれる
		String cpuChoice = jyanken.getRandom();
//		System.out.println("乱数確認 :" + cpuChoice);
		//		じゃんけんの結果を出力する
		jyanken.playGame(myChoice, cpuChoice);
	}

}
