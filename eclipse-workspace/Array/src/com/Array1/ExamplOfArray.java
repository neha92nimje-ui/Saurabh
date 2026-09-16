package com.Array1;

public class ExamplOfArray {

	public static void main(String[] args) {

		// Declaration of Array
		int[] id = new int[2];
		String[] name = new String[5];

		// First Way of Initialization Of Array

		id[0] = 1;
		id[1] = 2;

		name[0] = "Saurabh";
		name[1] = "Nilima";
		name[2] = "Sameer";
		name[3] = "Rushikesh";
		name[4] = "Sejal";
		
		System.out.println(id[0] +  " " + id[1]);

		System.out.println("The Name of First Index is : " + name[0] + "\nThe Name of Second  Index is : " + name[1]
				+ "\nThe Name of Third Index is : " + name[2] + "\nThe Name of Fourth Index is : " + name[3]
				+ "\nThe Name of Fifth Index is : " + name[4]);

		// Second Way Of Initialization of Array

		boolean[] flags = { true, false, false, true };

		System.out.println("The Boolean value of First Index is : " + flags[0]
				+ "\nThe Boolean value of Second Index is : " + flags[1] + "\nThe Boolean value of Third Index is : "
				+ flags[2] + "\nThe Boolean value of Fourth Index is : " + flags[3] + "\nThe Length of Flag Array is : "
				+ flags.length);

	}
}
