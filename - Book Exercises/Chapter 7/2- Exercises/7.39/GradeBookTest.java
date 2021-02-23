/* We modified this class to input the number of students and number of exams 
for the gradeBook and to allow the instructor to enter one grade at a time. */

// Fig. 7.19: GradeBookTest.java
// GradeBookTest creates GradeBook object using a two-dimensional array  
// of grades, then invokes method processGrades to analyze them.
import java.util.Scanner;

public class GradeBookTest
{
	// main method begins program execution
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter student number: ");
		int studentNumber = input.nextInt();
		System.out.print("Enter exam number: ");
		int examNumber = input.nextInt();

		GradeBook myGradeBook = new GradeBook(
			"CS101 Introduction to Java Programming", studentNumber, examNumber);
		System.out.printf("Welcome to the grade book for%n%s%n%n",
			myGradeBook.getCourseName());

		int studentID;
		int examID;
		int examScore;

		do
		{
			System.out.printf("Enter studentID[0-%d] or enter -1 to exit: ",
				studentNumber - 1);
			studentID = input.nextInt();
			if (studentID == -1)
				break;
			System.out.printf("Enter examID[0-%d]: ", examNumber - 1);
			examID = input.nextInt();
			System.out.print("Enter examScore: ");
			examScore = input.nextInt();
			myGradeBook.setGrade(studentID, examID, examScore);
		} while (true);

		myGradeBook.processGrades();
	}
} // end class GradeBookTest

/**
 * ************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and * Pearson Education,
 * Inc. All Rights Reserved. * * DISCLAIMER: The authors and publisher of this
 * book have used their * best efforts in preparing the book. These efforts
 * include the * development, research, and testing of the theories and programs
 * * to determine their effectiveness. The authors and publisher make * no
 * warranty of any kind, expressed or implied, with regard to these * programs
 * or to the documentation contained in these books. The authors * and publisher
 * shall not be liable in any event for incidental or * consequential damages in
 * connection with, or arising out of, the * furnishing, performance, or use of
 * these programs. *
 ************************************************************************
 */
