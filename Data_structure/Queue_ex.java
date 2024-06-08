package Data_structure;

/* 
 * 큐(queue) : 선입선출 방식의 자료 구조 => 끝에서 삽입하고, 앞에서 추출
 * Java에서는 연결리스트를 통해 구현
 * ex) 은행에서는 큐방식으로 처리, 자바스크립트 콜백 큐
 */

// 연결리스트를 이용하여 큐를 구현
import java.util.LinkedList;
import java.util.Queue;

public class Queue_ex {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();	// 큐 선언
		for(int i = 0; i < 10; i++) {
			q.offer(i);	// 큐에 값 삽입(성공시 true 반환) / add()는 실패하면 예외처리
		}
		System.out.println(q.poll());	// 큐의 첫 값 추출(비어있으면 null)
		System.out.println(q.peek());	// 큐의 첫 값 확인
		System.out.println(q.size());	// 현재 큐의 사이즈 확인
		System.out.println(q.isEmpty());	// 공백 여부 확인
		System.out.println(q.contains(5));
	}

}
