import StringUtilities.StringUtilities;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("The beginning");
        StringUtilities utils = new StringUtilities();
        StringBuilder sb = new StringBuilder();

        while (sb.length() < 10) {
            utils.addChar(sb, 'a');
        }
        System.out.println(sb);

        String str = "abced";
        String result = utils.upperAndPrefix(utils.upperSuffix(str));
        System.out.println(result);
        System.out.println("The end");
    }
}
