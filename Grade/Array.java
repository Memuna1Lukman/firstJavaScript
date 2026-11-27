import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        Scanner searchStudent = new Scanner(System.in);


        int[] scores = {72, 48, 85, 90, 63, 55};
        String[] students = {"Ama","Kofi","Godfred","Alice","Felix","Memunatu"};
        double average;
        int sum = 0;
        int count = 0;
        int maxScore= 0;
        int lowestScore = scores[0];
        int passedCount=0;
        boolean found = false;
        int bonusPoint = 5;
        String lowestStudent = students[0]; 
        int [] newScores = new int[scores.length];
        // searching for students
        System.out.println("Enter the name you want to searh for? ");
        String name = searchStudent.nextLine();


        for ( int i = 0; i < students.length; i++){
            
            if(students[i].equalsIgnoreCase(name)){
                System.out.println(students[i] + "'s score is " + scores[i]);
                found = true;
            }
            if(scores[i] < 60){
                scores[i] += bonusPoint;
                System.out.println(scores[i]);
            }

            if (scores[i] >=50){
                passedCount++;
            }
            System.out.println((i+1) + ". " + students[i] + ": " + scores[i]);
            sum+=scores[i];
            count++;
            if(scores[i] > maxScore){
                maxScore = scores[i];
            }
            if (scores[i] < lowestScore ) {
                lowestScore = scores[i];
                lowestStudent = students[i];
                System.out.println("Lowest score: " + scores[i] + " by " + students[i] );
            }
             
        }
        if(!found){
            System.out.println(name + " was not found.");
        }
        average = (double) sum/scores.length ;
        System.out.println("The average is " + average);
        System.out.println("The Sum is  " + sum);
        System.out.println("The highest score is " + maxScore);
        System.out.println(newScores.length);
        System.out.println("The number of people who passed are " + passedCount);
        searchStudent.close();
    }
}
