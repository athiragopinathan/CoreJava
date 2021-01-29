package com.css.basic;

public class StringServiceProvider {

	public StringServiceProvider() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="athira";
		int len=0,i=0;
		try {
			while(true) {
		
				if(str.charAt(i)!='\0')
					len++;
				i++;
			}
		}catch(Exception e) {
			System.out.println(len);
		}
		for(int j=len-1;j>=0;j--)
			System.out.print(str.charAt(j));
		
		char search='t';
		for(int k=0;k<len-1;k++) {
			if(str.charAt(k) == search) {
				System.out.println("\ncharacter found at pos "+k);
			}
			else {
				System.out.println("not found");
			}
		}
	}

}
