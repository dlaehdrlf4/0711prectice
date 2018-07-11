package structure;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain1 {

	public static void main(String[] args) {
		//문자열을 저장할 수 있는 ArrayList 생성
		LinkedList <String> arraylist = new LinkedList<>(); //사용법이 같으므로 LinkedList만 바꿔주면 됨 저기에 ArrayList를 써도 똑같은 결과가 나옴
		//데이터 삽입
		arraylist.add("동");
		arraylist.add("대");
		arraylist.add("문");
		arraylist.add("을");
		arraylist.add("가");
		
		//데이터 개수
		System.out.println("데이터 개수:" + arraylist.size());
		//전체 데이터 출력
		for(String temp : arraylist) {
			System.out.println(temp);
		}
		
		//2번째 데이터 출력하기
		System.out.println("---------------------------");
		System.out.print(arraylist.get(2));
		//System.out.println(arraylist.remove());
	}

}
