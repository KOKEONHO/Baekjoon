package step1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Practice {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<Character> stack = new Stack<>();

		stack.push('1');
		stack.push('2');
		stack.push('(');
		stack.push('3');
		stack.push('4');

		int position = stack.search('(');
		
		stack.remove(stack.size()-position);
		
		while(!stack.empty()) {
			bw.write(stack.pop());
		}

		bw.flush();
		bw.close();
	}
}
