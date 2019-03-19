package core;

public class DigitTime {

    private static String digits[][] = {
        {" –––– ",
         "|    |",
         "|    |",
         "|    |",
         " –––– "},

       {"     -",
        "    /|",
        "   / |",
        "     |",
        "     -"},

       {" –––– ",
        "     |",
        " –––– ",
        "|     ",
        " –––– "},

       {" –––– ",
        "     |",
        " –––– ",
        "     |",
        " –––– "},

       {"     -",
        " /   |",
        " –––– ",
        "     |",
        "     -"},

       {" –––– ",
        "|     ",
        " –––– ",
        "     |",
        " –––– "},

       {" –––– ",
        "|     ",
        " –––– ",
        "|    |",
        " –––– "},

       {" –––– ",
        "     |",
        "   __|",
        "     |",
        "     ."},

       {" –––– ",
        "|    |",
        " –––– ",
        "|    |",
        " –––– "},

       {" –––– ",
        "|    |",
        " –––– ",
        "     |",
        " –––– "},

       {"  ..  ",
        "  ''  ",
        "      ",
        "  ..  ",
        "  ''  "},
    };


    static void print(int minute, int seconds) {
        for (int i=0; i<5; ++i) {
            System.out.print(digits[minute / 10][i]);
            System.out.print(digits[minute % 10][i]);
            System.out.print(digits[10][i]);
            System.out.print(digits[seconds / 10][i]);
            System.out.println(digits[seconds % 10][i]);
        }
    }

}
