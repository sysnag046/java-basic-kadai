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
	
	public void sarchKey(String[] Keywords) {
		
		for(String key :Keywords) {
			
			String message;
			if (this.fruitDic.containsKey(key)) {
				message = key+"の意味は"+fruitDic.get(key);
			}else {
				message =  key+"は辞書に存在しません";
			}
			System.out.println(message);
		}
		
	}
}
