import java.util.Scanner;

public class Marksheet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- Student details ----------
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
               // ---------- Marks in 5 subjects  ----------
        String[] subjectName = new String[5];
        int[] marks = new int[5];    //out of 100
        String[] subjectGrade = new String[5]; // grade per subject

        int totalMarks = 0;
        boolean anyFail = false;

        for (int i = 0; i < 5; i++) {
            System.out.println("\nSubject " + (i + 1));

            System.out.print(" Enter Subject Name: ");
            subjectName[i] = sc.nextLine();
	    
	    while(true)
	    {
	     	System.out.print(" Enter marks (out of 100): ");
                marks[i] = Integer.parseInt(sc.nextLine());
		if(marks[i]>0 && marks[i]<=100)
		{
			break;
		}
		else
		{
			System.out.println("Invalid! marks should be between 0 and 100.Try again.");
		}
	    }
	    totalMarks+=marks[i];
	   	    

            // Grade for this subject, based on its own percentage (total is out of 100)
            if (marks[i] < 40) {
                subjectGrade[i] = "Fail";
                anyFail = true;
            } else if (marks[i] >= 80) {
                subjectGrade[i] = "A";
            } else if (marks[i] >= 60) {
                subjectGrade[i] = "B";
            } else {
                subjectGrade[i] = "C";
            }
        }

        // ---------- Calculate percentage ----------
        double percentage = (totalMarks* 100) / (5 * 100);

        // ---------- Decide overall grade ----------
        String grade;
        if (anyFail) {
            grade = "Fail";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 60) {
            grade = "B";
        } else if (percentage >= 40) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        // ---------- Print marksheet ----------
        System.out.println("\n==========================================");
        System.out.println("                    MARKSHEET               ");
        System.out.println("==========================================");
        System.out.println(" Name  : " + name);
        System.out.println("==========================================");
        System.out.println("Subject       Marks    Grade");
        System.out.println("------------------------------------------");

        for (int i = 0; i < 5; i++) {
	    if(subjectName[i].length()<8){
		 System.out.println(subjectName[i]+"\t\t"+ marks[i]+"\t"+subjectGrade[i]);
            }


            else{
		 System.out.println(subjectName[i]+"\t"+ marks[i]+"\t"+subjectGrade[i]);
            }
	}

        System.out.println("-------------------------------------------");
        System.out.println("Total Marks   : " + totalMarks + " / " + (5 * 100));
        System.out.printf("Percentage    : %.2f%%%n", percentage);
        System.out.println("Grade         : " + grade);
        System.out.println("===========================================");

        sc.close();
    }
}