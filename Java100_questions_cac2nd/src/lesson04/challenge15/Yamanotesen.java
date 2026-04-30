package lesson04.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Yamanotesen {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("※※※ 山手線ゲーム ※※※");
		System.out.println("「      ゲームスタート！    」\n");

		int count = 0;
		boolean game = false;
		boolean loopFlag = true;
		String[] yamanote = { "東京",
				"新宿",
				"新橋",
				"御徒町",
				"五反田",
				"秋葉原",
				"浜松町",
				"渋谷",
				"田町",
				"恵比寿",
				"有楽町",
				"目黒",
				"大崎",
				"原宿",
				"品川",
				"目白",
				"大塚",
				"上野",
				"池袋",
				"日暮里",
				"西日暮里",
				"駒込",
				"田端",
				"高田馬場",
				"神田",
				"鴬谷",
				"代々木",
				"新大久保",
				"巣鴨",
				"高輪ゲートウェイ" };

		while (count < 30) {
			game = false;
			loopFlag = true;
			System.out.println("駅名を入力してください。");
			System.out.println(yamanote.length);
			String station = reader.readLine();
			System.out.println(station);
			//			if (station.equals("新宿")) {
			//				System.out.println("おめでとう");
			//			}
			for (int i = 0; i < yamanote.length; i++) {
				if (station.equals(yamanote[i])) {
					System.out.println("正解です");
					game = true;
					yamanote[i] = "0";

				}
			}
			if (game) {
				while (loopFlag) {
					int index = (int) (Math.random() * 100) % 30;
					if (yamanote[index] != "0") {
						System.out.println(yamanote[index]);
						yamanote[index] = "0";
						loopFlag = false;
					}
				}
			} else {
				break;
			}
			count += 2;
			System.out.println(count);
		}

		if (count >= 30) {
			System.out.println("あなたの勝ちです！");
		} else {
			System.out.println("あなたの負けです！");
		}

	}

}
