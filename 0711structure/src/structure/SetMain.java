package structure;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		TreeSet<String> song = new TreeSet(); // 크기순서대로 출력
		song.add("Beam");
		song.add("빙글빙글");
		song.add("wires");
		song.add("거짓말");
		song.add("Beam");
		song.add("GEE");

		for(String s : song) {
			System.out.println(s);
		}
	}

}
