import java.util.Scanner;

import static java.lang.Thread.sleep;

public class SlaveWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Slave slave = new Slave(50); // Initial skill level set to 50
        int problemsSolved = 0;
        int totalProblems = 10;

        for (int i = 0; i < totalProblems; i++) {
            int action = -1;
            System.out.println("Choose an action: (1) Whip (2) Drug (3) Praise (4) Beat");
            try {
                String input = scanner.nextLine();
                action = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("you should manage your slave properly");
                continue;
            }

            switch (action) {
                case 1:
                    slave.whipping();
                    break;
                case 2:
                    slave.drug();
                    break;
                case 3:
                    slave.praise();
                    break;
                case 4:
                    slave.beating();
                    break;
                default:
                    System.out.println("Invalid action. No skill change.");
                    break;
            }
            if (slave.tryToSolveProblem()) {
                System.out.println("slave worked quite good");
                problemsSolved++;
            }else{
                System.out.println("it was his best. hahaha");
            }
            slave.decreaseSkill(); // Decrease skill after each attempt
        }

        System.out.println("Problems solved: " + problemsSolved + " out of " + totalProblems);
        if(problemsSolved > 7){
            System.out.println("you are quite good master");
        }else{
            System.out.println("next time, you will become even more greater master");
        }
    }
}
