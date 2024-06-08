package Data_structure;

/*
 * 백준 2002
 * 처음 n개 : 입장 차 번호 순서
 * 끝 n개 : 퇴장 차 번호 순서
 * 추월한 차량 의 총 갯수 : result
 * 
 * solution
 * 해시 맵을 사용하여 입장 차 맵 생성
 * 
 * 차량 번호를 key, 출입 번호를 value로 삽입
 */

import java.util.*;
import java.io.*;

public class Boj_2002 {
	static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		HashMap<String, Integer> in = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			in.put(br.readLine(), i);
		}
		
		int [] out = new int [n];	//index : 확인할 퇴장 번호, value : 차량의 입장 번호
		for(int i = 0; i < n; i++) {
			String car = br.readLine();
			out[i] = in.get(car);
		}
		
		int result = 0;
		for(int i = 0; i < n-1; i++) {
			for(int j = i + 1; j < n; j++) {
				if(out[i] > out[j]) {
					result++;
					break;
				}
			}
		}
		
		br.close();
		System.out.println(result);
	}
}
