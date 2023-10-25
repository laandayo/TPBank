package Controller;

import View.Menu;
import java.util.Locale;
import java.util.Scanner;
import Repository.BankRepository;

public class BankController extends Menu<String> {
    private final BankRepository login;

    {
        login = new BankRepository();
    }

    static String[] options = {
            "Vietnamese",
            "English",
            "Exit"
    };
    Scanner sc = new Scanner(System.in);

    public BankController() {
        super("========= LOGIN PROGRAM  =========", options);
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                login.LoginBank(new Locale("messages_vi"));
                break;

            case 2:
                login.LoginBank(new Locale("messages_en"));
                break;

            case 3:
                System.exit(0);
        }
    }
}