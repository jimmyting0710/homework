package homework8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
//�Ыإߤ@��Collection����ñN�H�U��ƥ[�J�G
//Integer(100)�BDouble(3.14)�BLong(21L)�BShort(��100��)�BDouble(5.1)�B��Kitty���BInteger(100)�B
//Object����B��Snoopy���BBigInteger(��1000��)
public class hw1 {
	public static void main(String[] args) {
		List aa=new ArrayList();
		aa.add(new Integer(100));
		aa.add(new Double(3.14));
		aa.add(new Long(21L));
		aa.add(new Short("100"));
		aa.add(new Double(5.1));
		aa.add("Kitty");
		aa.add(new Object());
		aa.add("Snoopy");
		aa.add(new BigInteger("1000"));
		
		Object obj;
		System.out.println("--------------------for");
		for (int i = 0; i < aa.size(); i++) {
			obj = aa.get(i);
			System.out.println(obj);
		}
		System.out.println();
		System.out.println("--------------------foreach");
		for(Object o : aa) {
			System.out.println(o);
		}
			
		
		
		System.out.println();
		
		System.out.println("--------------------Iterator");
		for(Iterator it=aa.iterator();it.hasNext();)
			System.out.println(it.next());
				
		
		
		
		
	}
}
