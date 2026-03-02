public class OOPSBanner {

    static String[] o = new String[7];
    static String[] p = new String[7];
    static String[] s = new String[7];

    public static void setOPattern() {
        o[0] = " *** ";
        o[1] = "*   *";
        o[2] = "*   *";
        o[3] = "*   *";
        o[4] = "*   *";
        o[5] = "*   *";
        o[6] = " *** ";
    }

    public static void setPPattern() {
        p[0] = "**** ";
        p[1] = "*   *";
        p[2] = "*   *";
        p[3] = "**** ";
        p[4] = "*    ";
        p[5] = "*    ";
        p[6] = "*    ";
    }

    public static void setSPattern() {
        s[0] = " ****";
        s[1] = "*    ";
        s[2] = "*    ";
        s[3] = " *** ";
        s[4] = "    *";
        s[5] = "    *";
        s[6] = "**** ";
    }

    public static void main(String[] args) {

        setOPattern();
        setPPattern();
        setSPattern();

        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i]);
        }
    }
}