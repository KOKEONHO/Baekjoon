package algorithm_practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class FESTIVAL {
	public static void main(String[] args) throws IOException {

		// �Է��� ù �ٿ��� �׽�Ʈ ���̽��� �� C (C<=100)
		// �� �׽�Ʈ ���̽��� ù �ٿ��� �������� �뿩�� �� �ִ� ������ �� N (1<=N<=1000) ��
		// �̹� ������ ���� ���� �� L (1<=L<=1000, L<=N) �� �־���
		// �� ���� �ٿ��� N���� ���ڷ� ������ �뿩 ����� ��¥���� �־���
		// ��� ����� 100 ������ �ڿ���

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int C = Integer.parseInt(br.readLine()); // �׽�Ʈ ���̽��� ��
		int N; // �������� �뿩�� �� �ִ� ������ ��
		int L; // �̹� ������ ���� ���� ��
		int[] cost; // ������ �뿩 ����� ����� �迭
		int sum; // ��� ��� ����� ���� ��
		double avg; // ����� ���
		double minimum = Double.MAX_VALUE; // �ּ� ��� ���� ����

		for (int i = 0; i < C; i++) { // �׽�Ʈ ���̽��� �� ��ŭ �ݺ�
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			L = Integer.parseInt(st.nextToken());
			cost = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < cost.length; j++) {
				cost[j] = Integer.parseInt(st.nextToken());
			} // cost �迭�� �� ä���

			for (int j = L; j <= N; j++) {
				for (int k = 0; k <= N - j; k++) {
					sum = 0; // �� �ʱ�ȭ
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
