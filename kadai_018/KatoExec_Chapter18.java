package kadai_018;

public class KatoExec_Chapter18 {
    public static void main(String[] args) {

        KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
        KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
        KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
        
        hanako.setGivenName();
        hanako.execIntroduce();
        
        taro.setGivenName();
        taro.execIntroduce();
        
        ichiro.setGivenName();
        ichiro.execIntroduce();
    }
}
