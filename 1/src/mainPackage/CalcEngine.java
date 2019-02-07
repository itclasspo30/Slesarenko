package mainPackage;

import java.util.List;

public class CalcEngine {
	
	int i;
	
	public void doBasic(List<String> StringList){
		
		BasicCalc bCl = new BasicCalc();
    	
        for(i = 1; i < StringList.size(); i++)
            if("*".equals(StringList.get(i))){
            	bCl.multiplication(StringList, i);
            	--i;
            }
        else if("/".equals(StringList.get(i))){
        	bCl.division(StringList, i);
        	--i;
        	
        }
        for(i = 1; i < StringList.size(); i++)
            if("+".equals(StringList.get(i))){
            	bCl.addition(StringList, i);
            	--i;
            }
            else if("-".equals(StringList.get(i))){
            	bCl.subtraction(StringList, i);
            	--i;
            }
	}
	
	public void doMemoru(List<String> StringList){
		
		MemoryCalc mCl = new MemoryCalc();
    	
    	for(i = 1; i < StringList.size(); i++)
            if("MS".equals(StringList.get(i)))
            	mCl.memoSave(StringList, i);
    	
    	for(i = 1; i < StringList.size(); i++)
            if("M+".equals(StringList.get(i)))
            	mCl.memoPlus(StringList, i);
    	
    	for(i = 1; i < StringList.size(); i++)
            if("M-".equals(StringList.get(i)))
            	mCl.memoMinus(StringList, i);
    	
    	for(i = 1; i < StringList.size(); i++)
            if("MR".equals(StringList.get(i)))
            	mCl.memoRemember(StringList, i);
    	
    	for(i = 1; i < StringList.size(); i++)
            if("MC".equals(StringList.get(i)))
            	mCl.memoClear(StringList, i);
    		        	
        for(i = 1; i < StringList.size(); i++)
            if("*".equals(StringList.get(i))){
            	mCl.multiplication(StringList, i);
                --i;
            }
            else if("/".equals(StringList.get(i))){
            	mCl.division(StringList, i);
                    --i;
            }
        for(i = 1; i < StringList.size(); i++)
            if("+".equals(StringList.get(i))){
            	mCl.addition(StringList, i);
                --i;
            }
            else if("-".equals(StringList.get(i))){
            	mCl.subtraction(StringList, i);
                --i;
            }
	}
	
	public void doEngineer(List<String> StringList){
		
		EngineerCalc eCl = new EngineerCalc();
        
        for(i = 1; i < StringList.size(); i++)
            if("exp".equals(StringList.get(i)))
            	eCl.ex(StringList, i);
        
        for(i = 1; i < StringList.size(); i++)
            if("sqrt".equals(StringList.get(i)))
            	eCl.sqrt(StringList, i);

        for(i = 1; i < StringList.size(); i++)
            if("cos".equals(StringList.get(i)))
            	eCl.cos(StringList, i);           
        
        for(i = 1; i < StringList.size(); i++)
            if("*".equals(StringList.get(i))){
            	eCl.multiplication(StringList, i);
                --i;
            }
            else if("/".equals(StringList.get(i))){
            	eCl.division(StringList, i);
                    --i;
            }
        for(i = 1; i < StringList.size(); i++)
            if("+".equals(StringList.get(i))){
            	eCl.addition(StringList, i);
                --i;
            }
            else if("-".equals(StringList.get(i))){
            	eCl.subtraction(StringList, i);
                --i;
            }
	}
	
	public void doEngMem(List<String> StringList){
		
		EngMemCalc emCl = new EngMemCalc();
    	int k; //счетчик количества высчитанных (удаленных) элементов входного файла
    	
    	//Ѕлок обработки части входного файла
    	//использующей €чейку пам€ти
    	for(i = 1; i < StringList.size(); i++){
    		
            if("MS".equals(StringList.get(i))){
            	
            	k = 0;
	            for(int j = 1; j < i-1; j++)
	                if("exp".equals(StringList.get(j)))
	                	k = k + emCl.ex(StringList, j);
	                
	            
	            for(int j = 1; j < i-1; j++)
	                if("sqrt".equals(StringList.get(j)))
	                	k = k + emCl.sqrt(StringList, j);
	 
	            for(int j = 1; j < i-1; j++)
	                if("cos".equals(StringList.get(j)))
	                	k = k + emCl.cos(StringList, j); 
            	
            	emCl.memoSave(StringList, i-k);
            }
    	}
    	
    	for(i = 1; i < StringList.size(); i++){

            if("M+".equals(StringList.get(i))){

            	k = 0;
	            for(int j = 1; j < i-1; j++)
	                if("exp".equals(StringList.get(j)))
	                	k = k + emCl.ex(StringList, j);
	                
	            
	            for(int j = 1; j < i-1; j++)
	                if("sqrt".equals(StringList.get(j)))
	                	k = k + emCl.sqrt(StringList, j);
	 
	            for(int j = 1; j < i-1; j++)
	                if("cos".equals(StringList.get(j)))
	                	k = k + emCl.cos(StringList, j);
	            
            	emCl.memoPlus(StringList, i-k);
            }
    	}
    	
    	for(i = 1; i < StringList.size(); i++){
            if("M-".equals(StringList.get(i))){

            	k = 0;
	            for(int j = 1; j < i-1; j++)
	                if("exp".equals(StringList.get(j)))
	                	k = k + emCl.ex(StringList, j);
	                
	            
	            for(int j = 1; j < i-1; j++)
	                if("sqrt".equals(StringList.get(j)))
	                	k = k + emCl.sqrt(StringList, j);
	 
	            for(int j = 1; j < i-1; j++)
	                if("cos".equals(StringList.get(j)))
	                	k = k + emCl.cos(StringList, j); 
            	
            	emCl.memoMinus(StringList, i-k);
            }
    	}
    	
    	for(i = 1; i < StringList.size(); i++)
            if("MR".equals(StringList.get(i)))
            	emCl.memoRemember(StringList, i);
    	
    	for(i = 1; i < StringList.size(); i++)
            if("MC".equals(StringList.get(i)))
            	emCl.memoClear(StringList,i);
    	
    	
    	//Ѕлок обработки части входного файла,
    	//не использующей €чейку пам€ти
        for(i = 1; i < StringList.size(); i++)
            if("exp".equals(StringList.get(i)))
            	emCl.ex(StringList, i);
        
        for(i = 1; i < StringList.size(); i++)
            if("sqrt".equals(StringList.get(i)))
            	emCl.sqrt(StringList, i);

        for(i = 1; i < StringList.size(); i++)
            if("cos".equals(StringList.get(i)))
            	emCl.cos(StringList, i);
    		        	
        for(i = 1; i < StringList.size(); i++)
            if("*".equals(StringList.get(i))){
            	emCl.multiplication(StringList, i);
                --i;
            }
            else if("/".equals(StringList.get(i))){
            	emCl.division(StringList, i);
                    --i;
            }
        for(i = 1; i < StringList.size(); i++)
            if("+".equals(StringList.get(i))){
            	emCl.addition(StringList, i);
                --i;
            }
            else if("-".equals(StringList.get(i))){
            	emCl.subtraction(StringList, i);
                --i;
            }
	}
	
}
