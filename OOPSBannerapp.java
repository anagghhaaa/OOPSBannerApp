public class OOPSBannerApp {
    public static void main(String[] args) {
        [span_3](start_span)[span_4](start_span)// 1. Create a String array to store all seven lines[span_3](end_span)[span_4](end_span)
        String[] lines = new String[7];

        [span_5](start_span)[span_6](start_span)// 2. Populate each index using String.join()[span_5](end_span)[span_6](end_span)
        lines[0] = String.join(" ", "  ", " ***", " ", " ***", " ", " ****", " ", " *****");
        lines[1] = String.join(" ", " *", "   ", "*", "*", "   ", "*", "*", "   ", "*", "* ");
        lines[2] = String.join(" ", " *", "   ", "*", "*", "   ", "*", "*", "   ", "*", "* ");
        lines[3] = String.join(" ", " *", "   ", "*", "*", "   ", "*", "*", " ****", " ", " *****");
        lines[4] = String.join(" ", " *", "   ", "*", "*", "   ", "*", "*", "      ", "    *");
        lines[5] = String.join(" ", " *", "   ", "*", "*", "   ", "*", "*", "      ", "    *");
        lines[6] = String.join(" ", "  ", " ***", " ", " ***", " ", "*", "     ", " *****");

        [span_7](start_span)[span_8](start_span)// 3. Use an enhanced for-each loop to print each line[span_7](end_span)[span_8](end_span)
        for (String line : lines) {
            System.out.println(line);
        }
    }
}