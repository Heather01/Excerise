package LoginDetails;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your user name");
        String userName = scanner.next();
        System.out.println("Please enter your password");
        String password = scanner.next();

        Login login = new Login(userName, password);

        login.attempt();


    }
}

