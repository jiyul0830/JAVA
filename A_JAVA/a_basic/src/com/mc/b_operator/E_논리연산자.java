package com.mc.b_operator;

public class E_논리연산자 {

	
	// 논리연산자 : &&, ||
	// && : 두 항이 모두 true 일 때 true, ~면서, 그리고 , and
	// || : 두 항이 모두 false 일 때, false, 또는, ~거나, or
	//      두 항 중 한 항이 true이면 true이다.
	
	public static void main(String[] args) {
		
		System.out.println(2 >=2 || 2 > 3); // true || false === true
		System.out.println(2 > 1 || 3 > 2); // true || true === true
		System.out.println(3 < 2 || 2 > 3); // false || false === false
		System.out.println(2 < 2 || 2 < 3); // false || true ==== true
		
		System.out.println(2 >=2 && 2 > 3); // true && false === false
		System.out.println(2 > 1 && 3 > 2); // true && true === true
		System.out.println(3 < 2 && 2 > 3); // false && false === false
		System.out.println(2 < 2 && 2 < 3); // false && true ====false
		
		boolean a = true;
		boolean b = false;	
		boolean c = false;
		boolean d = false;
		
		// 아래 논리연산의 출력값을 예상해보세요
		System.out.println(a || b && c || d); // true ( true || false && false || false )
		// && 가 || 보다 우선순위여서 b && c 먼저 계산 -> a || (b && c) || d
		// 순서대로 계산하지 말고 꼭 우선순위 따지자!
		// 수학과 같이 괄호 ()에 값을 넣어주면 우선순위가 바뀐다 -> 괄호 먼저 계산
		
		
		
		
		
	}
	
	
}
