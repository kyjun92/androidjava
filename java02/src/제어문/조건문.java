package 제어문;

import javax.swing.JOptionPane;

public class 조건문 {
	public static void main(String[] args) {
		//조건이 여러개 일 때, if~else if~.....~else
		//if, if, if, if, if,if ...........
		String score = JOptionPane.showInputDialog("점수를 입력하세요");
		int sc = Integer.parseInt(score);
		if(sc >= 90) {
			System.out.println("A");
		}else if(sc >= 80) {
			System.out.println("B");
		}else if(sc >= 70) {
			System.out.println("C");
		}else if (sc >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
