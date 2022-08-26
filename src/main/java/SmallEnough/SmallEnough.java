package SmallEnough;

/**
 * 7 кью
 */
public class SmallEnough {

    public static void main(String[] args) {
        System.out.println(SmallEnough.smallEnough(new int[]{1, 2, 3, 4}, 3));
    }

    public static boolean smallEnough(int[] a, int limit) {

        for (int elem: a) {
            if(elem>limit) {
                return false;
            }
        }
        return true;
    }
}
