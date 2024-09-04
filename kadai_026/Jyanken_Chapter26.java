package kadai_026;

import java.util.ArrayList;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	//コンストラクタ
	public Jyanken_Chapter26(){
		//処理無し
	}
	
	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
		print("自分のじゃんけんの手を入力しましょう");
		print("グーはrockのrを入力しましょう");
		print("チョキはscissorsのsを入力しましょう");
		print("パーはpaperのpを入力しましょう");
		print("※やめたいときはescと入力しましょう");
		
		boolean isExpectedInput = false;
		
		Scanner scanner= new Scanner(System.in);
		String input = null;
		//正しい値が入力されるまでループ
		do{
			try {

				input = (scanner.nextLine()).toLowerCase();
//				scanner.close();
				
				//処理停止でないかチェック
				if (input.equals("esc")) {
					throw new Exception("escが入力されました。処理を停止します。");
				}
				
				//入力の正否チェック
				if (input.equals("r")||input.equals("s")||input.equals("p")) {
					isExpectedInput = true;
				}else {
					print("不正な値が入力されました　もう一度入力してください");
				}
				
			}catch (Exception e) {
				//例外の場合は、例外メッセージのみ出力して処理停止
				print(e.getMessage());
				System.exit(0);				
			};
			
		}while (isExpectedInput == false);
		scanner.close();
		return input;
	}
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		ArrayList<String> handList = new ArrayList<String>(3);
		handList.add("r");
		handList.add("s");
		handList.add("p");
		
		//0～2の乱数でじゃんけんの手を決める
		String selectHand = handList.get((int)Math.floor(Math.random() * 3));	
		return selectHand;
	}
	
	//じゃんけんを行う
	public void playGame(String myHand, String enemyHand) {
		String message;
		
		print("自分の手は"+(changeCahrToString(myHand))+",対戦相手の手は" + (changeCahrToString(enemyHand)));
		
		//勝敗のチェック
		if (myHand.equals(enemyHand)) {
		    message = "あいこです";
		} else if ((myHand.equals("r") && enemyHand.equals("s")) || 
		           (myHand.equals("s") && enemyHand.equals("p")) || 
		           (myHand.equals("p") && enemyHand.equals("r"))) {
		    message = "自分の勝ちです";
		} else {
		    message = "自分の負けです";
		}
		print(message);
	}
	
	//Println用
	public void print(String message) {	
		System.out.println(message);
	}
	
	//手の型にしたがって、文字列に変換
	private String changeCahrToString(String value) {
		return ((value.replace("r","グー")).replace("s", "チョキ")).replace("p","パー");
	}
}

