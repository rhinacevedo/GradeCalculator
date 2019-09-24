/* name: Rhina Acevedo, Section 320, lab teacher: Sarfraz Khan, 
 * The purpose of this program is to calculate final marks and give a percentage.
 * Assignment 1, Date: 2018/10/04
 */

import java.util.Scanner;

public class Assign1 {

	public static void main(String[] args) 

	{
		Scanner xyz=new Scanner(System.in);
		
		System.out.println("Welcome to the CST8110 final Mark calculator:");
		
		System.out.print("\nEnter your lab mark out of 10: "); // calculate with 7.5 
		float lab = xyz.nextFloat();
		
		System.out.print("Enter your Quiz/Test Mark out of 10: "); //5
		float quiz = xyz.nextFloat();
		
		System.out.print("Enter your Assignment mark out of 20: "); //18
		float assignment = xyz.nextFloat();
		
		System.out.print("Enter your Midterm mark out of 20: "); //15
		float midterm = xyz.nextFloat();
		
		System.out.print("Enter your Final exam mark out of 40: "); //32
		float finalexam = xyz.nextFloat();
		
		float lab2 = lab/10;
		float lab3 = lab2*100;
		
		float quiz2 = quiz/10;
		float quiz3 = quiz2*100;
		
		float assignment2 = assignment/20;
		float assignment3 = assignment2*100;
		
		float midterm2 = midterm/20;
		float midterm3 = midterm2*100;
				
		float finalexam2 =  finalexam/40;
		float finalexam3 = finalexam2*100;

		
		float addtheoryGrade = quiz + midterm + finalexam;
		float totaltheoryGrade = ((addtheoryGrade/70) *100)*100;
		float perTheoryGrade= Math.round(totaltheoryGrade);
		
		float addpracticalGrade = lab + assignment;
		float totalpracticalGrade = ((addpracticalGrade/30)*100) *100;
		float perPracticalGrade= Math.round(totalpracticalGrade);
		
		float finalGrade= ((addtheoryGrade + addpracticalGrade)*100);
		float perFinalGrade= Math.round(finalGrade);
		
		System.out.println('\n' + "1) Your total Theory grade is: " +  perTheoryGrade/100  + '%'+ '.');
		System.out.println("2) Your Practical grade id: " + perPracticalGrade/100  + '%'+  '.');
		System.out.println("3) Your Total Final grade is: " + perFinalGrade/100  + '%' + '.');
		
        /* If used the numbers bellow in comments the result has to be: 
		/theory: 74.29%
		/practical: 85.0%
		/ final: 77.5% as listed in the pdf.
		*/

	}

}
