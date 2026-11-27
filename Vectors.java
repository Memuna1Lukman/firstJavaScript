public class Vectors {
    public static void main(String[] args) {
        // vectors with 2 plane that is i and j
        // the dot product 

        double [][] vect1 = {{2},{3}};
        double [][] vect2 = {{5},{4}};
        int rows = vect1.length;
        int cols = vect1[0].length;

        double [][] sum = new double[rows][cols];
        double dot = 0.0;

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
               sum[i][j] = vect1[i][j] + vect2[i][j];
               dot += vect1[i][j] * vect2[i][j];
               
            }
        }
        System.out.println("Sum vector: ");
        for(int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.println(sum[i][j]);
            }
        }
        if(dot == 0){
            System.out.println("The vectors are perpendicular");
        }else{
            System.out.println("The vectors are not perpendicular");
        }
        System.out.println("The dot product is: " + dot);
    }
}
