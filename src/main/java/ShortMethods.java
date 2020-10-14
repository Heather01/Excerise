public class ShortMethods {

    public static void main(String[] args) {
        System.out.println(ShortMethods.isMultiple(25,5));
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
}
