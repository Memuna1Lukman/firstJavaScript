import java.util.Scanner;
public class Grading {
    public static void main(String[] args) {
        // ========REQUIREMENTS==========
        Scanner results = new Scanner(System.in);
        System.out.print("Enter you exam_score: ");
        double exam_score = results.nextDouble();
        System.out.print("Enter your assessment: ");
        double assessment = results.nextDouble();
        System.out.print("How much of the fees have you paid? ");
        int fees = results.nextInt();


        double total_grade = exam_score + assessment;
        boolean passedExam = exam_score >= 25;
        boolean passedAssessment = assessment >= 15;
        System.out.println("\n--- COMPONENT RESULTS ---");

        if(passedExam){
            System.out.println("Exam: Passed (" + exam_score + ")");
        }else{
            System.out.println("Exam: Failed (" + exam_score + ")");
        }
        if (passedAssessment) {
            System.out.println("Assessment: Passed (" + assessment + ")");
        } else {
            System.out.println("Assessment: Failed (" + assessment + ")");
        }
        System.out.println("\n--- FINAL DECISION ---");
        if(passedExam && passedAssessment){
            if(fees == 100){
                System.out.println("You have been issued a certificate");
            }else{
                System.out.println("You met the academic requirements, but fees are not fully paid");
            }   
        }
        else if (total_grade == 39) {
            System.out.println("You have a total grade of 39 and have been condoned");
        }

        else if (!passedExam && !passedAssessment) {
            System.out.println("You failed both components and you are repeated.");
        } 
        else {
            System.out.println("You have failed because you did not meet the requirements.");
        }
        
        results.close();
    }
}
   