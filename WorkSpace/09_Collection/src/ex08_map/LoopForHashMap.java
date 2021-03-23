package ex08_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LoopForHashMap {

	public static void main(String[] args) {
		Map<String, String> me = new HashMap<String, String>();
		me.put("name", "박도성");
		me.put("age", 44+"");
		
		Set<String> keys = me.keySet();
		for(String s : keys) {
			System.out.println(s + " : " + me.get(s));
		}

		Iterator<String> it = me.keySet().iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s + " : " + me.get(s));
		}
		
		// 3.데이터 쌍으로 빼기
		// entry : key와 value를 묶어서 entry라고 함
		// key : getKey()
		// value : getValue()
		Set<Map.Entry<String, String>> entries = me.entrySet();
		for(Map.Entry<String, String> entry : entries) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		
		Iterator<Map.Entry<String, String>> it2 = entries.iterator();
		while(it2.hasNext()) {
			Map.Entry<String, String> entry = it2.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}
	}
	

}
