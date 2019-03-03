package samples;

import lombok.NonNull;

public class NonNullDemo {

    public static void main(String[] args) {
        System.out.println(NonNullDemo.isEven(4));
    }

    public static boolean isEven(@NonNull Integer num) {
        return (num % 2 == 0);
    }

}
