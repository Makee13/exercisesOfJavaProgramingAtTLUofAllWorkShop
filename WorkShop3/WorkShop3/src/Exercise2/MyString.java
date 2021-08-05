package Exercise2;

public class MyString implements IString{
    public String f1(String str, String s1, String s2){
       return (str.contains(s1) ? str.replaceAll(s1, s2) : str);
    }
    public String f2(String str, String s) {
        return (str.contains(s) ? str : str.concat(s));
    }
}
