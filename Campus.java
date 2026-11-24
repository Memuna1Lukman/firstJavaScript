public class Campus {
    public static void main(String[] args) {
        int count = 0;
        double average = 0.0;
        int discount = 4;
        int sum = 0;
        for (int passNo = 1; passNo <= 15; passNo++) {
            if ( passNo % 3 == 0 ){
                System.out.println(passNo);
                count++;
                sum += discount;
            }
        }
        if (count > 0) {
            average = (double) sum / count;
        }
        System.out.println("Number of discount passes: " + count);
        System.out.println("Total discount revenue: " + sum);
        System.out.println("Average discount fare: " + average);
        if (sum >= 15) {
            System.out.println("Daily discount target met");
        } else {
            System.out.println("Discount target not met");
        }
    }
}
