package DSA.Strings.RecursioninString;

public class SkipACharacter {
    public static void main(String[] args) {
        skipChar("","sarah faiyaz khan");
        System.out.println(skipChar2("sarah faiyaz khan"));
        System.out.println(skipString("sarappleah applefaiyaz applekhan"));
        System.out.println(skipAppNotApple("sarappleah applefaiyaz app lekhan"));

    }
    static void skipChar(String processed, String unprocessed) {
        if(unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        if(ch == 'a') {
            skipChar(processed,unprocessed.substring(1));
        }else skipChar(processed+ ch,unprocessed.substring(1));

    }
    static String skipChar2(String unprocessed) {
        if(unprocessed.isEmpty()) {
            return "";
        }
        char ch = unprocessed.charAt(0);
        if(ch == 'a') {
            return skipChar2(unprocessed.substring(1));
        }else return ch + skipChar2(unprocessed.substring(1));

    }
    static String skipString(String unprocessed) {
            if(unprocessed.isEmpty()) {
                return "";
            }
            if(unprocessed.startsWith("apple")) {
                return skipString(unprocessed.substring(5));
            }else return unprocessed.charAt(0) + skipString(unprocessed.substring(1));

        }
    static String skipAppNotApple(String unprocessed) {
                if(unprocessed.isEmpty()) {
                    return "";
                }
                if(unprocessed.startsWith("app") && !unprocessed.startsWith("apple")) {
                    return skipAppNotApple(unprocessed.substring(3));
                }else return unprocessed.charAt(0) + skipAppNotApple(unprocessed.substring(1));

            }

}
