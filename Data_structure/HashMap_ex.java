package Data_structure;

/*
 * HashMap : key와 value 쌍을 저장하는 자료구조 
 * 	-> 해싱함수가 key를 받아 해시코드로 변환 후에 해시코드를 버킷의 인덱스로 사용
 * 	-> 즉, 정확히 HashMap은 해시코드(주소값), key, value로 구성된 버킷의 모음이다.
 * 		* 버킷 : Hash맵의 각 요소
 * 	-> 해싱함수가 불안정 할수록 다른 key임에도 해시 코드가 같아 해싱 충돌 발생 할 수 있다.
 *  	-> 각 버킷을 연결리스트로 구현하는 체이닝을 통해 해결 가능
 *  		-> 각 해시코드의 버킷이 배열로 저장
 *  	-> 개방주소법 : 해싱 충돌 시, 적절히 사용하지 않는 메모리 주소를 해시코드에 할당
 * 
 * 	-> 데이터 조회시에도 받아온 key를 통해 해시코드를 구해 메모리에 접근
 * 
 * Map 인터페이스 : key : value 형태의 클래스를 구현하는 데 사용
 * 
 */

import java.util.HashMap;

public class HashMap_ex {

	public static void main(String[] args) {
		// 해시맵(key(Integer) : value(String)) 선언
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "a"); // 데이터 삽입
		map.put(2, "b");
		map.put(3, "c");
		
		map.remove(2); // key값을 통해 데이터 삭제
		
		// 관련 메서드 대부분이 시간복잡도 O(1)이다.
		System.out.println(map.size()); // 맵의 크기 확인
		System.out.println(map.get(3)); // 데이터 감색
		System.out.println(map.isEmpty()); // 맵의 공백 여부 확인
		System.out.println(map.toString()); // 맵의 전체 확인
		System.out.println(map.containsKey(2)); // 키의 존재 여부 확인
		System.out.println(map.containsValue("a")); // 값의 존재 확인
		System.out.println(map.values()); // 전체 값을 받아옴
	}

}
