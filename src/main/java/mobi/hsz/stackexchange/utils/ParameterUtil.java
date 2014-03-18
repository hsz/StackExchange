package mobi.hsz.stackexchange.utils;

public class ParameterUtil {

    /**
     * Converts String[] into a semicolon delimited string.
     *
     * @param list      strings list
     * @return          semicolon delimited string
     */
    public static String semicolonList(String[] list) {
        StringBuilder sb = new StringBuilder();
        String delimiter = "";

        for (String s : list) {
            sb.append(delimiter);
            sb.append(s);
            delimiter = ";";
        }

        return sb.toString();
    }

}
