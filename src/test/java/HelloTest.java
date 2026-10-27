public class HelloTest {
    public static void main(String[] args) {
        Hello hello = new Hello();

        if (hello.add(2, 3) == 5) {
            System.out.println("Test passed!");
        } else {
            throw new RuntimeException("Test failed!");
        }
    }
}
