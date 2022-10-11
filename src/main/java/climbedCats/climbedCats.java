package climbedCats;

public class climbedCats {
    public static void main(String[] args) {
        System.out.println(solution(1, 7));
    }

    public static int solution(int start, int finish)
    {
        int countResult = 0;
        while (start!=finish){
            if (start + 1 == finish) {
                countResult++;
                start++;
            } else if (start + 2 == finish) {
                countResult = countResult + 2;
                start = start + 2;
            } else {
                countResult++;
                start = start + 3;
            }
        }
        return countResult;
    }
}
