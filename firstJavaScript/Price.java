import java.util.Scanner;
public class Price {
    public static void main(String[] args) {
        Scanner prices = new Scanner(System.in);
        double total = 0.0;
        double maxPrice = 0.0;
        int itemCount = 0;
        while(true){
            System.out.print("Enter item price in GHS (0 to finish): ");
            double priceItem = prices.nextDouble();

            if (priceItem ==0){
                break;
            }else if (priceItem < 0) {
                System.out.println("Invalid price ignored");
            }else{
                total += priceItem;
                itemCount++;
                if (priceItem > maxPrice) {
                    maxPrice = priceItem;
                }
            }
        }
        System.out.println(
            maxPrice
        );
        System.out.println(
            total
        );
        System.out.println(
            itemCount
        );
    }
}
