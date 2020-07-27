package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
		String day = JOptionPane.showInputDialog("Is today a weekend?");
        
		// Set the boolean isWeekend based on the value they enter
		if(day.equalsIgnoreCase("yes")) {
			isWeekend = true ;
		}
		else if(day.equalsIgnoreCase("no")) {
			isWeekend = false ;
		}
		
		else {
			isWeekend = false;
		}
		
		// If it is the weekend, tell the user they get to sleep in.
		if(isWeekend == true) {
			JOptionPane.showMessageDialog(null, "You can sleep in today");
		}
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		if(isWeekend == false) {
			JOptionPane.showMessageDialog(null, "Get out of bed and go to school");
		}
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam
		String grade = JOptionPane.showInputDialog("What percentage did you score in your exam?");
		double gradeNum = Double.parseDouble(grade);

		
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		if(gradeNum > 70) {
			passedExam = true;
		}
		
		else if(gradeNum <= 70) {
			passedExam = false;
		}
		
		else {
			passedExam = false;
		}
		
		// If the user passed the exam, congratulate them
		if(passedExam == true) {
			JOptionPane.showMessageDialog(null, "Congratulation!!!");
		}
		
		// otherwise, wish them better luck next time.
		if(passedExam == false) {
			JOptionPane.showMessageDialog(null, "Better luck next time");
		}
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		if(gameIsOver == true) {
			JOptionPane.showMessageDialog(null, "Game is over");
		}
		
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String color = JOptionPane.showInputDialog("What color should I draw with?");
		if(color.equalsIgnoreCase("red")) {
			isRed = true;
		}
		else {
			isRed = false;
		}
		
		
		boolean isSquare;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		String shape = JOptionPane.showInputDialog("What shape should I draw ?");
		if(shape.equalsIgnoreCase("square")) {
			isSquare = true;
		}
		else {
			isSquare = false;
		}
		
		
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		
		if(isRed == true && isSquare == true) {
			drawRedSquare();
		}
		
		else {
			JOptionPane.showMessageDialog(null, "I do not know how to draw that shape");
		}
		

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot("mini");
		// Complete the rest of this method
		rob.penDown();
		rob.setSpeed(100);
		rob.setPenColor(255, 0, 0);
		
		rob.move(30);
		rob.turn(90);
		rob.move(30);
		rob.turn(90);
		rob.move(30);
		rob.turn(90);
		rob.move(30);
			
		
	}	
}
