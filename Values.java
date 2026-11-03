public class Values {
    public static void main(String[] args) {
        int n = 15;
        int [] values = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            values[i]=i+1;
            sum+=values[i];
        }
        double average = (double) sum/n;
        double deviationSum=0;
        for (int i = 0; i < n; i++) { 
            deviationSum += Math.pow(values[i] - average, 2);
        }
            double deviation = Math.sqrt(deviationSum/n);

            int deviate = (int) (Math.round(deviation));
            int factorial = 1;
            int temp = (int) deviation;
            while(temp>1){
                factorial = factorial*temp;
                temp--;
            }
        
        System.out.println("Average = " + average);
        System.out.println("Deviation = " + deviation);
        System.out.println("Factorial = " + factorial);
    }
}
