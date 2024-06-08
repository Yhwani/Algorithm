package Data_structure;

import java.io.*;
import java.util.*;

/*
 백준 2164 : 큐를 이용한 기본 문제
 solution
 1개의 카드가 남을 때 까지 행위를 반복(flag를 통해 행위 선택)
 flag = true일 때, 가장 위의 카드를 버린다.
 flag = false일 때, 가장 위의 카드를 가장 아래로 뺀다.
 */

public class Boj_2164 {
	static int n;
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i <= n; i++) {
			q.offer(i);
		}
		// 1개의 카드가 남을 때 까지 행위를 반복(flag를 통해 행위 선택)
		// flag = true일 때, 가장 위의 카드를 버린다.
		// flag = false일 때, 가장 위의 카드를 가장 아래로 뺀다.
		boolean flag = true;
		while(q.size() != 1) {
			if (flag) {
				q.poll();
			} else {
				q.offer(q.poll());
			}
			flag = !flag;
		}
		System.out.println(q.poll());
	}
}
