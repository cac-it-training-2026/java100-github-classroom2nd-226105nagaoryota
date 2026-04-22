package lesson05.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SuperRobot {

	public String okonomiyaki(int flourNum, int cabbageNum, int eggNum, int porkNum) {
		if (flourNum >= 200 && cabbageNum >= 150 && eggNum >= 3 && porkNum >= 50) {
			return "お好み焼き";
		} else {
			return null;
		}
	}
}

public class RobotMaker {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("小麦粉の量を入力してください（グラム）＞");
		String flourNumStr = br.readLine();
		int flourNum = Integer.parseInt(flourNumStr);

		System.out.print("\nキャベツの量を入力してください（グラム）＞");
		String cabbageNumStr = br.readLine();
		int cabbageNum = Integer.parseInt(cabbageNumStr);

		System.out.print("\n卵の個数を入力してください＞");
		String eggNumStr = br.readLine();
		int eggNum = Integer.parseInt(eggNumStr);

		System.out.print("\n豚肉の量を入力してください（グラム）＞");
		String porkNumStr = br.readLine();
		int porkNum = Integer.parseInt(porkNumStr);

		//ここでRobotクラスのインスタンスを作り、
		//（インスタンス名はrobot）
		//makeEggDishesを実行する。
		//標準出力でメニューを表示する
		SuperRobot robot = new SuperRobot();
		String dish = robot.okonomiyaki(flourNum, cabbageNum, eggNum, porkNum);
		if (dish == null) {
			System.out.println("何も作れません。");
		} else {
			System.out.println(dish + "が出来ました。");
		}

	}

}
