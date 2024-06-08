package Data_structure;

/*
 * 덱(Deque) : 양방향에서 삽입 및 추출이 가능한 자료구조(양방향 큐)
 * 직접 구현하기 어려운 단점을 가지고 있다.
 * Java에서는 Queue 인터페이스만 존재하고, 구현한 클래스 존재X -> LinkedList 사용
 */


import java.util.Deque;
import java.util.LinkedList;

public class Deque_ex {

	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedList<>();
		int i = 0;
		while(i++<10) {
			deque.offerFirst(i);
			deque.offerLast(i);		// 덱의 양방향 삽입 후 true 반환 // 실패 시 false
		}
		System.out.println(deque);
		System.out.println(deque.getClass().getName());
		System.out.println(deque.pollFirst());	 
		System.out.println(deque.pollLast());	// 덱의 양방향 추출(비어있으면 null)
		System.out.println(deque.size());	// 덱의 사이즈 반환
		System.out.println(deque.peekFirst());
		System.out.println(deque.peekLast());	// 덱의 양방향의 끝값 확인(비어있으면 null 반환)
	
		/*
		 * cf) LinkedList vs ArrayDeque
		 * ArrayDeque는 Deque의 구현체 -> 양쪽 끝 삽입/삭제 효율적, 원소 접근 성능 좋음
		 * LinkedList는 List와 Queue의 구현체 -> 현재 요소 삽입/삭제는 좋으나, 원소 접근 별로
		 * ++ ArrayDeque는 다음 노드의 참조가 필요 없다. 메모리 효율이 좋음!
		 * ++ LinkedList는 null을 요소로 추가할 수 있다.
		 * => 대부분에서는 ArrayDeque를 쓰자.
		 * => 스택의 사이즈가 커지거나 변동 심할 때만 즉각적인 공간을 확보하기 위해 LinkedList를 쓰자
		 */
	
	}

}
