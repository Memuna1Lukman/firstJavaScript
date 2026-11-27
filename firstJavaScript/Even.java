public class Even {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        double average;
        
        // Loop through numbers 0 to 20
        for (int i = 0; i <= 20; i++) {
            // Check if 'i' is even and non-zero
            if (i % 2 == 0 && i>0 && i<20) {
                System.out.println(i);
                count++;
                sum += i; // Placed inside the if-block
            }
        }
        
        // Calculate average
        average = (double) sum / count;
        
        // Calculate factorial of the integer part of average
        int factorial = 1;
        int temp = (int) average;
        
        while (temp > 1) {
            factorial *= temp;
            temp--;
        }
        
        // Print final outputs
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
        System.out.println("The factorial is " + factorial);
    }
}