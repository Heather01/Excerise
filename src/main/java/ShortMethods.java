public class ShortMethods {

    public static void main(String[] args) {
        System.out.println(ShortMethods.isOdd(25));
    }

    private static boolean isMultiple(long n, long m) {
       boolean answer =false;
        for (int i = 1; i < 100; i++) {
            if(n == m*i) {
                answer = true;
            }
        }
       return answer;
    }
    private static boolean isOdd(int i) {
        boolean answer = false;

        for (int j = 1; j <= i; i++)
            answer = !answer;

        return answer;
    }


}
