public class Multiples {
    public static int main(int n, int divisible1, int divisible2) {

        int count = 0;

        for (int i = 0; i < n; i++) {

            if (i % divisible1 == 0 || i % divisible2 == 0) {

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

    }

}

//    public static int GetCount(int number, int divisible1, int divisible2){
//
//
//        int count = 0;
//
//
//
//            for (int i = 1; i < number; i++) {
//
//                // Find out which numbers divide i.
//                boolean divisibleByn1 = i % divisible1 == 0;
//                boolean divisibleByn2 = i % divisible2 == 0;
//
//                // Print our appropriate result.
//                if (divisibleByn1 && divisibleByn2) {
//
//                    count++;
//
//                } else if (divisibleByn1) {
//
//                    count++;
//
//                } else if (divisibleByn2) {
//
//                    count++;
//                }
//            }
//            return count;
//    }
//
//
//    public static void main(String[] args) {
//        int result = GetCount(1000, 3, 5);
//        System.out.println(result);
//    }
//}
