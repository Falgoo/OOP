package learn_design_patterns.structural.flyweight;

import java.awt.Color;

public class Application {

    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();

        // Create and draw characters with different styles
        TextCharacter charA = characterFactory.getCharacter('A', Color.RED);
        charA.draw();

        TextCharacter charB = characterFactory.getCharacter('B', Color.BLUE);
        charB.draw();

        TextCharacter charA2 = characterFactory.getCharacter('A', Color.RED); // Reusing the same 'A' character
        charA2.draw();
    }
}
