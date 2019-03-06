package samples;

import lombok.EqualsAndHashCode;

/**
 * Generates implementations of the <code>equals(Object other)</code> and <code>hashCode()</code> methods.
 * By default, it'll use all non-static, non-transient fields
 * @see <a href="https://projectlombok.org/features/EqualsAndHashCode">official documentation</a>
 */

@EqualsAndHashCode
public class EqualsAndHashCodeDemo {

    private String name;
    private int id;

    @EqualsAndHashCode.Exclude
    private String dept;

    public EqualsAndHashCodeDemo(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public static void main(String[] args) {
        EqualsAndHashCodeDemo e1 = new EqualsAndHashCodeDemo(123, "Saikat", "IT");
        EqualsAndHashCodeDemo e2 = new EqualsAndHashCodeDemo(123, "Saikat", "HR");
        EqualsAndHashCodeDemo e3 = new EqualsAndHashCodeDemo(123, "Sagar", "Legal");

        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e3));
    }
}
