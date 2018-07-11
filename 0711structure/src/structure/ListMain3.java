package structure;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class ListMain3 {

	public static void main(String[] args) {
		//정수 List 와 문자열 List의 정렬
		ArrayList <Integer> list1 = new ArrayList<>();
		list1.add(40);
		list1.add(30);
		list1.add(10);
		
		Comparator<Integer> comp = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// 오브젝트를 바로 못쓰기 때문에 형변환을 해주어야 한다.
				 Integer la = (Integer)o1;
				 Integer la2 = (Integer)o2;
				 return la - la2; // 앞에서 뒤에꺼를 빼면 오름차순 // 뒤에꺼에서 앞에꺼를 빼면 내림차순
			}
			
		};
		
		list1.sort(comp);
		//List는 toString 재정의 되어 있어서 인스턴스를 출력하면
		//데이터가 순서대로 toString을 호출합니다.
		System.out.println(list1);
		
		
		LinkedList <String> list2 = new LinkedList<>();
		list2.add("영화");
		list2.add("보자");
		list2.add("하하");
		
		Comparator <String> comp2 = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				
				String first = (String)o1;
				String Second = (String)o2;
				return first.compareTo(Second);
				//return Second.compareTo(first);
			}
			
		};
		list2.sort(comp2);
		System.out.println(list2);
	}

}
