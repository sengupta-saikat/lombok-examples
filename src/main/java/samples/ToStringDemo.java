package samples;

import lombok.ToString;

/**
 * Generates an implementation of the toString() method.
 * By default, it'll print your class name, along with each field, in order, separated by commas.
 * @see <a href="https://projectlombok.org/features/ToString">official documentation</a>
 */

@ToString
public class ToStringDemo {

    @ToString.Exclude
    private int id;
    private static final int STATIC_VAR = 10;
    private String name;
    private String[] tags = {"foo", "bar"};

    public String getName() {
        return "demo";
    }

    @ToString.Include
    private long getRating() {
        return Long.MIN_VALUE;
    }

    public static void main(String[] args) {
        System.out.println(new ToStringDemo());
    }
}
