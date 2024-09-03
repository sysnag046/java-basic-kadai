package kadai_018;

public abstract  class Kato_Chapter18 {
	public String familyName = "加藤";
	public String givenName;
	public String address = "東京都中野区〇×";
	
	//共通の紹介を出力する
	public void commonIntroduce() {
		print("名前は"+ this.familyName +" "+ this.givenName +"です");
		print("住所は"+this.address+"です");
	}
	
	//個別の紹介を出力する
	public abstract void eachIntroduce();
	
	//紹介を実行する
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
	
	//プリント用
	public void print(String message) {
		System.out.println(message);
	}
}