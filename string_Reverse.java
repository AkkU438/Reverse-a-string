import java.util.Scanner;

public class string_Reverse {
    public static void main(String[] args) throws Exception
    { 
        Scanner storeString = new Scanner(System.in);
        System.out.println("Please print out a string");
        
        String store2 = storeString.nextLine();
        char[] charArray = store2.toCharArray();
        
        for(int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }


    }
}
