package algorithm_practice;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		boolean[] check = new boolean[100];

		int number = 1;
		String strNum;

		while (number < 100) {
			
			bw.write(Integer.toString(number));
			bw.newLine();
			
			strNum = String.valueOf(number);
			for (int i = 0; i < strNum.length(); i++) {
				number += Character.getNumericValue(strNum.charAt(i));
				
			}
			
		}

		bw.flush();
		bw.close();
	}
}