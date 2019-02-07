package mainPackage;

import java.util.List;

public class EngineerCalc extends BasicCalc {
  
	// Взятие косинуса от впереди стоящего выражения
    public List<String> cos(List<String> list, int i) {
    	
    	//Вычисляем значение выражения под знаком косинуса
    	//и заменяем его в листе на результат
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
        //Вычисляем косинус от полученного значения
      	//и подставляем результат в лист
        for(int j = 1; j < list.size(); j++){
            if("cos".equals(list.get(j))){
            	setResult(Double.parseDouble(list.get(j-1)));
                 setFirstArg(Math.cos(getResult()));
                    list.remove(j);
                    list.set(j-1, Double.toString(getFirstArg()));
            }
        }
        return list;
    }
    
    
 
    //Экспонента
  	//Вычисляем и поставляем в лист
    public List<String> ex(List<String> list, int i) {
        if("exp".equals(list.get(i))){
        	setResult(Double.parseDouble(list.get(i-1)));
            setFirstArg(Math.exp(getResult()));
            list.remove(i);
            list.set(i-1, Double.toString(getFirstArg()));
        }      
        return list;
    }
        
    
    
    //Квадратный корень
    public List<String> sqrt(List<String> list, int i) {
    	
    	//Вычисляем значение выражения под корнем
    	//и заменяем его в листе на результат
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
            }
        }
        return list;
    }
}
