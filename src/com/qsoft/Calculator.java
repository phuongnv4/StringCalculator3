package com.qsoft;

import java.util.regex.Pattern;

public class Calculator {

	public static int add(String str) {

		String delimiter = "";
		if (str == null) {
			return 0;
		}
		if (str.isEmpty()) {
			return 0;
		}

		if (str.contains("//[") && str.contains("][")) {
			String delimiter1 = str.substring(str.indexOf("[") + 1,
					str.indexOf("]"));
			String delimiter2 = str.substring(
					str.indexOf("[", str.indexOf("]") + 1) + 1,
					str.indexOf("]", str.indexOf("]") + 1));
			System.out.println("delimiter1=" + delimiter1 + ":"
					+ str.indexOf("[") + ":" + str.indexOf("]"));
			System.out.println("delimiter2=" + delimiter2);
			str = str.replace("//[", "");
			str = str.replace("][", "");
			str = str.replace("]\n", "");

			String strTemp1 = "";
			String[] str1 = str.split(Pattern.quote(delimiter1));
			for (int i = 0; i < str1.length; i++) {
				if (str1[i].isEmpty()) {
					continue;
				}
				String[] str2 = str1[i].split(Pattern.quote(delimiter2));
				for (int j = 0; j < str2.length; j++) {
					if (str2[j].isEmpty()) {
						continue;
					}
					strTemp1 += str2[j] + ",";
				}
			}

			System.out.println("strTemp1=" + strTemp1);

			String[] strTemp = strTemp1.split(",");

			return sum(strTemp);
		} else if (str.contains("//[")) {
			delimiter = str.substring(str.indexOf("[") + 1, str.indexOf("]"));
			str = str.replace("//[", "");
			str = str.replace("]\n", "");
			String[] strTemp = str.split(Pattern.quote(delimiter));

			return sum(strTemp);
		} else if (str.contains("//")) {

			delimiter = str.substring(2, 3);
			str = str.replace("//", "");
			str = str.replace("\n", "");
			String[] strTemp = str.split(delimiter);

			return sum(strTemp);
		}

		else if (str.contains("\n")) {
			str = str.replace("\n", "");
			String[] strTemp = str.split(",");

			return sum(strTemp);
		} else {
			String[] strTemp = str.split(",");

			return sum(strTemp);
		}

	}

	public static int sum(String[] str) {
		int sum = 0;
		int strTempSize = str.length;
		for (int i = 0; i < strTempSize; i++) {
			String str1 = str[i];
			if (str1.isEmpty()) {
				continue;
			}
			sum += Integer.parseInt(str1);
		}
		return sum;
	}
}
