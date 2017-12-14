/**
 * Created by X-MART on 30-Apr-17.
 */

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Context ctx = new Context();
        Scanner clavier = new Scanner(System.in);
        while (true) {
            System.out.print("Quelle stratégie:");
            String nomStrategy = clavier.next();
            if (nomStrategy.equals("quit")) break;
            try {
                Class c = Class.forName(nomStrategy);
                Strategie strategy = (Strategie) c.newInstance();
                ctx.setStrategie(strategy);
                ctx.appliquerStrategie();
            } catch (Exception e) {
                System.out.println("Stratégy Innexistante..");
            }
        }
    }
}
