package kadai_021;

public class DictionaryExec_Chapter21 {
	public static void main(String[] args) {
		//ハッシュマップのクラスをインスタンス
		Dictionary_Chapter21 fruitDic = new Dictionary_Chapter21();
		
		//KeyWordを配列で格納して、１要素ずつループ
		String[] keywords = {"apple","banana","grape","orange"};
		for(String keyword:keywords) {
			System.out.println(fruitDic.sarchKey(keyword));
		}
	}
}
