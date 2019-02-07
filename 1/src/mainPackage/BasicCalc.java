package mainPackage;

import java.util.List;

public class BasicCalc {

    private double firstArg;
    private double secondArg;
    private double result;
        
    //Умножение
    public List<String> multiplication(List <String> list , int i) {
    	firstArg = Double.parseDouble(list.get(i-1));
    	secondArg = Double.parseDouble(list.get(i+1));
    	result = firstArg * secondArg;
            list.remove(i+1);
            list.remove(i);;
            list.set(i-1, Double.toString(result));
        return list;        
    }
    
 
    
    //Деление
    public List<String> division(List<String> list, int i) {
    	firstArg = Double.parseDouble(list.get(i-1));
    	secondArg = Double.parseDouble(list.get(i+1));
    	result = firstArg / secondArg;
            list.remove(i+1);
            list.remove(i);;
            list.set(i-1, Double.toString(result));
        return list;
    }   
    
    
    
    //Сложение
    public List<String> addition(List<String> list, int i) {
    	firstArg = Double.parseDouble(list.get(i-1));
    	secondArg = Double.parseDouble(list.get(i+1));
    	result = firstArg + secondArg;
            list.remove(i+1);
            list.remove(i);;
            list.set(i-1, Double.toString(result));
        return list;
    }   
        
 
    
    //Вычитание
    public List<String> subtraction(List<String> list, int i) {
    	firstArg = Double.parseDouble(list.get(i-1));
    	secondArg = Double.parseDouble(list.get(i+1));
    	result = firstArg - secondArg;
            list.remove(i+1);
            list.remove(i);;
            list.set(i-1, Double.toString(result));
        return list;
    }   
        
    public double getFirstArg() {
        return firstArg;
    }
 
    public double getSecondArg() {
        return secondArg;
    }
 
    public double getResult() {
        return result;
    }

    public void setFirstArg(double firstArg) {
        this.firstArg = firstArg;
    }
 
    public void setSecondArg(double secondArg) {
        this.secondArg = secondArg;
    }
 
    public void setResult(double result) {
        this.result = result;
    }
}
