package com.telusko.learning;

public class ReverseString {

	public String reverseString(String word)
	{
		char[] c = word.toCharArray();
		int left=0;
		int right = c.length;
		while(left<right)
		{
			char temp= c[left];
			c[left]=c[right];
			c[right]= temp;
			
			left++;
			right--;
		}
		return new String(c);
	}
	
}
