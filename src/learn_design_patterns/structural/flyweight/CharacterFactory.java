package learn_design_patterns.structural.flyweight;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {

    private Map<Character, TextCharacter> characterCache = new HashMap<>();

    public TextCharacter getCharacter(char character, Color color) {
        TextCharacter textCharacter = characterCache.get(character);

        if (textCharacter == null) {
            textCharacter = new ConcreteCharacter(character, color);
            characterCache.put(character, textCharacter);
        }
        return textCharacter;
    }

}
