import java.util.Scanner;
public class scanner {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
       
        System.out.println("Enter the number:" );
         int a =sc.nextInt();
          System.out.println("Enter the number:" );
         int b =sc.nextInt();
         int sum=a+b;
         System.out.println("The sum of the number is : "+ sum);
         System.out.println("Enterthe number x:");
         float x=sc.nextFloat();
         System.out.println("Enter the second value y:");
         float y=sc.nextFloat();
         float div=x/y;
         System.out.println("The division of the number is ="+ div);


    }
    
}
