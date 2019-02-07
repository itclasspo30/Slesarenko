package mainPackage;

import java.util.List;

public class MemoryCalc extends BasicCalc {

    double memo = 0;
    
    //Добавить в память текущее значение
    public void memoSave(List<String> list, int i){

    	for(int j = 1; j < i-1; j++){
            if("*".equals(list.get(j))){
            	setFirstArg(Double.parseDouble(list.get(j-1)));
            	setSecondArg(Double.parseDouble(list.get(j+1)));
            	setResult(getFirstArg() * getSecondArg());
                list.remove(j+1);
                list.remove(j);
                list.set(j-1, Double.toString(getResult()));
                i--;
                i--;
                j=1;

            }
            else if("/".equals(list.get(j))){
                setFirstArg(Double.parseDouble(list.get(j-1)));
            	setSecondArg(Double.parseDouble(list.get(j+1)));
            	setResult(getFirstArg() / getSecondArg()); 
		        list.remove(j+1);
		        list.remove(j);
		        list.set(j-1, Double.toString(getResult()));
		        i--;
		        i--;
		        j=1;
	         }
        }
        for(int j = 1; j < i-1; j++){
            if("+".equals(list.get(j))){
            	setFirstArg(Double.parseDouble(list.get(j-1)));
            	setSecondArg(Double.parseDouble(list.get(j+1)));
            	setResult(getFirstArg() + getSecondArg());
                list.remove(j+1);
                list.remove(j);
                list.set(j-1, Double.toString(getResult()));
                i--;
                i--;
                j=1;
             }
             else if("-".equals(list.get(j))){
            	setFirstArg(Double.parseDouble(list.get(j-1)));
            	setSecondArg(Double.parseDouble(list.get(j+1)));
            	setResult(getFirstArg() - getSecondArg());
		        list.remove(j+1);
		        list.remove(j);
		        list.set(j-1, Double.toString(getResult()));
		        i--;
		        i--;
		        j=1;
             }
        }
        memo = Double.parseDouble(list.get(i-1));
        list.remove(i);
        list.remove(i-1);
    }
    
    
    
    //Увеличить на текущее значение
    public void memoPlus(List<String> list, int i) {
    	
    	for(int j = 1; j < i-1; j++){
            if("*".equals(list.get(j))){
            	setFirstArg(Double.parseDouble(list.get(j-1)));
            	setSecondArg(Double.parseDouble(list.get(j+1)));
            	setResult(getFirstArg() * getSecondArg());
                list.remove(j+1);
                list.remove(j);
                list.set(j-1, Double.toString(getResult()));
                i--;
                i--;
                j=1;
            }
            else if("/".equals(list.get(j))){
                setFirstArg(Double.parseDouble(list.get(j-1)));
            	setSecondArg(Double.parseDouble(list.get(j+1)));
            	setResult(getFirstArg() / getSecondArg()); 
		        list.remove(j+1);
		        list.remove(j);
		        list.set(j-1, Double.toString(getResult()));
		        i--;
		        i--;
		        j=1;
	         }
        }
        for(int j = 1; j < i-1; j++){
            if("+".equals(list.get(j))){
            	setFirstArg(Double.parseDouble(list.get(j-1)));
            	setSecondArg(Double.parseDouble(list.get(j+1)));
            	setResult(getFirstArg() + getSecondArg());
                list.remove(j+1);
                list.remove(j);
                list.set(j-1, Double.toString(getResult()));
                i--;
                i--;
                j=1;
             }
             else if("-".equals(list.get(j))){
            	setFirstArg(Double.parseDouble(list.get(j-1)));
            	setSecondArg(Double.parseDouble(list.get(j+1)));
            	setResult(getFirstArg() - getSecondArg());
		        list.remove(j+1);
		        list.remove(j);
		        list.set(j-1, Double.toString(getResult()));
		        i--;
		        i--;
		        j=1;
             }
        }
    	memo = memo + Double.parseDouble(list.get(i-1));
        list.remove(i);
        list.remove(i-1);
    }
    
    
    
    //Уменьшить на текущее значение
    public void memoMinus(List<String> list, int i) {
    	
    	for(int j = 1; j < i-1; j++){
            if("*".equals(list.get(j))){
            	setFirstArg(Double.parseDouble(list.get(j-1)));
            	setSecondArg(Double.parseDouble(list.get(j+1)));
            	setResult(getFirstArg() * getSecondArg());
                list.remove(j+1);
                list.remove(j);
                list.set(j-1, Double.toString(getResult()));
                i--;
                i--;
                j=1;
            }
            else if("/".equals(list.get(j))){
                setFirstArg(Double.parseDouble(list.get(j-1)));
            	setSecondArg(Double.parseDouble(list.get(j+1)));
            	setResult(getFirstArg() / getSecondArg()); 
		        list.remove(j+1);
		        list.remove(j);
		        list.set(j-1, Double.toString(getResult()));
		        i--;
		        i--;
		        j=1;
	         }
        }
        for(int j = 1; j < i-1; j++){
            if("+".equals(list.get(j))){
            	setFirstArg(Double.parseDouble(list.get(j-1)));
            	setSecondArg(Double.parseDouble(list.get(j+1)));
            	setResult(getFirstArg() + getSecondArg());
                list.remove(j+1);
                list.remove(j);
                list.set(j-1, Double.toString(getResult()));
                i--;
                i--;
                j=1;
             }
             else if("-".equals(list.get(j))){
            	setFirstArg(Double.parseDouble(list.get(j-1)));
            	setSecondArg(Double.parseDouble(list.get(j+1)));
            	setResult(getFirstArg() - getSecondArg());
		        list.remove(j+1);
		        list.remove(j);
		        list.set(j-1, Double.toString(getResult()));
		        i--;
		        i--;
		        j=1;
             }
        }
    	memo = memo - Double.parseDouble(list.get(i-1));
        list.remove(i);
        list.remove(i-1);
    }
    
    
    
    //Присвоить значение из памяти
    public void memoRemember(List<String> list, int i) {
    	list.set(i, Double.toString(memo));
    }
    
    
    
    //Очистить память
    public double memoClear(List<String> list, int i){
        memo = 0;
        list.remove(i);
        return memo;
    }
}
