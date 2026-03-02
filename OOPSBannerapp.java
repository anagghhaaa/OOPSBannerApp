*/
 * Demonstrates encapsulation of character-to-pattern mapping
 * using an inner static class and utility methods.
 */
public class OOPSBannerApp {

    /**
     * CharacterPatternMap – Inner static class for storing character-to-pattern mappings.
     * Encapsulates a single character and its corresponding 7-line ASCII art pattern.
     */
    static class CharacterPatternMap {

        private final Character character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern.
         *
         * @param character the character to be mapped
         * @param pattern   the ASCII art pattern (7 lines)
         */
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * @return the mapped character
         */
        public Character getCharacter() {
            return character;
        }

        /**
         * @return the ASCII art pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates and initializes CharacterPatternMap array.
     *
     * @return array of predefined character pattern mappings
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] oPattern = {
                " *** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " *** "
        };

        String[] pPattern = {
                "** ",
                "*     *",
                "*     *",
                "** ",
                "*      ",
                "*      ",
                "*      "
        };

        String[] sPattern = {
                " *** ",
                "*      ",
                "*      ",
                " *** ",
                "      *",
                "      *",
                " *** "
        };

        String[] spacePattern = {
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   "
        };

        return new CharacterPatternMap[]{
                new CharacterPatternMap('O', oPattern),
                new CharacterPatternMap('P', pPattern),
                new CharacterPatternMap('S', sPattern),
                new CharacterPatternMap(' ', spacePattern)
        };
    }

    /**
     * Retrieves pattern for a given character.
     *
     * @param ch       character to search
     * @param charMaps array of mappings
     * @return matching pattern or space pattern if not found
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == Character.toUpperCase(ch)) {
                return map.getPattern();
            }
        }

        // fallback to space pattern
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ' ') {
                return map.getPattern();
            }
        }

        return new String[7]; // safety fallback
    }

    /**
     * Prints a message as an ASCII banner.
     *
     * @param message  message to display
     * @param charMaps available character mappings
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        final int HEIGHT = 7;

        for (int row = 0; row < HEIGHT; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {
                String[] pattern = getCharacterPattern(message.charAt(i), charMaps);
                lineBuilder.append(pattern[row]).append("  ");
            }

            System.out.println(lineBuilder);
        }
    }

    /**
     * Main method – Entry point
     */
    public static void main(String[] args) {

        // Create pattern mappings
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        // Message to display
        String message = "OOPS";

        // Print banner
        printMessage(message, charMaps);
    }
}