package com.automation.framework.utils;

import org.apache.commons.lang3.StringUtils;

public class Reverse {
	public static void main(String[] args) {
		int num = 123;

		String snum = String.valueOf(num);

		System.out.println(StringUtils.reverse(snum));
	}
}
