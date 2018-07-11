package structure;

import java.util.ArrayList;
import java.util.Comparator;

public class ListMain4 {
	public static void main(String[] args) {
		ArrayList<Singer> list = new ArrayList<>();
		Singer singer = new Singer();
		singer.setName("수지");
		singer.setAge(10);
		list.add(singer);
		
		//Singer 객체를 다시 생성해서 singer변수는 다르게 인식한다.
		singer = new Singer();
		singer.setName("아라");
		singer.setAge(20);
		list.add(singer);
		
		//리스트의 모든 데이터 확인
		//System.out.println(list);
		
		Comparator<Singer> comp = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				
				Singer first = (Singer)o1;
				Singer second = (Singer)o2; // 우리가 만든것
				return first.getAge() - second.getAge();
				
				
			}
			
		};
		
		// 각각의 데이터 확인 // 하나하나씩 보여준다.
		for(Singer temp : list) {
			System.out.println(temp);
		}
	}
}