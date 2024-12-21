package structural.decorator.bt2;

import java.util.List;

public abstract class TokenDecorator implements Tokenize{
    Tokenize token;

    public TokenDecorator(Tokenize token) {
        this.token = token;
    }

    @Override
    public List<String> tokenize() {
        return List.of();
    }
}
