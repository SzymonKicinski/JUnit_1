package StringUtilities;

public class StringUtilities {
    private int charsAdded = 0;
    private int charsAdded2 = 0;

    public void addChar(StringBuilder sBuilder, char c) {
        sBuilder.append(c);
        charsAdded++;
    }

    public String upperAndPrefix(String str) {
        String upper = str.toUpperCase();
        return "Prefix_" + upper;
    }

   public String upperSuffix(String str) {
        return str + "_Suffix" ;
    }

}
