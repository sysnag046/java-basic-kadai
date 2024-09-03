package kadai_015;

public class Car_Chapter15 {
	private int gear 	= 1;
	private int speed 	= 10;
	
	public void gearChange(int afterGear) {
		//切り替え前のギア
		int beforeSwitchingGear = this.gear;
		
		String message ;//出力メッセージ
		
		//切り替え前後のギアを比較
		if(beforeSwitchingGear==afterGear) {
			message = "ギアはすでに"+afterGear+"です";
		}else {
			this.gear = afterGear;
			message = "ギア"+beforeSwitchingGear+"から"+this.gear+"に切り替えました";
		}
		print(message);
		run();
	}
	
	public void run() {
		this.speed = switch (this.gear) {
			case 1 	-> 10;
			case 2 	-> 20;
			case 3 	-> 30;
			case 4 	-> 40;
			case 5 	-> 50;
			
			default -> 10;
		};
		
		/*「速度は時速30kmです」が出力イメージですが、
		日本語的に「速度」と「時速」の意味が重複するので、時速のみ残しております。*/
		print("時速" + this.speed + "kmです\n");
	}
	private void print(String message) {
		System.out.println(message);
	}
}
