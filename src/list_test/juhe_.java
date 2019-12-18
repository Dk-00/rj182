package list_test;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.List;import java.util.stream.Collectors;
import java.util.stream.Stream;

public class juhe_ {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("xj");
		list.add("xl");
		list.add("dkk");
		list.add("dk");
		
		Stream<String> liu=list.stream();
		liu.forEach(j->System.out.println(j));
		
		Stream<String> liu2=list.stream();
		Stream<String> liu3=liu2.filter(k->k.startsWith("x"));
		System.out.println("集合里所有姓x的人");
		liu3.forEach(j->System.out.println(j));
		
		list.stream().filter(i->i.startsWith("x")).skip(1).limit(2).forEach(j->System.out.println(j));
		list.stream().filter(i->i.startsWith("x")).skip(1).limit(2).collect(Collectors.joining("，"));
	}

}
