package ParameterizedConstructor;

public class Demo {

	Demo(){
		System.out.println("---- Default Constructor ----");
	}
	Demo(byte b){
		System.out.println("---- One Parameterized Constructor ----");
	}
	Demo(byte b , short s){
		System.out.println("---- Two Parameterized Constructor ----");
	}
	Demo(byte b , short s , int i){
		System.out.println("---- Three Parameterized Constructor ----");
	}
	Demo(byte b , short s , int i , long l){
		System.out.println("---- Four Parameterized Constructor ----");
	}
	Demo(byte b , short s , int i , long l , float f){
		System.out.println("---- Five Parameterized Constructor ----");
	}
	Demo(byte b , short s , int i , long l , float f , double d){
		System.out.println("---- Six Parameterized Constructor ----");
	}
	Demo(byte b , short s , int i , long l , float f , double d , char c){
		System.out.println("---- Seven Parameterized Constructor ----");
	}
	Demo(byte b , short s , int i , long l , float f , double d , char c , boolean b1 ){
		System.out.println("---- Eight Parameterized Constructor ----");
	}
	Demo(byte b , short s , int i , long l , float f , double d , char c , boolean b1 , String s1){
		System.out.println("---- Nine Parameterized Constructor ----");
	}
	
	
	public static void main(String[] args) {
		byte b = 12; short s = 12083;
		Demo d = new Demo();
		Demo d1 = new Demo(b);
		Demo d2 = new Demo(b, s);
		Demo d3 = new Demo(b, s, 2646);
		
	}
}
