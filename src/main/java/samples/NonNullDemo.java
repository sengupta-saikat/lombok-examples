package samples;

import lombok.NonNull;

public class NonNullDemo {

    public static boolean isEven(@NonNull Integer num) {
        return (num % 2 == 0);
    }

}
