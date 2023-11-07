package L01_BasicSyntax.Lab;

public class P08DivisibleBy3 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
