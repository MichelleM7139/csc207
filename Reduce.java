
public class Reduce {
    public static int main(int n) {
        int steps = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
            }
            steps++;
        }

        System.out.println(+steps);
        return steps;
    }
    public static void main(String[] args) {}
}