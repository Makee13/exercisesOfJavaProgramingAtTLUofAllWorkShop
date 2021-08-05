package Exercise1;

public class MyString implements IString {

    public int f1(String st) {
        int sum = 0;
        for (int i = 0; i < st.length(); i++) {
            if (Character.isDigit(st.charAt(i))) {
                sum += Character.getNumericValue(st.charAt(i));
            }
        }
        return sum;
    }

    public String f2(String st) {
        for (int i = 0; i < st.length(); i++) 
        {
            int temp = Character.getNumericValue(st.charAt(i));
            if (0 <= temp && temp < 9) {
                char[] chars = st.toCharArray();
                chars[i] = (char)(temp + 1 + '0');
                st = String.valueOf(chars);
            }
        }
        return st;
    }
}
