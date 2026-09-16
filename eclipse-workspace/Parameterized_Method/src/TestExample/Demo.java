package TestExample;

import java.util.Scanner;

public class Demo {

	public void m1(byte b) {
		System.out.println("------- Single Parameterized Method -------\n" + b);
	}

	public void m2(byte b, short s) {
		System.out.println("------- Double Parameterized Method -------\n" + b + " , " + s);
	}

	public void m3(byte b, short s, int i) {
		System.out.println("------- Three Parameterized Method -------\n" + b + " , " + s + " , " + i);
	}

	public void m4(byte b, short s, int i, long l) {
		System.out.println("------- Four Parameterized Method -------\n" + b + " , " + s + " , " + i + " , " + l);
	}

	public void m5(byte b, short s, int i, long l, float f) {
		System.out.println(
				"------- Five  Parameterized Method -------\n" + b + " , " + s + " , " + i + " , " + l + " , " + f);
	}

	public void m6(byte b, short s, int i, long l, float f, double d) {
		System.out.println("------- Six Parameterized Method ------- \n" + b + " , " + s + " , " + i + " , " + l + " , "
				+ f + " , " + d);
	}

	public void m7(byte b, short s, int i, long l, float f, double d, char c) {
		System.out.println("------- Seven Parameterized Method -------\n" + b + " , " + s + " , " + i + " , " + l
				+ " , " + f + " , " + d + " , " + c);
	}

	public void m8(byte b, short s, int i, long l, float f, double d, char c, boolean b1) {
		System.out.println("------- Eight  Parameterized Method -------\n" + b + " , " + s + " , " + i + " , " + l
				+ " , " + f + " , " + d + " , " + c + " , " + b1);
	}

	public void m9(byte b, short s, int i, long l, float f, double d, char c, boolean b1, String s1) {
		System.out.println("------- Nine Parameterized Method -------\n" + b + " , " + s + " , " + i + " , " + l + " , "
				+ f + " , " + d + " , " + c + " , " + b1 + " , " + s1);
	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Demo d = new Demo();
		byte b = 12;
		short s = 23;
		d.m1(b);
		d.m2(b, s);
		d.m3(b, s, 239);
		d.m4(b, s, 8956, 283499);
		d.m5(b, s, 485, 904847, 56.6f);
		d.m6(b, s, 3294, 324942, 349.34f, 283.355);
		d.m7(b, s, 232, 3237823, 34.32f, 248348, 'A');
		d.m8(b, s, 21, 2389, 23.323f, 3239, 'B', true);
		d.m9(b, s, 2323, 2393, 230.23f, 23823.2323, 'Z', true, "Saurabh");
	}

}
