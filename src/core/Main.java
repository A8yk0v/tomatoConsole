package core;

import java.awt.*; // for beep()
import java.util.Scanner;

public class Main {

    private static State state;
    private static Work sWork = new Work(0);
    private static Break sBreak;

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("No arguments");
            System.exit(-1);
        }


        if ( args[0].equals("start") )
        {
            switch (args.length) {
                case 2:
                    sWork = new Work( Integer.parseInt(args[1]) );
                    break;
                case 3:
                    sWork = new Work( Integer.parseInt(args[1]),
                                        Integer.parseInt(args[2]) );
                    break;
            }

            sBreak = new Break();
            state = sWork;
            start();
        }

        if ( args[0].equals("help") ) {
            System.out.println("This is my tomato programm.");
            return;
        }
    }

    //  111111111111111
    Scanner scan = new Scanner(System.in);


    private static void start() {
        while(true) {
            while (!state.isfinish()) {
                System.out.print("\033[H\033[2J");
                System.out.flush(); // clear screen

                DigitTime.print(state.getMinute(), state.getSeconds());
                state.update();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println(e.toString());
                }
            }
            System.out.print("\033[H\033[2J");
            System.out.flush(); // clear screen
            DigitTime.print(state.getMinute(), state.getSeconds());

            for (int i = 0; i < 7; i++) {
                Toolkit.getDefaultToolkit().beep();
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    System.err.println(e.toString());
                }
            }

            if (state instanceof Work) {
                state = sBreak;
                state.restart();
                System.out.println("Stop work!");
            }
            else {
                state = sWork;
                state.restart();
                System.out.println("Stop break!");
            }
        }
    }
}
