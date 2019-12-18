package io;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStream_test {

	public static void main(String[] args) throws Exception {
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("d:\\001.txt"));
		Person p1=new Person("dkk",20);
		out.writeObject(p1);
		
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("d:\\001.txt"));
		Person person=(Person)in.readObject();
		System.out.println("name"+person.getName());
		System.out.println("age"+person.getAge());
	}

}
