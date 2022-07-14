package algorithm_practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class FESTIVAL {
	public static void main(String[] args) throws IOException {

		// 입력의 첫 줄에는 테스트 케이스의 수 C (C<=100)
		// 각 테스트 케이스의 첫 줄에는 공연장을 대여할 수 있는 날들의 수 N (1<=N<=1000) 과
		// 이미 섭외한 공연 팀의 수 L (1<=L<=1000, L<=N) 이 주어짐
		// 그 다음 줄에는 N개의 숫자로 공연장 대여 비용이 날짜별로 주어짐
		// 모든 비용은 100 이하의 자연수

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int C = Integer.parseInt(br.readLine()); // 테스트 케이스의 수
		int N; // 공연장을 대여할 수 있는 날들의 수
		int L; // 이미 섭외한 공연 팀의 수
		int[] cost; // 공연장 대여 비용이 저장된 배열
		int sum; // 평균 비용 계산을 위한 합
		double avg; // 비용의 평균
		double minimum = Double.MAX_VALUE; // 최소 비용 저장 변수

		for (int i = 0; i < C; i++) { // 테스트 케이스의 수 만큼 반복
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			L = Integer.parseInt(st.nextToken());
			cost = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < cost.length; j++) {
				cost[j] = Integer.parseInt(st.nextToken());
			} // cost 배열에 값 채우기

			for (int j = L; j <= N; j++) {
				for (int k = 0; k <= N - j; k++) {
					sum = 0; // 합 초기화
					for (int q = k; q < k + j; q++) {
						sum += cost[q];
					}
					avg = sum / (double) j;
					if (avg < minimum) {
						minimum = avg;
					}
				}
				
			}

			bw.write(Double.toString(minimum));
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
