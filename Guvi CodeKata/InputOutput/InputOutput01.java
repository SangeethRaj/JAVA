import java.util.Scanner;

public class InputOutput01
{
    public static void main(String[] args) 
        {

            Scanner obj = new Scanner(System.in);
            
            int userInput = obj.nextInt();
            
            System.out.println(userInput);

            obj.close();
        }
}