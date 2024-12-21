package structural.decorator.bt2;

public class mainTokenize {
    public static void main(String[] args) {
        Tokenize s = new TachTu("loại bỏ các từ dừng (Stop word) như các từ: và, hoặc, thì, mà, là;");
        System.out.println(s.tokenize());
        s = new RemovePunctuation(s);
        s = new RemoveStopWord(s);
        System.out.println(s.tokenize());
    }
}
