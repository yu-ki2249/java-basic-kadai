package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {

	public void dictionary(String[] word) {

		//	マップ宣言　
		HashMap<String, String> englishdictionary = new HashMap<String, String>();
		//	辞書に１０通りの英単語と意味を追加
		englishdictionary.put("apple", "りんご");
		englishdictionary.put("peach", "桃");
		englishdictionary.put("banana", "バナナ");
		englishdictionary.put("lemon", "レモン");
		englishdictionary.put("pear", "梨");
		englishdictionary.put("kiwi", "キウィ");
		englishdictionary.put("strawberry", "いちご");
		englishdictionary.put("grape", "ぶどう");
		englishdictionary.put("muscat", "マスカット");
		englishdictionary.put("cherry", "さくらんぼ");
		//	調べる英単語が辞書に追加されているか判定
		//		スタート　辞書に追加された数まで繰り返し
		String result = "";
		for (String maps : word) {
			//	　辞書を調べる
			if (englishdictionary.containsKey(maps)) { //		辞書で調べた結果、追加されている場合は結果を出力
				result = maps + "の意味は" + englishdictionary.get(maps);
			} else { //		辞書に追加されていない場合は辞書に存在していない旨出力する
				result = maps + "は辞書に存在しません";
			}
			//		メッセージで出力
			System.out.println(result);

		}
	}
}
