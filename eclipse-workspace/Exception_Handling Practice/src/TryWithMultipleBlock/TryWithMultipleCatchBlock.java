package TryWithMultipleBlock;

import java.util.Scanner;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
		System.out.println("====== Main Method =====");
		try (Scanner sc = new Scanner(System.in);) {
			int i = 10;
			System.out.print("Enter The Number : ");
			int num = sc.nextInt();
			System.out.println(i/num);
			
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
//			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("====== Main Method End ======");

	}
}
