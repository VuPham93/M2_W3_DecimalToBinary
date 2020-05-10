import java.util.Stack;

public class DecimalToBinary {
    public static String convert(int number) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        do {
            stack.push(number % 2);
            number = number / 2;
            count++;
        } while (number > 0);

        String[] array = new String[count];

        for (int i = 0; i < count; i++) {
            array[i] = String.valueOf(stack.pop());
        }

        return String.join("", array);
    }

}
