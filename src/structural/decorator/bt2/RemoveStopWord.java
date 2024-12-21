package structural.decorator.bt2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveStopWord extends TokenDecorator{
    ArrayList stopwords;
    public RemoveStopWord(Tokenize token) {
        super(token);
        stopwords = new ArrayList<>(Arrays.asList("và","hoặc","thì","mà","là"));
    }

    @Override
    public List<String> tokenize() {
        List<String> list = token.tokenize();
        list.removeAll(stopwords);
        return list;
    }
}
