package 제어문;

import javax.swing.JOptionPane;

public class 예제2 {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("먹고 싶은 음식을 입력하세요");
		String r = "";
		if (a.equals("아이스크림")) {
			r = "뚜레주르로 가요";
		}else if(a.equals("아이스커피")){
			r = "이디야로 가요";
		}else {
			r = "물 마셔요";
		}
		System.out.println(r);
	}
}
