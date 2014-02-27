package com.companyname.col;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args)
	{
		Set<String> ss = new HashSet<>();
		/* HashSet permite null's y solo agregara uno */
		String[] fruits = {"apples", "pears", "grapes", "bananas", "kiwis", null, null };
		for (String fruit: fruits)
			ss.add(fruit);
		dump("ss:", ss);
	}
	static void dump(String title, Set<String> ss)
	{
		System.out.print(title+" ");
		for (String s: ss)
			System.out.print(s+" ");
		System.out.println();
	}

}
