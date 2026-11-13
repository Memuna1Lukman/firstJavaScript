import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        // I have to write a code that is used to find a prime number
        // I know a prime number is a number that has only two factors one and itself
        // Ask the person for the number

        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number you want to verify as prime");
        int prime = number.nextInt();
        int counter = 0;
        for(int i=1; i<=prime;i++){
            // the algorithm i am using is that with any number that the user willenter i want it tto divide by the numbers below that number to itself
            // at the end of the day if the number of fasctors are more that 2 then it is not prime
            
            if(prime % i == 0){
                counter++;
            }
            
        }
        if(counter == 2){
            System.out.println(prime + " is a prime number");
        }
        else{
            System.out.println(prime + " is not a prime number");
        }
        number.close();
    }
}
