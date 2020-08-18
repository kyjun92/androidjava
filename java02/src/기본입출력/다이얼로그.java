package 기본입출력;

import javax.swing.JOptionPane;

public class 다이얼로그 {

	public static void main(String[] args) {
//		//자바에서는의 코딩 방식
//		//특정한 일을 처리하는 부품을 만들어 전담시킨다.
//		//자바에서는 자주 사용되는 부품은 
//		//미리 메모리에 가져다놓고 있음
//		//부품의 이름은 대문자로 시작해서 사용하면 된다.
//		String hour = JOptionPane.showInputDialog("지금 몇시인가요?");
//		JOptionPane.showMessageDialog(null, hour + "시입니다."); // null == empty
//		//기능을 처리를 해주는 단위: function(함수)
//		
//		//int(기본형) <= String(문자열) 불가능
//		//형변환 가능한 부품을 써야함.
//		int hour2 = Integer.parseInt(hour);
//		
//		if (hour2 < 16) { //조건문에는 비교연산자를 쓰고, 비교연산자의 결과는 논리
//			JOptionPane.showMessageDialog(null, "아직 집에 갈 시간이 멀었군요.");
//		} else {
//			JOptionPane.showMessageDialog(null, "fdkslafjlsakf");j
//		}
//
//	}
		//-----------------------------------------------------
		System.out.print("1번 : ");
		
		String a = JOptionPane.showInputDialog("숫자를 입력하세요 :");
		String b = JOptionPane.showInputDialog("숫자를 입력하세요 :");
		
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		
		System.out.println(a1+b1);
		
		System.out.println("-------------------------------------------");
		
		//--------------------------------------------------------
		
		System.out.println("2번 : ");
		String x = JOptionPane.showInputDialog("시작값를 입력하세요 :");
		String y = JOptionPane.showInputDialog("종료값를 입력하세요 :");
		
		int x1 = Integer.parseInt(x);
		int y1 = Integer.parseInt(y);
		if(x1<=y1) {
			for(;x1<=y1; x1++) {
				System.out.print(x1 + " ");
			}
		}
		else {
			for(;y1<=x1; y1++) {
				System.out.print(y1 + " ");
			}
		}
		System.out.println("");
		
		System.out.println("-------------------------------------------");
		
		String i = JOptionPane.showInputDialog("반복 횟수를 입력하세요 :");
		String j = JOptionPane.showInputDialog("문자를 입력하세요 :");
		
		int i1 = Integer.parseInt(i);
		
		for(int k = 0; k < i1; k++) {
			System.out.print(j + " ");
		}
		
		
		
	}
}

