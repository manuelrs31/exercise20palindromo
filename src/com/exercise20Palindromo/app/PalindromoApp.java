package com.exercise20Palindromo.app;
import com.exercise20Palindromo.model.StringAplications;
public class PalindromoApp {

	public static void main(String[] args)
	{
		String palindromo1 = " anita lava la tina.";
		String palindromo2 = " yo dono rosas oro no doy!!! ";
		System.out.println(StringAplications.isPalindrome(palindromo1));
		System.out.println(StringAplications.isPalindrome(palindromo2));
		System.out.println(StringAplications.isPalindromeStack(palindromo1));
		System.out.println(StringAplications.isPalindromeStack(palindromo2));
		
		// TODO Auto-generated method stub

	}

}
