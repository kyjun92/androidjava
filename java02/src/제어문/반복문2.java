package 제어문;

public class 반복문2 {
	public static void main(String[] args) {
		//정해진 횟수만큼 반복해보자.
// 1) 100부터 1까지 프린트
		int start = 100;//시작값
		int end = 1;//끝값
		//int add = -1;//증가값
		
		while (start >= end) { // 시작값이 종료값보다 크기 때문에 참으로 만들기위해 시작값을 크거나 같다라고 설정
			System.out.println(start); 
			start--; // 증가값을 -1로 설정하여 1씩 감소하도록 설정
		}
		System.out.println("------------------------------------------");
		
// 2) 5부터 10까지 프린트
		int start2 = 5;//시작값
		int end2 = 10;//끝값
		//int add2 = 1;//증가값
			
		while (start2 <= end2) { //시작값이 종료값보다 작기 때문에 작거나 같다고 설정
			System.out.println(start2);
			start2++; // 1씩 증가하도록 설정
		}
		System.out.println("------------------------------------------");
// 3) 1부터 100까지 중 2씩 증가하면서 프린트
		int start3 = 1;//시작값
		int end3 = 100;//끝값
		int add3 = 2;//증가값
				
		while (start3 <= end3) { // 시작값이 종료값보다 작기 때문에 작거나 같다고 설정
			System.out.println(start3);
			start3 += add3; //증가값을 2로 주어 2씩 증가하도록 설정
		}
		System.out.println("------------------------------------------");
	}
}
