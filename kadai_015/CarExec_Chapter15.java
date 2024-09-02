package kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		
		// 「Car_Chapter15」クラスのインスタンス化
		Car_Chapter15 car = new Car_Chapter15();
		
		//初期値確認
		print("初期値確認");
		car.run();
		
		//各ギアの確認
		for(int i= 1;i<7;i++) {
			print("ギア："+ i);
			car.gearChange(i);
		}
	}
	
	//プリント
	public static void print(String massege) {
		System.out.println(massege);
	}

}
