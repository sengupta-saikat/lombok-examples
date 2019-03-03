package samples;

import lombok.EqualsAndHashCode;

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
