package com.css.stringservice;

public class Main {

	public static void main(String[] args) {
		StringServiceProvider s=new StringServiceProvider();
		String rev=s.strRev("Athira");
		System.out.println("Reversed String:"+rev);
		s.linearSearch("Athira",'i');
		String replace=s.replace("Athira", 'i', 'a');
		System.out.println("Replaced String:"+replace);
	}
}