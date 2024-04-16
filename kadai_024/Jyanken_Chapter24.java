package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {

	//	じゃんけん実行クラス

	public String getMyChoice() { //  自分のじゃんけんを入力するメソッド
		//				じゃんけんの手を入力する  scanner作成
		Scanner scanner = new Scanner(System.in);
		//		正しいじゃんけんの手であるかの判定 ループ
		while (true) {
			//			入力受付案内のメッセージの出力
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのr入力しましょう");
			System.out.println("チョキはscissorsのs入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			//			入力した自分のじゃんけんの手を受け取る
			String myChoice = scanner.nextLine();
			//		正しいじゃんけんの場合　じゃんけんクラスを実行するクラスに、自分のじゃんけんの手を返す

			if (myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p")) {
				scanner.close(); //			scannerを閉じる
				return myChoice;
			} else { //		正しいじゃんけんの手でない場合　　エラーを出力し、再度自分のじゃんけんの手を選ぶ　エラーメッセージを出力
				System.out.println("r , s , pのいずれかを入力してください");
			}
		}
	}

	public String getRandom() { //	相手のじゃんけんを乱数で選ぶメソッド
		//		配列にじゃんけんの手をセットする
		String[] rivalArray = { "r", "s", "p" };
		//		乱数で対戦相手のジャンケンの手を選ぶ　0~2乱数

		//		ジャンケンクラスを実行するクラスに、対戦相手のジャンケンの手を返す
		String choice = rivalArray[(int) Math.floor(Math.random() * 3)];
		return choice;
	}

	//	じゃんけんを行うメソッド
	public void playGame(String mychoice, String cpuchoice) {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("r", "グー");
		map.put("s", "チョキ");
		map.put("p", "パー");
		System.out.println("自分の手は" + map.get(mychoice) + ", 対戦相手の手は" + map.get(cpuchoice));
		if ((mychoice.equals("r") && cpuchoice.equals("r"))
				|| (mychoice.equals("s") && cpuchoice.equals("s"))
				|| (mychoice.equals("p") && cpuchoice.equals("p"))) { //		じゃんけんを比較してあいこだった場合「あいこです」
			System.out.println("あいこです");
		}

		if ((mychoice.equals("r") && cpuchoice.equals("s"))
				|| (mychoice.equals("s") && cpuchoice.equals("p"))
				|| (mychoice.equals("p") && cpuchoice.equals("r"))) { //		じゃんけんを比較して自分が勝った場合「自分が勝ちです」
			System.out.println("自分の勝ちです");
		}

		if ((mychoice.equals("r") && cpuchoice.equals("p"))
				|| (mychoice.equals("s") && cpuchoice.equals("r"))
				|| (mychoice.equals("p") && cpuchoice.equals("s"))) { //		じゃんけんを比較して自分が負けた場合「自分の負けです」
			System.out.println("自分の負けです");
		}

	}

}
