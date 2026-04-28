/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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

		float citronseles = sitronbycount * 250;
		float chocolatseles = chocolatbycount * 280;
		float pistacheseles = pistachebycount * 320;

		System.out.println("\n内訳");
		System.out.println("シトロン  \\" + citronseles + "・・・" + (int) (100 * citronseles / sumcash) + "%");
		System.out.println("ショコラ  \\" + chocolatseles + "・・・" + (int) (100 * chocolatseles / sumcash) + "%");
		System.out.println("ピスターシュ  \\" + pistacheseles + "・・・" + (int) (100 * pistacheseles / sumcash) + "%");

		System.out.println("明日の三色マカロンの配合率が決まりました！");

		System.out.println("シトロン  ・・・" + (int) (100 * citronseles / sumcash) + "%");
		System.out.println("ショコラ  ・・・" + (int) (100 * chocolatseles / sumcash) + "%");
		System.out.println("ピスターシュ  ・・・" + (int) (100 * pistacheseles / sumcash) + "%");

		System.out.println("値段は" + (int) (sumcash / sum));
	}

}