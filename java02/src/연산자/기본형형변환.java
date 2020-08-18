package 연산자;

public class 기본형형변환 {

	public static void main(String[] args) {
		// 큰<-작
		// int x = 100; // int는 -21억 ~ 21억 , 4바이트
		// byte y = 120; // byte -128~127 , 1바이트
		// x = y;

		// System.out.println("x : "+ x);

		// int z = 127;
		// 작<-큰 : 강제형변환 ()사용
		// (자르고 싶은 데이터형)변수명

		// byte w = (byte)z;

		// byte w = (byte)z;
		// int q = 1000;
		// byte t = q;
		// 강제형변환하는 경우는
		// 강제로 변환하고자 하는 타입범위에
		// 값이 들어가야 한다!
		
		//---------------------------------------------------------------------------
		//예시

		// byte x = 100;
		// int y = x; //가능 자동 형변환

		// int x = 300;
		// byte y = x; //127을 넘아가서 byte에 들어갈 수 없음

		//double x = 400;
		//int y = (int)x; //더블의 자료형이 int 보다 크기때문에 변환 x 강제형변환

		int x = 400;
		double y = x; // 자동형변환
	}

}
