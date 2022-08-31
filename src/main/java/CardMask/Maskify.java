package CardMask;

/**
 * 7 кью
 */
public class Maskify {
    public static void main(String[] args) {
        System.out.println(maskify("124"));
    }

    public static String maskify(String str) {
        String[] strArray = str.split("");
        String result = "";
        if (strArray.length > 4) {
            int j = 0;
            for (int i = 0; i < strArray.length - 4; i++) {
                result = result + "#";
                j++;
            }
            for (int i = 0; i < 4; i++) {
                result = result + strArray[j];
                j++;
            }
        } else {
            return str;
        }
        return result;
//        throw new UnsupportedOperationException("Unimplemented");

    }
}
