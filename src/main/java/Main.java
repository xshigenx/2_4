public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("Suma liczb od 0 do 100: " + sum);
    }
}