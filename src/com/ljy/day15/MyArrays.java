package com.ljy.day15;

import java.util.Arrays;
import java.util.List;

public class MyArrays {
	public static void main(String[] args) {
		//简单数据类型的数组转字符串
		int[] arr = new int[] {1,4,35,7};
		//打印的是数组的地址
		System.out.println(args.toString());
		System.out.println(Arrays.toString(arr));
		List<int[]> asList = Arrays.asList(arr);
		System.out.println(asList);
		String[]strs = {"Hello","Java","Php"};
		List<String> asList2 = Arrays.asList(strs);
		asList2.set(0, "World");
		test();
		
		testBinarySearch();
	}
	
	private static void test(int...arr) {
		System.out.println("Hello");
	}
	
	private static void testBinarySearch() {
		int []aar = {1,2,3,4,5,6};
		int i = 4;
		int index = Arrays.binarySearch(aar, i);
		System.out.println("二分查找:"+index);
	}
}
