package ex_240510_TEST;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class StudentScore {

	public static void main(String[] args) {
		
		int[][] score = {
				 	{80,60,70}, 
				 	{90,95,80}, 
				 	{75,80,100}, 
				 	{80,70,95}, 
				 	{100,65,80}
				};
		
		int korTotal = 0;
		int engTotal = 0;
		int mathToal = 0;
		
		System.out.println("학생번호   국어   영어  수학  총점  평균");
		System.out.println("==================================");
		
		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			float avg = 0.0f;
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathToal += score[i][2];
			System.out.printf("%3d번 학생", i+1);
			
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%5d", score[i][j]);
			}
			avg = sum/(float)score[i].length;
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		System.out.println("==================================");

	}

}
