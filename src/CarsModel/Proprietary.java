package CarsModel;

public class Proprietary extends Owner implements Entity {
    private String nameCompany;
    private String numberCompany;

    public Proprietary(String nameOwner, String ageOwner, String addressOwner,
                       String nameCompany, String numberCompany) {
        super(nameOwner, ageOwner, addressOwner);
        this.nameCompany = nameCompany;
        this.numberCompany = numberCompany;
    }

    public String getNameCompany(){
        return nameCompany;
    }

    public String getNumberCompany(){
        return numberCompany;
    }
}
