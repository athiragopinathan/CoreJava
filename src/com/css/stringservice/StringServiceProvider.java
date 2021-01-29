package com.css.stringservice;

public class StringServiceProvider {

	public String strRev(String str)
	{
		char[] strArr = str.toCharArray();
		char[] revArr = new char[strArr.length];
		int j=0;
		for(int i=strArr.length-1;i>=0;i--)
		{
			revArr[j]=strArr[i];
			j++;
		}
		String strRev=new String(revArr);
		return strRev;
	}
	public void linearSearch(String str,char element)
	{
		int c=0;
		char[] strArr=str.toCharArray();
		for(int i=0;i<strArr.length;i++)
		{
			if(strArr[i]==element)
			{
				System.out.println("element "+element+" is found at position "+i);
				c++;
			}
		}
		if(c==0)
			System.out.println("element is not found in the given string");
		
	}
	public String replace(String str,char element,char replacement)
	{
		char[]arr=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element)
			{
				arr[i]=replacement;
				
			}
		}
		String replace=new String(arr);
		return replace;
	}
}
