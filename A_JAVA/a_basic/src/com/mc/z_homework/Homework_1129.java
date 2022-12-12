package com.mc.z_homework;

import java.util.Scanner;

public class Homework_1129 {

	public static void main(String[] args) {
		
				
			}

//q5(구구단)();
	private static void q5() {
		//q5. 
		//사용자로부터 정수 하나를 입력받아 
		//정수가 1~9사이의 숫자라면 그 수의 구구단을 출력하시오
		//1~9사이의 숫자가 아니라면 "1~9 사이의 숫자를 입력해야합니다"를 출력
				
		// ex)
		//	정수 : 5
		//	5*1=10
		//	5*2=15
		//	5*3=20
		//	5*4=25
		//	5*5=30
		//	5*6=35
		//	5*7=40
		//	5*8=45
		//	5*9=50

					Scanner sc = new Scanner(System.in);
					System.out.print("정수 : ");
					int dan = sc.nextInt();
					int su = 1;
					
					if(dan < 1 || dan > 9) {
						System.out.println("1~9사이의 숫자를 입력하세요");
						return;
					}
					
					while(su < 10) {
						System.out.println(dan + "*" + su++ + "=" +(dan*su));
					}
	}

//q4(가위바위보)();
	private static void q4() {
		// q4. 1P유저로부터 가위/바위/보 중 하나를 입력받으세요
		// 2P유저로부터 가위/바위/보 중 하나를 입력받으세요.
		// 1P유저기준에서 승/패/비김 여부를 출력해주세요.
				
				Scanner sc = new Scanner(System.in);
				System.out.print("1P :" );
				String p1 = sc.next();
				System.out.print("2P : ");
				String p2 = sc.next();
				
				if(p1.equals(p2)) {
					System.out.println("비겼습니다.");
					return;
				}
				
				if(p1.equals("가위") && p2.equals("보")) {
					System.out.println("이겼습니다.");
				}else if (p1.equals("바위") && p2.equals("가위")) {
					System.out.println("이겼습니다.");
				}else if(p1.equals("보") && p2.equals("바위")) {
					System.out.println("이겼습니다.");
				}else {
					System.out.println("졌습니다.");
				}
	}

//q3(짝홀)();
	private static void q3() {
		//q3. 사용자가 입력한 정수가 짝수 인지 판단하고
		//짝수라면 '짝수 입니다.'
		//홀수라면 '홀수 입니다.' 를 출력하세요. 
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("숫자를 입력하세요 : ");
				int input = sc.nextInt();
				String comment = "";
				
				if((input % 2) == 0) {
					comment = "짝수 입니다.";
				} else {
					comment = "홀수 입니다.";
				}
				
				System.out.println(comment);
				
				// 삼항연산자로 풀어보기
	}

//q2(로그인)();
	private static void q2() {
		//q2. 사용자로 부터 아이디와 비밀번호를 입력받아
		// 사용자가 알맞은 아이디와 비밀번호를 입력하였다면, '로그인 되었습니다'를 출력하고
		// 아이디와 비밀번호가 맞지 않다면 '누구야 당신?' 을 출력하세요
		// 아이디 : test / 비밀번호 : java
				
				Scanner sc = new Scanner(System.in);
				
				System.out.print("아이디 : ");
				String id = sc.nextLine();
				
				System.out.print("비밀번호 : ");
				String password = sc.nextLine();
				
				if (id.equals("test") && password.equals("java")) {
					System.out.println("로그인 되었습니다");
					} else {
						System.out.println("누구야 당신?");
					}
	}

//q1(사다리꼴)();
	private static void q1() {
		// q1. 사용자로 부터 사다리꼴의 윗변, 아랫변, 높이를 입력받아 넓이를 구하시오 
		// 사용자로 부터 정수를 하나 입력 받으세요
				
				Scanner sc = new Scanner(System.in);
				
				System.out.print("사다리꼴의 윗변 : ");
				int upper = sc.nextInt();
				
				System.out.print("사다리꼴의 아랫변 : ");
				int under = sc.nextInt();
					
				System.out.print("사다리꼴의 높이 : ");
				int height = sc.nextInt();
				
				System.out.println((upper + under) * height / 2 );
				
				// 강사님이 쓰신 방법
				// int res = (upper + under)*height/2
				// System.out.println(res);
	}

	}

