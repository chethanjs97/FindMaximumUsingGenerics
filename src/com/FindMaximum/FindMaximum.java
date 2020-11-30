package com.FindMaximum;

import java.util.Scanner;

public class FindMaximum {
	
	public static Integer findMax(Integer a, Integer b, Integer c) {
		Integer max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(findMax(10, 16, 8));

	}

}
