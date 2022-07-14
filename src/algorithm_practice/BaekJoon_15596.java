package algorithm_practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_15596 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}

		long result = sum(array);

		bw.write(Long.toString(result));

		bw.flush();
		bw.close();
	}

	static long sum(int[] array) {

		long answer = 0;
		for (int number : array) {
			answer += number;
		}
		return answer;
	}

}
