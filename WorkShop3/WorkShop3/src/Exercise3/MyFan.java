package Exercise3;

import java.util.List;

public class MyFan implements IFan {
    public void f1(List<Fan> t, String xCode) {
        for(int i=0;i<t.size();i++)
        {
            if(t.get(i).getCode().startsWith(xCode))
            {
               t.get(i).setPrice(t.get(i).getPrice() + t.get(i).getPrice()*0.1);
                System.out.printf("%-15s%f%n",t.get(i).getCode(),t.get(i).getPrice());
            }
        }
    }
    public void f2(List<Fan> t, double xPrice) {
        
    }
    public void f3(List<Fan> t) {
        
    }
}
