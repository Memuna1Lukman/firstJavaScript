import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        //  Create a Scanner object attached to the standard input stream
        Scanner scanner=new Scanner(System.in);
        // prompt the user
        System.out.println("Enter your name: ");
        // get the input into the object;
        String name = scanner.nextLine();

        int[] marks = new int[8];

        String[] subjects= {"System Analysis","Algebra","Database","Electronics","English","OS","Ethics","Java"};
        for(int i = 0; i < subjects.length; i++){
            System.out.println("What is your marks for " + subjects[i] + "?");
            marks[i]= scanner.nextInt();
        };
        // System.out.println(marks);


        // now i want to ask about the 8 subjects
        double total=0.0;
        // finding the average 
        for (int i=0;i<marks.length;i++){
            total+=marks[i];
        }
        char grade;
        double average = total/marks.length;
        if (average>=70){
            grade='A';
        }else if(average>=60){
            grade='B';
        }else if(average>=50){
            grade='C';
        }else if(average>40){
            grade='D';
        }else if(average>=35){
            grade='E';
        }else{
            grade='F';
        }
        System.out.println("\n--- Student Report Card ---");
        System.out.println("Student Name: " + name);
        System.out.println("---------------------------");
        
        // Print individual subject scores
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }
        
        System.out.println("---------------------------");
        System.out.println("Total Marks: " + total + " / " + (marks.length * 100));
        System.out.println("Average Mark: " + String.format("%.2f", average));
        System.out.println("Final Grade: " + grade);
        scanner.close();
    }

}
