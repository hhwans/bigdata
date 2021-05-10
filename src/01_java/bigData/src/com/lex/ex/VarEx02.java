package com.lex.ex;

public class VarEx02 {
	public static void main(String[] args) {
		int i = 10; // 4byte 짜리 i 주머니에 10을 할당
		byte j = 20; // 1byte 짜리 j 주머니에 20을 할당
		double d = 1; // 8byte 짜리 d 주머니에 0.1을 할당
		char c = 'C'; // 2byte 짜리 문자 c주머니에 '씨'를 할당
		boolean ok = true;
		long l = 2200000000L;
		System.out.println("i\t j\t d"); //\t탭 println 개행포함
		System.out.println(i+"\t"+j+"\t"+d);
		System.out.print("변수 c의 값과 코드\n"); // print 는 개행 미포함
		System.out.printf("c=%c, c의 코드값=%d\n", c, (int)c);
		System.out.printf("ok=%b\n", 1);
		System.out.printf("d=%5.2f",d);
		// %d(정수) %f(실수) %b(불린) %c(문자) %s(문자열)
		
	}
}
