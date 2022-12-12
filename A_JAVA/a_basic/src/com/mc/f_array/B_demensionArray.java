package com.mc.f_array;

import java.util.Arrays;

public class B_demensionArray {

	public static void main(String[] args) {
		
		
		
		

	}

	
	//Array2_1();
	private static void Array2_1() {
		// 가변배열
		// 주소배열의 크기는 지정해야 하지만, 값을 저장할 배열의 크기는 지정하지 않고 2차원 배열을 초기화
		int [][] dArr = new int[2][];
		dArr[0] = new int[3];
		dArr[1] = new int[2];
		
		// 1~5 사이의 값을 dArr에 넣어보세요
		dArr[0] = new int[3];
		dArr[0][0] = 1;
		dArr[0][1] = 2;
		dArr[0][2] = 3;
		dArr[1] = new int[2];
		dArr[1][0] = 4;
		dArr[1][1] = 5;
		
		// 출력문
		for(int i = 0; i < dArr.length; i++) {
		System.out.println(Arrays.toString(dArr[i]));
		}

		
		// int val = 1;
		// for(int i = 0; i < dArr.length; i++) {
		//	int[] temp = dArr[i];
			
		//	for(int j = 0; j < temp.length; j++) {
		//		temp[i] = val++;
								
		//	}
						
		//  }
		// 출력
		// for(int i = 0; i < dArr.length; i++) {
		// System.out.println(Arrays.toString(dArr[i]));
		
		// }
	}

	//array2();
	private static void array2() {
		// 2차원 배열 선언
		// int 2차원 배열을 선언해보자
		// 2차원 배열은 1차원 배열을 여러개 보관하는 배열이다
		int[][]dArr;
		
		// 2차원 배열의 초기화
		// 크기가 4인 int[]를 3개 가지는 배열
		dArr = new int[3][4];
		dArr[0][0] = 1;
		dArr[0][1] = 2;
		dArr[0][2] = 3;
		dArr[0][3] = 4;
		
		System.out.println(dArr);
		System.out.println(dArr[0]);
		System.out.println(dArr[0][0]);
	}

}
