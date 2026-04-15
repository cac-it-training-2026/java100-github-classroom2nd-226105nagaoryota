/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
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
 */

package lesson01.challenge07;

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

	}

}