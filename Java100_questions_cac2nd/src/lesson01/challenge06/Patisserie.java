/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int citronStock = 30;
		int chocolatStock = 30;
		int pistacheStock = 30;

		System.out.println("本日のおすすめ商品です。");

		System.out.println("シトロン      \\250 ・・・ 残り" + citronStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolatStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistacheStock + "個");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("それぞれ何個ずつ買いますか？");

		System.out.print("シトロン>");
		String a = reader.readLine();
		int sitronbycount = Integer.parseInt(a);
		System.out.print("ショコラ>");
		String b = reader.readLine();
		int chocolatbycount = Integer.parseInt(b);
		System.out.print("ピスターシュ>");
		String c = reader.readLine();
		int pistachebycount = Integer.parseInt(c);

		System.out.println("\nシトロン" + a + "個");
		System.out.println("ショコラ" + b + "個");
		System.out.println("ピスターシュ" + c + "個");

		int sum = sitronbycount + chocolatbycount + pistachebycount;

		System.out.println("合計個数" + sum + "個");
		int sumcash = sitronbycount * 250 + chocolatbycount * 280 + pistachebycount * 320;

		System.out.println("合計金額" + sumcash + "円");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

		citronStock = citronStock - sitronbycount;
		chocolatStock = chocolatStock - chocolatbycount;
		pistacheStock = pistacheStock - pistachebycount;

		System.out.println("本日のおすすめ商品です。");

		System.out.println("シトロン      \\250 ・・・ 残り" + citronStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolatStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistacheStock + "個");

	}

}