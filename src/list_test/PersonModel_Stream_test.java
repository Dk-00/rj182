package list_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;

public class PersonModel_Stream_test {

	public static void main(String[] args) {
		 List<PersonModel> list=new ArrayList<>();
		PersonModel p1=new PersonModel("wangyu",18,"男");
		PersonModel p2=new PersonModel("zhangyu",18,"女");
		PersonModel p3=new PersonModel("dayanjing",18,"女");
		PersonModel p4=new PersonModel("baoqiang",18,"女");
		list=Arrays.asList(p1,p2,p3,p4);
		
		for(PersonModel pm:list) {
			System.out.println(pm.getName());
			
		}
		List<String> list2=list.stream().map(a->a.getName()).collect(Collections.toList());
		System.out.println(list2);
		
		List<String> list3=list.stream().map(PersonModel::getName()).collect(Collections.toList());
		System.out.println(list3);
		
		List<String> list4=list.stream().map(pm->System.out.println(pm.getName())).collect(Collections.toList());
		System.out.println(list4);
		
		
	}

}
