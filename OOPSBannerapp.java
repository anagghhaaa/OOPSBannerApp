public class OOPSBannerApp {

    // Main method to run the banner display
    public static void main(String[] args) {

        // Define and populate the String array inline using String.join()
        String[] lines = {
            String.join(" ", " ***** ", " ***** ", " ***** ", " ***** "),
            String.join(" ", "*     *", "*     *", "*     *", "*     *"),
            String.join(" ", "*     *", "*     *", "*     *", "*"),
            String.join(" ", "*     *", "*     *", "**** *", "  *****"),
            String.join(" ", "*     *", "*     *", "*     *", "     *"),
            String.join(" ", "*     *", "*     *", "*     *", "     *"),
            String.join(" ", " ***** ", " ***** ", "* ", "     ****** ")
        };

        // Use for-each loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}