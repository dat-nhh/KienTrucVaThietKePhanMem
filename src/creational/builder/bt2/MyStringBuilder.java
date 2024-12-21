package creational.builder.bt2;

public class MyStringBuilder {
    String s = "";
    public MyStringBuilder appendString(String sub){
        s += sub + "\t";
        return this;
    }
    public MyStringBuilder addFloat(float f){
        s += f + "\t";
        return this;
    }
    @Override
    public String toString(){
        return s;
    }
}
