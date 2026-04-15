/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		float citronStock = 30;
		float chocolatStock = 30;
		float pistacheStock = 30;

		System.out.println("本日のおすすめ商品です。");

		System.out.println("シトロン      \\250 ・・・ 残り" + citronStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolatStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistacheStock + "個");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("それぞれ何個ずつ買いますか？");

		System.out.print("シトロン>");
		String a = reader.readLine();
		float sitronbycount = Float.parseFloat(a);
		System.out.print("ショコラ>");
		String b = reader.readLine();
		float chocolatbycount = Float.parseFloat(b);
		System.out.print("ピスターシュ>");
		String c = reader.readLine();
		float pistachebycount = Float.parseFloat(c);

		System.out.println("\nシトロン" + sitronbycount + "個");
		System.out.println("ショコラ" + chocolatbycount + "個");
		System.out.println("ピスターシュ" + pistachebycount + "個");

		float sum = sitronbycount + chocolatbycount + pistachebycount;

		System.out.println("合計個数" + sum + "個");
		float sumcash = sitronbycount * 250 + chocolatbycount * 280 + pistachebycount * 320;

		System.out.println("合計金額" + (int) sumcash + "円");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

		citronStock = citronStock - sitronbycount;
		chocolatStock = chocolatStock - chocolatbycount;
		pistacheStock = pistacheStock - pistachebycount;

		System.out.println("本日のおすすめ商品です。");

		System.out.println("シトロン      \\250 ・・・ 残り" + (int) citronStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + (int) chocolatStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + (int) pistacheStock + "個");

		System.out.println("閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");

		System.out.println("売上の割合");
		System.out.println("売上合計  \\" + sumcash);

		System.out.println("\n内訳");
		System.out
				.println("シトロン  \\" + sitronbycount * 250 + "・・・" + (int) (100 * sitronbycount * 250 / sumcash) + "%");
		System.out.println(
				"ショコラ  \\" + chocolatbycount * 280 + "・・・" + (int) (100 * chocolatbycount * 280 / sumcash) + "%");
		System.out.println(
				"ピスターシュ  \\" + pistachebycount * 320 + "・・・" + (int) (100 * pistachebycount * 320 / sumcash) + "%");

	}

}