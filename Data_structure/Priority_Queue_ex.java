package Data_structure;

/*
 * 우선순위 큐(Priority Queue) : 우선순위가 높은 순서로 데이터를 꺼내는 자료구조
 * 	-> 힙 방식으로 구현
 * 	-> Heap : 완전 이진 트리 형태로, 루트 노드의 값에 따라 최소 힙, 최대 힙으로 나뉜다.
 *	cf) 우선순위가 같은 경우에는 선입 선출 방식을 따른다.
 *
 */
import java.util.PriorityQueue;
import java.util.Collections;

public class Priority_Queue_ex {

	public static void main(String[] args) {
		// PriorityQueue는 기본적으로 최소 힙으로 구현
		PriorityQueue<Integer> q1 = new PriorityQueue<>();
		// 매개변수로 Collections.reverseOrder() 추가 시 최대 힙으로 구현
		PriorityQueue<Integer> q2 = new PriorityQueue<>(Collections.reverseOrder());
		
		// 우선순위 큐에 compator 클래스의 compare에 따라 정렬 기준을 정한다.
		// ****람다식을 쓰면 더 간단해진다.
		// 선행인자 o1, 후행인자 o2 -> 양수 값 반환하면 변화X, 음수 값 반환하면 순서 바뀜
		// => 원래 최소힙(오름차순)이므로 o1<o2이다.
		PriorityQueue<Integer> q3 = new PriorityQueue<>((o1, o2) -> {
			int abs1 = Math.abs(o1);
			int abs2 = Math.abs(o2);
			if(abs1 == abs2) {
				return o1 > o2 ? 1 : -1;
			}
//			return abs2 - abs1; // => 절대값 기준 내림차순(최대힙) -> 절대값이 큰 값들이 선행에 오므로
			return abs1 - abs2;	// => 절대값 기준 오름차순(최소힙) -> o1 < o2 이므로, abs1 - abs2 < 0 -> 음수 리턴 -> 자리 유지(큰값이 앞에 온다)
		});
		
		/*
		 * compare(o1, o2){	즉 선행 객체의 특정 값이 높을 때 오름차순 정렬 시킴
		 * 					-> 선행 후행 크기 바뀌면 내림차순 정렬 시킴
		 * 	if(o1 > o2){
		 * 		return 1
		 * 	} else if (o1 == o2) {
		 * 		return 0
		 * 	} else{
		 * 		return -1
		 * 	}
		 * }
		 * 
		 * 
		 * */
		
		PriorityQueue<Integer> q4 = new PriorityQueue<>((o1, o2) -> {
			int abs1 = Math.abs(o1);
			int abs2 = Math.abs(o2);
			if(abs1 == abs2) {
				return o1 > o2 ? 1 : -1;
			}
			return abs2 - abs1; 
//			return abs1 - abs2;	
		});
		
		// 우선순위 큐에 배열을 넣을 때, 배열의 첫번째 인덱스 값이
		PriorityQueue<int[]> q5 = new PriorityQueue<>((o1,o2) -> {
			return o2[0] - o1[0]; // 배열의 첫번째 인덱스 값을 비교
								  // o2[0] > o1[0] 이면 자리 안바뀐다 
								  // 최대힙
		});
		
		for(int i = 0; i < 10; i++) {
			q1.offer(i);
			q2.offer(i);
			q3.offer(i);
			q4.offer(i);
			q1.offer(-i);
			q2.offer(-i);
			q3.offer(-i);
			q4.offer(-i);
			q5.offer(new int[] {i,10-i});
		}
		System.out.println(q1);
		System.out.println(q2);
		System.out.println(q3);
		System.out.println(q4);
		System.out.println(q5);
		for(int i = 0; i < 10; i++) {
			System.out.println(q2.poll());
		}
		for(int i = 0; i < 10; i++) {
			int[] abc = q5.poll();
			System.out.printf("%d : %d \n", abc[0], abc[1]);
		}
		
	}
}
