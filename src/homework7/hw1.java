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
          System.out.println("�@"+f1.length()+"�Ӧ줸��");
          System.out.println("�@"+cchar+"�r��");
           System.out.println("�@"+line+"��"); 
           
              
        	  
        	  
        	  
         
          br.close();   
          fr.close();
	            
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
