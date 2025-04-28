import java.util.Scanner;
public class InputOutput03 {
    public static void main(String[] args) 
    {
        Scanner var = new Scanner(System.in);
            
            int num1 = var.nextInt();
            int num2 = var.nextInt();
            int num3 = var.nextInt();
            int num4 = var.nextInt();
            int num5 = var.nextInt();
            int num6 = var.nextInt();
            int num7 = var.nextInt();
            
            System.out.println(num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+num7);
            
        var.close();
    }
}