package samples;

import lombok.ToString;

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
