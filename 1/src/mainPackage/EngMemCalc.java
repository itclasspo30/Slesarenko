package mainPackage;

import java.util.List;

public class EngMemCalc extends MemoryCalc {
	
    double memo = 0;   //значение в ячейке памяти
    int k;             //счетчик сдвига листа в результате подсчета
    
    //Взятие косинуса от впереди стоящего выражения
    public int cos(List<String> list, int i) {
    	
    	//Вычисляем значение выражения под знаком косинуса
    	//и заменяем его в листе на результат
    	k = 0;
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
                k=k+2;
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
		        k=k+2;
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
                k=k+2;
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
		        k=k+2;
             }
        }
        //Вычисляем косинус от полученного значения
      	//и подставляем результат в лист
        for(int j = 1; j < list.size(); j++){
            if("cos".equals(list.get(j))){
            	setResult(Double.parseDouble(list.get(j-1)));
                 setFirstArg(Math.cos(getResult()));
                    list.remove(j);
                    list.set(j-1, Double.toString(getFirstArg()));
                    k=k+1;
            }
        }
        return k;
    }
    
    
 
    //Экспонента
  	//Вычисляем и поставляем в лист
    public int ex(List<String> list, int i) {
    	
    	k = 0;
        if("exp".equals(list.get(i))){
        	setResult(Double.parseDouble(list.get(i-1)));
        	setFirstArg(Math.exp(getResult()));
            list.remove(i);
            list.set(i-1, Double.toString(getFirstArg()));
            k=k+1;
        }      
        return k;
    }
        
    
    
    //Квадратный корень
    public int sqrt(List<String> list, int i) {
    	
    	//Вычисляем значение выражения под корнем
    	//и заменяем его в листе на результат
    	k = 0;
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
                k=k+2;
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
		        k=k+2;
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
                k=k+2;
            }
            else if("-".equals(list.get(j))){
	            System.out.println(i);
	            setFirstArg(Double.parseDouble(list.get(j-1)));
	            setSecondArg(Double.parseDouble(list.get(j+1)));
	            setResult(getFirstArg() - getSecondArg());
		        list.remove(j+1);
		        list.remove(j);
		        list.set(j-1, Double.toString(getResult()));
		        i--;
		        i--;
		        j=1;
		        k=k+2;
                }
        }
        //Вычисляем значение корня
      	//и подставляем в лист
        for(int j = 1; j < list.size(); j++){
            if("sqrt".equals(list.get(j))){
            	setResult(Double.parseDouble(list.get(j-1)));
                setFirstArg(Math.sqrt(getResult()));
                list.remove(j);
                list.set(j-1, Double.toString(getFirstArg()));
                k=k+1;
            }
        }
        return k;
    }
}
