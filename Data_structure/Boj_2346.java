package Data_structure;

import java.io.*;
import java.util.*;

/*
 * 백준 2346
 * solution
 * 풍선을 터뜨린다 -> poll()
 * 양수가 적혀 있을 때, 오른쪽 이동 -> 양수 만큼 왼쪽에서 꺼낸 값을 오른쪽에 넣는다. 
 * 음수가 적혀 있을 때, 왼쪽 이동 -> 음수의 절댓값 값을 오른쪽에서 꺼낸 값을 왼쪽에 넣는다.
 * + 하나를 꺼낸 뒤에 한번 더 덱이 비었는지 확인 
 */

public class Boj_2346 {
	static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<int[]> deque = new ArrayDeque<>();
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			int val = Integer.parseInt(st.nextToken());
			deque.offerLast(new int[]{i, val});
		}

		StringBuilder sb = new StringBuilder();
		while(!deque.isEmpty()) {
			int[] part = deque.pollFirst();
			sb.append(String.valueOf(part[0])).append(" ");
			if(!deque.isEmpty()) {
				if(part[1] > 0) {
					for (int i = 0; i < part[1] - 1; i++) {
						deque.offerLast(deque.pollFirst());
					}
				} else {
					part[1] = -part[1];
					for (int i = 0; i < part[1]; i++) {
						deque.offerFirst(deque.pollLast());
					}
				}
			}
		}
		System.out.println(sb);
		
	}

}