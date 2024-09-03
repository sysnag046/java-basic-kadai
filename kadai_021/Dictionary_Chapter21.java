package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	public HashMap<String, String> fruitDic = new HashMap<>();
	
	public Dictionary_Chapter21 () {
		fruitDic.put("apple","りんご");
		fruitDic.put("peach","桃");
		fruitDic.put("banana","バナナ");
		fruitDic.put("lemon","レモン");
		fruitDic.put("pear","梨");
		fruitDic.put("kiwi","キウィ");
		fruitDic.put("strawberry","いちご");
		fruitDic.put("grape","ぶどう");
		fruitDic.put("muscat","マスカット");
		fruitDic.put("cherry","さくらんぼ");

	}
	
	public String sarchKey(String Key) {
		String message;
		
		if (this.fruitDic.containsKey(Key)) {
			message = Key+"の意味は"+fruitDic.get(Key);
		}else {
			message =  Key+"は辞書に存在しません";
		}
		return message;
	}
}
