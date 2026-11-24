import java.util.Scanner;

public class Fuzz{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a positive Integer: ");
        int n = num.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= n; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
            if (i % 2 == 0){
                sum+=i;
            }
            
        }
        int temp = n;
        while(temp>0){
            temp = temp/10;
            count++;
        }
        System.out.println("the count is " + count);
        System.out.println("The sum is " + sum);
        num.close();
    }
}