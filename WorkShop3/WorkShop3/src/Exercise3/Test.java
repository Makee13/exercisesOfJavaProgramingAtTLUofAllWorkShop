package Exercise3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        MyFan f = new MyFan();
        ArrayList<Fan> t = new ArrayList<Fan>(100);
        Fan e = new Fan();   
        e.setCode("1");
        e.setPrice(100);
        Fan e1 = new Fan();   
        e1.setCode("2");
        e1.setPrice(200);
        Fan e2 = new Fan();   
        e2.setCode("3");
        e2.setPrice(300);
        t.add(e);
        t.add(e1);
        t.add(e2);
        f.f1(t,"2");
    }
}
