public class OOPSBannerApp {
    public static String[] getOPattern() {
        return new String[] {
            String.join("", "  *****  "),
            String.join("", " **   ** "),
            String.join("", " **   ** "),
            String.join("", " **   ** "),
            String.join("", " **   ** "),
            String.join("", " **   ** "),
            String.join("", "  *****  ")
        };
    }
    public static String[] getPPattern() {
        return new String[] {
            String.join("", " ******  "),
            String.join("", " **   ** "),
            String.join("", " **   ** "),
            String.join("", " ******  "),
            String.join("", " **       "),
            String.join("", " **       "),
            String.join("", " **       ")
        };
    }
    public static String[] getSPattern() {
        return new String[] {
            String.join("", "  *****  "),
            String.join("", " **       "),
            String.join("", " **       "),
            String.join("", "  *****  "),
            String.join("", "      ** "),
            String.join("", "      ** "),
            String.join("", " *****   ")
        };
    }
    public static void main(String[] args) {
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();
        String[] banner = new String[7];
        for (int i = 0; i < oPattern.length; i++) {
            banner[i] = String.join("   ",
                    oPattern[i],
                    oPattern[i],
                    pPattern[i],
                    sPattern[i]);
        }
        for (String line : banner) {
            System.out.println(line);
        }
    }
}