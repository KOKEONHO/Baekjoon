package algorithm_practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		double num1 = 10.0000;
		double num2 = 3.0000;

		bw.write(Double.toString(num1 + num2));

		bw.flush();
		bw.close();
	}
}
