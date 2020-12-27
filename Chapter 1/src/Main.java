import java.util.Scanner;

public class Main{
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args)  {
        
    // System.out.println(isEven(-2));
    // System.out.println(vowelCounter("sdidsad hello"));
        int age = getInt("Enter your age: ");
        
        System.out.println(age);
    }
    // Method isEven without using multiplcation, modulus, or division operators
    public static boolean isEven(int i){
        return ((i & 1) == 0);
    }
    // Method to count number of vowels in a given string
    public static int vowelCounter(String s){
        int count = 0;
        char[] vowelChar= {'a','e','i','o','u'};
        for(int i = 0;i < s.length();i++){
            for(char c : vowelChar){
                if (s.charAt(i) == c)
                    count++;
            }
        }
        return count;
    }
    
    public static int getInt(String prompt) {
        System.out.print(prompt);
        try {
            int number = myScanner.nextInt();
            return number;
        }
        catch (Exception e) {
            System.out.println("Try Again");
            myScanner.next();
            return getInt(prompt);
        }
    }
}
