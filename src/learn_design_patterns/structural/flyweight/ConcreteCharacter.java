package learn_design_patterns.structural.flyweight;

import java.awt.Color;

public class ConcreteCharacter implements TextCharacter {

    private final char character;
    private final Color color;

    public ConcreteCharacter(char character, Color color) {
        this.character = character;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Character: " + character + ", Color: " + color);
    }
}
