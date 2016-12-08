package co.purna;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Leapyear {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter year");
		String str= br.readLine();
		int n=Integer.parseInt(str);
		if(n%100==0 && n%400==0){
			System.out.println("leap year");
		}
		else if(n%100!=0 && n%4==0){
			System.out.println("leap year");
		}
		else {
			System.out.println("not a leap year");
		}

	}

}
