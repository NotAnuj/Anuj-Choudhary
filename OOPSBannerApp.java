import java.util.*;

public class OOPSBannerApp {

    // OOP representation of character pattern
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Create character patterns
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        return new CharacterPatternMap[] {

            new CharacterPatternMap('O', new String[]{
                    "  ***  ",
                    " ** ** ",
                    " ** ** ",
                    " ** ** ",
                    " ** ** ",
                    " ** ** ",
                    "  ***  "
            }),

            new CharacterPatternMap('P', new String[]{
                    " ***** ",
                    " ** ** ",
                    " ** ** ",
                    " ***** ",
                    " **    ",
                    " **    ",
                    " **    "
            }),

            new CharacterPatternMap('S', new String[]{
                    "  **** ",
                    " **    ",
                    " **    ",
                    "  ***  ",
                    "    ** ",
                    "    ** ",
                    " ****  "
            }),

            new CharacterPatternMap(' ', new String[]{
                    "       ",
                    "       ",
                    "       ",
                    "       ",
                    "       ",
                    "       ",
                    "       "
            })
        };
    }

    // Get pattern for a character
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {
        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return new String[0];
    }

    // Print banner message
    public static void printMessage(String message, CharacterPatternMap[] maps) {

        if (maps.length == 0) return;

        int height = maps[0].getPattern().length;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < message.length(); j++) {
                String[] pattern = getCharacterPattern(message.charAt(j), maps);
                System.out.print(pattern[i] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] maps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, maps);
    }
}