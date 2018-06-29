import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        User user = new User();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter user's Name");
        String name = in.nextLine();
        while (true) {
            if (user.isNameValid(name)) {
                user.setName(name);
                break;
            } else {
                System.out.println("Wrong format. Letter only. Try again");
                name = in.nextLine();
            }

        }

        System.out.println("Enter user's Emale");
        String emale = in.nextLine();
        while (true) {
            if (user.isEmaleValid(emale)) {
                user.setEmale(emale);
                break;
            } else {
                System.out.println("It is not emale format. Try again");
                emale = in.nextLine();
            }

        }

        System.out.println("Enter user's Phome Number");
        String phone = in.nextLine();
        while (true) {
            if (user.isPhoneValid(phone)) {
                user.setPhone(phone);
                break;
            } else {
                System.out.println("Wrong format. Number only. Try again");
                phone = in.nextLine();
            }

        }

        System.out.println(user.toString());
        }



    }

