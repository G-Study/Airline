
package javaapplication6;
import java.util.Scanner;
public class JavaApplication6 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String first = sc.nextLine();
        System.out.println();
        String second = sc.nextLine();
        System.out.println();
        
        int result = first.hashCode();
        int result1 = second.hashCode();
        
        System.out.println(result);
        System.out.println(result1);

        
        
        
        
    }
    
}
