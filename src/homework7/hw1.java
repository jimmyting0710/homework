package homework7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class hw1 {
	public static void main(String[] args) {
		long cchar = 0;
		long line=0;
		String str;
		try {
			
          FileReader fr = new FileReader("C:\\tea102_workspace\\homework\\Sample.txt");
          BufferedReader br = new BufferedReader(fr) ;
          while ((str = br.readLine()) != null) {
        	  System.out.println(str);
        	   cchar += str.length();
        	   line++;
        	   
          }
          File f1 = new File("C:\\tea102_workspace\\homework\\Sample.txt");
          System.out.println("共"+f1.length()+"個位元組");
          System.out.println("共"+cchar+"字元");
           System.out.println("共"+line+"行"); 
           
              
        	  
        	  
        	  
         
          br.close();   
          fr.close();
	            
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
