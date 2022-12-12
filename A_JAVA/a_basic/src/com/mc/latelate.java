package com.mc;

public class latelate {

	// StringBuilder : 문자열 값을 수정하는 mutable 객체
	// thread 동기화를 지원하지 않는다
	
	public void concatWithStringBuilder() {
		StringBuilder builder = new StringBuilder("ABC");
		System.out.println("결합 전 : "+ System.identityHashCode(builder));
		
		builder.append("D");
		System.out.println(builder);
		System.out.println("결합 후 :" + System.identityHashCode(builder));
		
		String res = builder.toString();
		System.out.println(res);
		
	}
	
	// StringBuffer : 문자열 값을 수정하는 mutable 객체
	// thread 동기화를 지원하지 않는다
		
		public void concatWithStringBuffer() {
			StringBuilder Buffer = new StringBuffer("ABC");
			System.out.println("결합 전 : "+ System.identityHashCode(Buffer));
			
			Buffer.append("D");
			System.out.println(Buffer);
			System.out.println("결합 후 :" + System.identityHashCode(Buffer));
			
			String res = Buffer.toString();
			System.out.println(res);
			
		}
		
	
}
