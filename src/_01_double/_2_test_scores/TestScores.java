package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String args [] ) {
		String testScore = JOptionPane.showInputDialog("What is your test score?");
		double testScoreNum = Double.parseDouble(testScore);
		
		if(testScoreNum >= 90) {
			JOptionPane.showMessageDialog(null, "Excellent! You must have studied very hard");
		}
		
		else if(testScoreNum >= 80) {
			JOptionPane.showMessageDialog(null, "Good Job! You must have studied hard");
		}
		
		else if(testScoreNum >= 70) {
			JOptionPane.showMessageDialog(null, "Good Work! You should study a little harder");
		}
		
		else if(testScoreNum >= 60) {
			JOptionPane.showMessageDialog(null, "Nice Try! You should study a harder");
		}
		
		else{
			JOptionPane.showMessageDialog(null, "You should study a lot harder");
		}
	}

}
