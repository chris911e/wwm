package zli.ch;

import java.util.Scanner;
import java.lang.String;

public class MainApplication {
    public static void main(String[] args) {

        int num_q_g = 0;
        wwm wwm1 = new wwm();
        wwm1.setGewinn(num_q_g);
        Scanner keyboard = new Scanner(System.in);

        while(wwm1.getFailed() == false) {

            System.out.println("Dein jetztiger Gewinn:" + wwm1.getGewinn());
            System.out.println(wwm1.getQuestion(num_q_g).substring(1));
            System.out.println("Antwort:");
            String answer = keyboard.nextLine();

            char solution_as_char = wwm1.getQuestion(num_q_g).charAt(0);
            String solution = Character.toString(solution_as_char);

            if(answer.equals(solution)) {
                num_q_g++;
                wwm1.setGewinn(num_q_g);
                if (wwm1.getGewinn() == 1000000){
                    System.out.println("Du hast " + wwm1.getGewinn() + " gewonnen!!!");
                    wwm1.setFailed(true);
                }
            } else {
                if (wwm1.getGewinn() >= 5000 && wwm1.getGewinn() < 50000) {
                    wwm1.setGewinn(4);
                    wwm1.setFailed(true);
                    System.out.println("Du hast " + wwm1.getGewinn() + " gewonnen!!!");
                } else if (wwm1.getGewinn() >= 50000 && wwm1.getGewinn() < 1000000) {
                    wwm1.setGewinn(7);
                    wwm1.setFailed(true);
                    System.out.println("Du hast " + wwm1.getGewinn() + " gewonnen!!!");
                } else {
                    System.out.println("Du hast verloren!!!");
                    wwm1.setFailed(true);
                }
            }
        }
    }
}
