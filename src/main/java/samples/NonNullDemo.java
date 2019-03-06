package samples;

import lombok.NonNull;

/**
 * Use on the parameter of a method or constructor to have lombok generate a null-check statement for you.
 * @see <a href="https://projectlombok.org/features/NonNull">official documentation</a>
 */

public class NonNullDemo {

    public static void main(String[] args) {
        System.out.println(NonNullDemo.isEven(4));
    }

    public static boolean isEven(@NonNull Integer num) {
        return (num % 2 == 0);
    }

}
