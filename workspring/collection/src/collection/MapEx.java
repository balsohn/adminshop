package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		// Map => 키와 값을 저장 => name,홍길동
		
		// Map<String, String> map=new HashMap<String, String>();
		HashMap<String, String> map= new HashMap<String, String>();
		
		
		map.put("이름", "홍길동");
		map.put("나이", "33");
		map.put("번호","010-1234-5678");
		
		System.out.println(map.size());
		System.out.println(map.toString());
		System.out.println(map.get("이름"));
		
		// 전체출력
		Set<String> s1=map.keySet();
		
		Iterator<String> it=s1.iterator();
		
		while(it.hasNext()) {
			System.out.println(map.get(it.next()));
		}
	}
}
