package mainPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws FileNotFoundException {
        
        List<String> StringList = new ArrayList<String>();
        CalcEngine clEn = new CalcEngine();
        
        Scanner scaner = new Scanner(new File("src/test/" + args[0]));
        
        try{
	        while (scaner.hasNextLine())
	        StringList.add(scaner.nextLine());
	        
	        switch (StringList.get(0)) {
	        
		        case "1":
		        	clEn.doBasic(StringList);
		            break;
		            
		        case "2":
		        	clEn.doMemoru(StringList);
		            break; 
		            
		        case "3":
		        	clEn.doEngineer(StringList);
		            break;
		 	 	            
		        case "4":
		        	clEn.doEngMem(StringList);
		            break;
	        } 
	        
	        System.out.println("Результат вычислений = " + StringList.get(1));
        
        } finally {
        	scaner.close();
        }
    }
}
