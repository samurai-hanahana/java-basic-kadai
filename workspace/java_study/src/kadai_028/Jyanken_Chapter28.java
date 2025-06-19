package kadai_028;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	private static final String[] HANDS = {"r", "s", "p"};
	private static final Map<String,String> HAND_MAP = new HashMap<>();
	static {
		HAND_MAP.put("r", "グー");
		HAND_MAP.put("s", "チョキ");
		HAND_MAP.put("p", "パー");
	}
	
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		String myHand;
		while(true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			myHand = scanner.nextLine();
			
			if (HAND_MAP.containsKey(myHand)) {
				break;
			} else {
				System.out.println("正しい値を入力してください。");
			}
		}
		return myHand;
	}

	public String getRandom() {
		String[] hands = {"r", "s", "p"};
		double randomValue = Math.random() * 3;
		int index = (int) Math.floor(randomValue);
		return hands[index];
	}
	
	public void playGame(String myHand, String opponentHand) {
		System.out.println("自分の手は" + HAND_MAP.get(myHand) + ",対戦相手の手は" 
	+ HAND_MAP.get(opponentHand));
		if (myHand.equals(opponentHand)) {
			System.out.println("あいこです");
		} else if (
				(myHand.equals("r") && opponentHand.equals("s")) ||
				(myHand.equals("s") && opponentHand.equals("p")) ||
				(myHand.equals("p") && opponentHand.equals("r"))
		) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}
}
