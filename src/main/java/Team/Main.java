package Team;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter team 1's name");
        String name1 = scanner.next();
        System.out.println("Please enter team 1's number of goals");
        int goals1 = scanner.nextInt();
        System.out.println("Please enter team 2's name");
        String name2 = scanner.next();
        System.out.println("Please enter team 2's number of goals");
        int goals2 = scanner.nextInt();

        Score score = new Score(name1, goals1, name2, goals2);

        System.out.println(score.DisplayScore());

    }
}
