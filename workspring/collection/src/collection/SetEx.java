package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetEx {
	public static void main(String[] args) {
		
		HashSet<String> set1=new HashSet<String>();
		TreeSet<String> set2=new TreeSet<String>();
		SortedSet<String> set3=new TreeSet<String>();
		
		set1.add("홍길동");
		set1.add("배트맨");
		set1.add("슈퍼맨");
		set1.add("뽀로로");
		set1.add("배트맨");
		
		System.out.println(set1.toString());
		
		// 전체 값을 출력
		Iterator<String> a= set1.iterator();
		while(a.hasNext()) {
			
			System.out.println(a.next());
		}
		
		// size()
		System.out.println(set1.size());
		
		// remove(), clear()는 List와 동일하다.
	}
}
