package org.string;

public class StringMethods {
	public static void main(String[] args) {
		String str1="welcome to eclipse";
		String str2="welcome to project";
		int length = str1.length();
		System.out.println(length);
		boolean empty = str1.isEmpty();
		System.out.println(empty);
		char charAt = str1.charAt(11);
		System.out.println(charAt);
		int indexOf = str1.indexOf("c");
		System.out.println(indexOf);
		int lastIndexOf = str1.lastIndexOf("c");
		System.out.println(lastIndexOf);
		int indexOf2 = str1.indexOf("b");
		System.out.println(indexOf2);
		String upperCase = str1.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = str1.toLowerCase();
		System.out.println(lowerCase);
		boolean startsWith = str1.startsWith("w");
		System.out.println(startsWith);
		boolean endsWith = str1.endsWith("eclipse");
		System.out.println(endsWith);
		String replace = str1.replace("e", "*");
		System.out.println(replace);
		String replaceAll = str1.replaceAll("to", "all");
		System.out.println(replaceAll);
		String trim = str1.trim();
		System.out.println(trim);
		String substring = str1.substring(5);
		System.out.println(substring);
		String substring2 = str1.substring(3, 8);
		System.out.println(substring2);
		String[] split = str1.split(" ");
		for (String string : split) {
			System.out.println(string);
			
		}
		
		boolean equals = str1.equals(str2);
		System.out.println(equals);
		boolean equalsIgnoreCase = str1.equalsIgnoreCase(str2);
		System.out.println(equalsIgnoreCase);
		String concat = str1.concat(str2);
		System.out.println(concat);
		
	
	}

}
