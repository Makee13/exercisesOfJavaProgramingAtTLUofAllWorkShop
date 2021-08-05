package Exercise5;

import java.util.ArrayList;

public class MyProduct implements IProduct {
//    

    private ArrayList<Product> plist = new ArrayList<Product>(100);
    private String commonHeader = "Index\tID\tName\tAmount\tPrice\tTotal";
//    

    public void addProduct(Product s) {
        plist.add(s);
    }

    public void findbyName(String Name) {
        System.out.println(commonHeader);
        for (int i = 0; i < plist.size(); i++) {
            if (Name.equals(plist.get(i).getName())) {
                System.out.println((i + 1) + "\t" + plist.get(i).toString());
            }
        }
    }

    public double getMin() {
        double minTotal = plist.get(0).Total();
        for (int i = 0; i < plist.size(); i++) {
            if (plist.get(i).Total() < minTotal) {
                minTotal = plist.get(i).Total();
            }
        }
        return minTotal;
    }

    public void print() {
        System.out.println(commonHeader);
        for (int i = 0; i < plist.size(); i++) {
            System.out.println((i + 1) + "\t" + plist.get(i).toString());
        }
    }

    public void printMin() {
        System.out.println(commonHeader);
        for (int i = 0; i < plist.size(); i++) {
            if (plist.get(i).Total() == getMin()) {
                System.out.println((i + 1) + "\t" + plist.get(i).toString());
            }
        }
    }

    public void sortDESC() {
        System.out.println("Sort the list of teachers with DESC");
        for (int i = 0; i < plist.size() - 1; i++) {
            for (int j = i + 1; j < plist.size(); j++) {
                if (plist.get(i).Total()< plist.get(j).Total()) {
                    Product temp = plist.get(i);
                    plist.set(i, plist.get(j));
                    plist.set(j, temp);
                }
            }
        }
    }

    public void search(double Amount,double Price) {
        System.out.println(commonHeader); 
        for(int i=0;i<plist.size();i++)
        {
            if(plist.get(i).getAmount() > Amount && plist.get(i).getPrice() < Price)
            {
                System.out.println((i + 1) + "\t" + plist.get(i).toString());
            }
        }
    }
}
