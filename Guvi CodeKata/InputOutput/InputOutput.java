import java.util.Scanner;

public class InputOutput 
{
    public static void main(String[] args) 
    {
        Scanner var = new Scanner(System.in);
        
        int userInput1 = var.nextInt();
        int userInput2 = var.nextInt();
        int userInput3 = var.nextInt();
        int userInput4 = var.nextInt();
        int userInput5 = var.nextInt();
        int userInput6 = var.nextInt();
        
        System.out.println(userInput1 + " " + userInput2);
        System.out.println(userInput3 + " " + userInput4);
        System.out.println(userInput5 + " " + userInput6);
        
        var.close();
    }
}
