/* Kitthanya Teachanontkullawat (Mine) 64050027*/
package model;

import java.util.ArrayList;
import java.util.List;

public class Model {
    /* Stored Data Type */
    private List<String> typeOne;
    private List<String> typeTwo;

    /* Stored lines & Tokens */
    private String[] lines;
    private String[] tokens;

    /* Lexical */
    public void analyze(String input) {
        typeOne = new ArrayList<>();
        typeTwo = new ArrayList<>();
        /* One Command on One Line */
        lines = input.split("\n");

        for (String line : lines) {
            /* Skip line */
            if (line.trim().startsWith("//")) {
                continue;
            }

            /* Each Token by space */
            tokens = line.split("\\s+");

            for (String token : tokens) {
                if (token.equals("declare")) {
                    this.typeOne.add(token + " is Keyword");
                    this.typeTwo.add(token + " is Keyword and Sign");

                } else if (token.matches("[a-z]+")) {
                    this.typeOne.add(token + " is Identifier");
                    this.typeTwo.add(token + " is Variable");

                } else if (token.matches("\\d+")) {
                    this.typeOne.add(token + " is Literal");
                    this.typeTwo.add(token + " is Integer");

                } else if (token.equals("+") || token.equals("=")) {
                    this.typeOne.add(token + " is Symbol");
                    this.typeTwo.add(token + " is Assignment");

                }
            }
        }
    }

    /* Get the Output Data Type One */
    public List<String> getTypeOne() {
        return typeOne;
    }

    /* Get the Output Data Type Two */
    public List<String> getTypeTwo() {
        return typeTwo;
    }
}
