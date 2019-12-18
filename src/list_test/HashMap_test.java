package list_test;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_test {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("1","jack");
		map.put("2","luck");
		map.put("3","tom");
		map.put("4","drunk");
		
		System.out.println(map);
		
		System.out.println(map.containsKey("1"));
		
		System.out.println(map.get(1));
		System.out.println(map.keySet());
		System.out.println(map.values());
		map.replace("1", "tom2");
		System.out.println(map);
		map.remove("1");
		System.out.println(map);
		
		if(map.containsKey("1")) {
			System.out.println("这个双列集合包含键1");
			System.out.println("这个双列集合包中所有键1的值是"+map.get(1));
			System.out.println("这个双列集合包中所有键的集合值是"+map.keySet());
			System.out.println("这个双列集合包中所有键的集合值是"+map.values());
			map.replace("1", "Andy");
			System.out.println(map);
			map.remove("1");
			System.out.println(map);
			
			System.out.println("用键集遍双列集合的键和值");
			Set<String> jianji=map.keySet();
			Iterator<String> Diedai=jianji.iterator();
	 		while(Diedai.hasNext()) {
				Object key=(Object)Diedai.next();
				Object value=map.get(key);
				System.out.println(key+":"+value);
			}
			System.out.println("用键集遍双列集合的键和值");
			Set<?> jzdj=map.entrySet();
			Iterator<?> diedai2=jzdj.iterator();
			while(diedai2.hasNext()) {
				@SuppressWarnings("rawtypes")
				Map.Entry jzd=(Map.Entry)diedai2.next();
				Object key=jzd.getKey();
				Object value=jzd.getValue();
				System.out.println(key+":"+value);
			}
			
			System.out.println("用foreach键值对集遍历双列集合的键和自己值");
			map.forEach((key,value)->System.out.println(key+":"+value));
			System.out.println("用foreach键值对集遍历双列集合的所有值");
			Collection<String> zhiji=map.values();
			zhiji.forEach(value->System.out.println(value));
			
			@SuppressWarnings({ "unused", "rawtypes" })
			Map<?, ?> map2=new LinkedHashMap();
			map.put("1","jack");
			map.put("2","luck");
			map.put("3","tom");
			map.put("4","drunk");
			
			map.forEach((key,value)->System.out.println(key+":"+value));
			}
		}
	}


