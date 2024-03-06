package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {

		//		宣言
		boolean[] primeArray = new boolean[101];

		//		繰り返しtrueで初期化する処理　素数がtrueでfalseは素数ではない
		for (int i = 2; i < primeArray.length; i++) {
			primeArray[i] = true;
		}
		//100までの整数が素数であるか判定
		int primeNumber = 2;

		while (primeNumber < primeArray.length) {
			for (int i = primeNumber + 1; i < primeArray.length; i++) {
				if (i % primeNumber == 0) {
					primeArray[i] = false;
					continue;
				}
			}
			primeNumber++;

		}
		for (int i = 0; i < primeArray.length; i++) {
			if (primeArray[i]) {
				System.out.println(i);
			}
		}
	}
}
