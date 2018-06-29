import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private String name;
    private String emale;
    private String phone;

    private String namePattern = "([A-Za-z]+)";
    private String emalePattern = "(([A-Za-z0-9]+[\\-]?[A-Za-z0-9]+)+@(([A-Za-z0-9]+[\\.-]?[A-Za-z0-9]+)+[\\.]{1}[A-Za-z0-9]{2,4}))";
    private String phonePattern = "([0-9]{6,12})";

    public boolean isNameValid(String enteredName){
        Pattern pName = Pattern.compile(namePattern);
        Matcher mName = pName.matcher(enteredName);
        return mName.matches();
    }

    public boolean isEmaleValid(String enteredEnale){
        Pattern pEmale = Pattern.compile(emalePattern);
        Matcher mEmale = pEmale.matcher(enteredEnale);
        return mEmale.matches();
    }

    public boolean isPhoneValid(String enteredPhone){
        Pattern pPhone = Pattern.compile(phonePattern);
        Matcher mPhone = pPhone.matcher(enteredPhone);
        return mPhone.matches();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmale() {
        return emale;
    }
    public void setEmale(String emale) {
        this.emale = emale;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", emale='" + emale + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
