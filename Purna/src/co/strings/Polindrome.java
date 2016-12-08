package co.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Polindrome {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		// TODO Auto-generated method stub
		System.out.println("enter the polindrome string");
	String str=br.readLine();
	String temp=str;
	StringBuffer sb=new StringBuffer(str);
	sb.reverse();
	str=sb.toString();
	if(temp.equalsIgnoreCase(str)){
		System.out.println("polindrome");
	}
	else{
		System.out.println("not a plindrome");
	}
	

	}

}
