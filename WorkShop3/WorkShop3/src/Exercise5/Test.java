package Exercise5;
import java.util.*;

public class Test {
//    Begin: Declare attributes
    private static Scanner scan = new Scanner(System.in);            
    private static MyProduct myPro = new MyProduct();
//    End: Declare attributes
//    Begin: Declare methods
    public static void Input(){
        System.out.print("Add how many products: ");
        int quatity = scan.nextInt();
        for(int i=0;i<quatity;i++)
        {
            Product temp = new Product();
            System.out.print("Input ID: ");       temp.setID(scan.next());scan.nextLine();
            System.out.print("Input Name: ");     temp.setName(scan.nextLine());
            System.out.print("Input Amount: ");   temp.setAmount(scan.nextDouble());
            System.out.print("Input Price: ");    temp.setPrice(scan.nextDouble());
            myPro.addProduct(temp);
        }
    }
    public static void Output()
    {
        System.out.println("The list of products");
        myPro.print();
        System.out.println("The list of products with the smallest total:");
        myPro.printMin();
        System.out.print("Input Name: ");
        scan.nextLine();
        String Name = scan.nextLine();
        System.out.println("The list of products by Name");
        myPro.findbyName(Name);
    }
    
    public static void main(String[] args) {
//      Thêm vào interface phương thức sort để sắp xếp danh sách các product theo chiều giảm dần của tổng tiền
//      Thêm vào interface phương thức hiển thị ra các sản phẩm có số lượng lớn hơn số lượng được nhập vào và đơn giá nhỏ hơn số lượng nhập vào
        Input();
        Output();
    }
//    End: Declare methods
}
