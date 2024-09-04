import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        int number= 0;
        int reversenum= 0;
        System.out.println("enter a number:");
        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();
        while (number !=0){
            reversenum*=10;
            reversenum=number%10;
            number/=10;
            System.out.println(reversenum);
        }
    }
}
