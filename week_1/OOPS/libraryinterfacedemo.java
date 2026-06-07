package week_1.OOPS;


    
interface LibraryUser {
    void registerAccount();
    void requestBook();
}

class KidUser implements LibraryUser {
    int age;
    String bookType;

    public void registerAccount() {
        if (age < 12)
            System.out.println("You have successfully registered under a Kids Account");
        else
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
    }

    public void requestBook() {
        if (bookType.equals("Kids"))
            System.out.println("Book issued successfully, please return within 10 days");
        else
            System.out.println("Oops, you are allowed to take only kids books");
    }
}

class AdultUser implements LibraryUser {
    int age;
    String bookType;

    public void registerAccount() {
        if (age > 12)
            System.out.println("You have successfully registered under an Adult Account");
        else
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
    }

    public void requestBook() {
        if (bookType.equals("Fiction"))
            System.out.println("Book issued successfully, please return within 7 days");
        else
            System.out.println("Oops, you are allowed to take only adult fiction books");
    }
}

public class libraryinterfacedemo
 {
    public static void main(String[] args) {

        KidUser k = new KidUser();

        k.age = 10;
        k.registerAccount();
        k.bookType = "Kids";
        k.requestBook();

        k.age = 18;
        k.registerAccount();
        k.bookType = "Fiction";
        k.requestBook();

        AdultUser a = new AdultUser();

        a.age = 20;
        a.registerAccount();
        a.bookType = "Fiction";
        a.requestBook();
    }
}
