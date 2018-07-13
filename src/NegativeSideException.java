public class NegativeSideException extends Exception {
    String name;
    double side1;
    double side2;
    int varOfEx;

    NegativeSideException (String name, double side1){
        this.name = name;
        this.side1 = side1;
        varOfEx = 1;
    }

    NegativeSideException (String name, double side1, double side2){
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public String toString() {
        if(varOfEx==1){
            return "One "+name+"'s side is null. It isn't possible";
        }else{
            return "Both "+name+"'s sides are null. It isn't possible";
        }
    }
}
