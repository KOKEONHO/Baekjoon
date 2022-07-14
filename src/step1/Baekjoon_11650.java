package step1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_11650 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		int[][] array = new int[N][2];

		for (int i = 0; i < array.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		Arrays.sort(array, (e1, e2) -> {
			if (e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				bw.write(array[i][j] + " ");
			}
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
