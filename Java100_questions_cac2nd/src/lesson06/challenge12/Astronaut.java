/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題12 StringBufferクラス（replace）
 *
 * 宇宙船が次の目的地Ω星に到着しました。
 * Ω星は不思議な星です。Ω星では名前の
 * 末尾が数字が入っているものは英語表記に置き換える
 * というルールがあります。
 * 例えば、「apple2」は「appletwo」に
 * 「windows98」は「windows9eight」に変更されます。
 *
 * Ω星人クラスOmegalianを新たに作成してください。
 * OmegalianはString型フィールドitemを持ち、メソッドsetItem()で登録します。
 * また、setItem()内で呼び出されるメソッドとして、
 * 受け取った数字を英語表記に変換して戻す
 * private String changeLastChar(char ch)を持ちます。
 *
 * <実行例>
 *
 * Ω星人にアイテムを渡してください＞iPhone6
 *
 * Ω星人：
 * えっ！iPhonesixをくれるオメガか！
 * ありがとうオメガ。
 *
 */

package lesson06.challenge12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ここにOmegalianクラスを記述する
class Omegalian {
	String item;

	public void setItem(String item) {
		String endNumber = null;
		for (int i = 0; i < 10; i++) {
			if (item.endsWith(String.valueOf(i))) {
				endNumber = changeLastChar((char) ('0' + i));
			}
		}
		if (endNumber == null) {
			this.item = item;
		} else {
			this.item = item.substring(1, item.length() - 1) + endNumber;
		}
	}

	private String changeLastChar(char ch) {
		String chNumber = null;
		switch (ch) {
		case '0':
			chNumber = "zero";
			break;
		case '1':
			chNumber = "one";
			break;
		case '2':
			chNumber = "two";
			break;
		case '3':
			chNumber = "three";
			break;
		case '4':
			chNumber = "four";
			break;
		case '5':
			chNumber = "five";
			break;
		case '6':
			chNumber = "six";
			break;
		case '7':
			chNumber = "seven";
			break;
		case '8':
			chNumber = "eight";
			break;
		case '9':
			chNumber = "nine";
			break;

		default:
			break;
		}

		return chNumber;
	}

	public String getItem() {
		return item;
	}
}

public class Astronaut {

	public static void main(String[] args) throws IOException {

		System.out.print("Ω星人にアイテムを渡してください＞");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String present = br.readLine();

		//ここに適切な処理を記述する
		Omegalian omega = new Omegalian();
		omega.setItem(present);

		String item = null;

		//ここに適切な処理を記述する
		item = omega.getItem();

		System.out.println("\nΩ星人：");
		System.out.println("えっ！" + item + "をくれるオメガか！");
		System.out.println("ありがとうオメガ。");
	}
}
