package ParametrizedMethodProject;

import java.util.Scanner;

public class Allstudent {
	Student s1 ,s2 ,s3;
Allstudent(University u){
	s1 = new Student(u.rn1, u.name1, u.add1);
	s2 = new Student(u.rn2 , u.name2, u.add2);
	s3 = new Student(u.rn3, u.name3, u.add3);
}

}

