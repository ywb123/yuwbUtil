package com.ywb.test;

import com.ywb.util.Utils;

public class Test {

	public static void main(String[] args) {
		String str="123,45,0,a,123";
		System.out.println(Utils.stringToIntegerList(str, ",").toString());
	}

}
