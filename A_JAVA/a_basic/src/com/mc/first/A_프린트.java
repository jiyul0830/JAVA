package com.mc.first;

public class A_프린트 {

	public static void main(String[] args) {

		int age = 30;
		String name = "진혜원";
		double height = 168;
		
		// 1. println() : 매개변수로 전달된 값을 출력하고 개행(줄바꿈)한다.
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " +  height);
		
		// 2. print() : 매개변수로 전달된 값을 출력하고 개행(줄바꿈을)하지 않음.
		System.out.print("이름 : " + name);
		System.out.print("나이 : " + age);
		System.out.print("키 : " +  height);
		System.out.println();
		System.out.print("==================================");
		System.out.println();
		
		// 3. printf() : 원하는 형식으로 문자열을 출력할 수 있다.
		//  %d : 정수형, %c : 문자, %s : 문자열, %f : 실수형, %b : 논리형
		//   정렬방식 : %와 영소문자 사이에 값을 표기하기 위해 숫자만큼의 공간을 확보, 우측 정렬
		//     ex) %5d : 5칸 공간 확보, 우측 정렬
		//     ex) %-5d : 5칸 공간 확보, 좌측 정렬
		//     ex) %.2f : 소수점 아래 2자리까지 표기
		
		System.out.printf("내 이름은 %s, 나이는 %d, 키는 %f 입니다.", "진혜원", 30, height / 168);
		
		System.out.println();
		System.out.println("===========================================");
		System.out.printf("%30s : 5000원", "김밥");
		System.out.println();
		System.out.printf("%-30s : 10000원", "돈까스");
		System.out.println();
		System.out.printf("%5s : 50000원", "김치찌개");
		System.out.println();
		
		// escape문자 : 특수한 역할을 하는 문자. \와 함께 사용
		
		// 1. 줄바꿈 : \n, \r\n (r:return / n:change line)
		System.out.println("나는 \n 밥을 \n 먹었다.");
		
		// 2. tab : 띄어쓰기보다 조금 더 띄어쓰기/정렬(한두칸정도)
		System.out.println("나는 \t 자바가 쉬워요.");
		System.out.println("나아는 \t 자바가 쉬워요.");
		System.out.println("나아아는 \t 자바가 쉬워요.");
		
		// 3. 16진수/8진수 출력법
		System.out.println("16진수 1000 : " + 0x100);
		System.out.println("8진수 1000 : " + 0100);
	
		// 4. \(역슬래시) : 문자열로 사용하는 것들 ("", \) 앞에 붙여서 나타낼 수 있도록
		// " 을 문자로 사용 : \"
		// ' 을 문자로 사용 : \'
		// \ 을 문자로 사용 : \\
		
		System.out.println("\"");
		System.out.println("\\");
		
		// 유니코드 표기법
		
		
		
		
		
		
		
	
		
		
		
		
		
	}

}
