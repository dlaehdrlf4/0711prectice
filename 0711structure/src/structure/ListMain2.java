package structure;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain2 {

	public static void main(String[] args) {
		// 정수를 저장하는 ArrayList와 LinkedList를 만들고
		// 중간에 데이터 10만개를 삽입하는데 걸리는 시간을 측정
		ArrayList<Integer> a1 = new ArrayList<>();
		LinkedList<Integer> b1 = new LinkedList<>();

		a1.add(1);
		a1.add(3);
		a1.add(5);

		b1.add(1);
		b1.add(3);
		b1.add(5);
		
		//a1에 10만개를 중간에 넣고 시간 측정
		long start = System.currentTimeMillis();
		for(int i =0;i<1000000;i=i+1) {
			//1번째 자리에 2를 추가
			a1.add(1,2);
		}
		long end = System.currentTimeMillis();
		System.out.println("a1 :" + (end - start));
		
		 start = System.currentTimeMillis();
		for(int i =0;i<1000000;i=i+1) {
			//1번째 자리에 2를 추가
			b1.add(1,2);
		}
		 end = System.currentTimeMillis();
		System.out.println("b1 :" + (end - start));
		
		//읽는 시간
		start = System.currentTimeMillis();
		for(int i =0;i<1000000;i=i+1) {
			//i번째 데이터 읽기
			a1.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println("a1 :" + (end - start));
		
		start = System.currentTimeMillis();
		for(int i =0;i<1000000;i=i+1) {
			//i번째 데이터 읽기
			b1.get(i);  // 읽어오는 시간은 느리다 하지만 추가하는 거는 빠르다.
		}
		end = System.currentTimeMillis();
		System.out.println("b1 :" + (end - start));
	}

}
