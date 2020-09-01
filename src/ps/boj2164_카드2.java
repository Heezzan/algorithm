package ps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class boj2164_카드2 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for (int i = 1; i <= N; i++) {
			q.add(i);
		}
		
		while(!q.isEmpty()) {
			if (q.size() == 1) {
				System.out.println(q.poll());
			} else {
				q.poll();
				q.add(q.poll());
			}
		}
	}                                                                                                                                                                                                                                                                                            

}
