//Denny To
//CSCI 1301
//Program One
import java.util.Scanner;
import java.text.DecimalFormat;
public class ToDennyProgramOne {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		
		//User input for Lab One
		double labOneGrade;
		System.out.print("Enter your Lab One grade: ");
		Scanner scnr1 = new Scanner(System.in);
		labOneGrade = scnr1.nextDouble();

		//User input for Lab Two
		double labTwoGrade;
		System.out.print("Enter your Lab Two grade: ");
		Scanner scnr2 = new Scanner(System.in);
		labTwoGrade = scnr2.nextDouble();
		
		//User input for Lab Three
		double labThreeGrade;
		System.out.print("Enter your Lab Three grade: ");
		Scanner scnr3 = new Scanner(System.in);
		labThreeGrade = scnr3.nextDouble();
		
		//User input for Program One
		double ProgramOneGrade;
		System.out.print("Enter your Program One grade: ");
		Scanner scnr4 = new Scanner(System.in);
		ProgramOneGrade = scnr4.nextDouble();

		//User input for Program Two
		double ProgramTwoGrade;
		System.out.print("Enter your Program Two grade: ");
		Scanner scnr5 = new Scanner(System.in);
		ProgramTwoGrade = scnr5.nextDouble();

		//User input for Program Three
		double ProgramThreeGrade;
		System.out.print("Enter your Program Three grade: ");
		Scanner scnr6 = new Scanner(System.in);
		ProgramThreeGrade = scnr6.nextDouble();

		//User input for Program Four	
		double ProgramFourGrade;
		System.out.print("Enter your Program Four grade: ");
		Scanner scnr7 = new Scanner(System.in);
		ProgramFourGrade = scnr7.nextDouble();

		//User input for Program Five
		double ProgramFiveGrade;
		System.out.print("Enter your Program Five grade: ");
		Scanner scnr8 = new Scanner(System.in);
		ProgramFiveGrade = scnr8.nextDouble();

		//Average Programs/Labs grade is calculated
		double hwlabAvgGrade;
		hwlabAvgGrade = ((labOneGrade+labTwoGrade+
						labThreeGrade+ProgramOneGrade+
						ProgramTwoGrade+ProgramThreeGrade+
						ProgramFourGrade+ProgramFiveGrade)/8);
		//Average Programs/Labs grade is rounded to two decimal places
		DecimalFormat df = new DecimalFormat("###.##");
		System.out.println("Your Programs/Labs grade (40% of Final Grade): "
							+ df.format(hwlabAvgGrade));
		
		//User input for Test One
		double testOneGrade;
		System.out.print("Enter your Test One grade (15% of Final Grade): ");
		Scanner scnr9 = new Scanner(System.in);
		testOneGrade = scnr9.nextDouble();
		
		//User input for Test Two
		double testTwoGrade;
		System.out.print("Enter your Test Two grade (15% of Final Grade): ");
		Scanner scnr10 = new Scanner(System.in);
		testTwoGrade = scnr10.nextDouble();
		
		//User input for Final Exam
		double finalExamGrade;
		System.out.print("Enter your Final Exam grade (30% of Final Grade): ");
		Scanner scnr11 = new Scanner(System.in);
		finalExamGrade = scnr11.nextDouble();

		//Calculation for Final Grade
		double finalGrade;
		finalGrade = (hwlabAvgGrade*(0.4))+(testOneGrade*(0.15))+
					(testTwoGrade*(0.15))+(finalExamGrade*(0.30));
		//Final grade is rounded to two decimal places
		System.out.print("Your Final Grade is: " + df.format(finalGrade));
		
		//if else statement for letter grade
		if(finalGrade>=90) {
			System.out.print(". You made an A in the class.");
		} 
		else if(finalGrade>=80){
			System.out.print(". You made a B in the class.");
		}
		else if(finalGrade>=70){
			System.out.print(". You made a C in the class.");
		}
		else if(finalGrade>=60){
			System.out.print(". You made a D in the class.");
			
		}
		else if(finalGrade<60){
			System.out.print(". You made a F in the class.");
		}
		
	}

}
