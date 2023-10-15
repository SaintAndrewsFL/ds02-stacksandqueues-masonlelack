import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       StackLL<String> stackLL = new StackLL<>();
        for (int i = 1; i < 5; i++) {
            stackLL.push("" + i);
        }

        System.out.println(stackLL.isEmpty());
        System.out.println();
    }
    //final product
}