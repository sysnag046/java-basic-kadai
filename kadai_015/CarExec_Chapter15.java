package kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		int selectGear ;
		
		// 「Car_Chapter15」クラスのインスタンス化
		Car_Chapter15 car = new Car_Chapter15();
		
		//初期値確認
		print("◆◆初期値確認◆◆");
		car.run();
		
		//各ギアの上昇確認
		print("◆◆ギアの上昇確認◆◆");
		for(selectGear= 1; selectGear<7; selectGear++) {
			print("--ギア"+ selectGear + "に切り替え--");
			car.gearChange(selectGear);
		}
		//各ギアの下降確認
		print("◆◆ギアの下降確認◆◆");
			for(int c= 1; c<7; c++) {
				selectGear= 7-c;
				print("--ギア"+ selectGear + "に切り替え--");
				car.gearChange(selectGear);
			}
		//乱数でギアの変更
		print("◆◆ギアをランダムに変更◆◆");
		print("--ギア"+ selectGear + "に切り替え--");
		selectGear = (int)(Math.random()*6+1);
		car.gearChange(selectGear);
	}
	
	//プリント
	public static void print(String massege) {
		System.out.println(massege);
	}

}
