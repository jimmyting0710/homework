package homework8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class hw1_2 {
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
		
		
		for(Iterator it=aa.iterator();it.hasNext();)
			if(it.next() instanceof Number){
				it.remove();
			}
			
			System.out.println(aa);
				
	}
}
