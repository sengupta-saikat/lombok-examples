package samples;

import lombok.Cleanup;
import lombok.Getter;

/**
 * Ensure a given resource is automatically cleaned up before the code execution path exits your current scope.
 * @see <a href="https://projectlombok.org/features/Cleanup">official documentation</a>
 */

public class CleanupDemo {

    public static void main(String[] args) {
        new CleanupDemo().cleanup();
    }

    public String cleanup() {
        @Cleanup("destroy") CustomClazz clazz = new CustomClazz();
        return clazz.getName();
    }

    class CustomClazz {
        @Getter
        private String name = "Quality";

        public void close() {
            this.name = "";
            System.out.println("You closed me :(");
        }

        public void destroy() {
            this.name = "Engineering";
            System.out.println("I'm closed :)");
        }
    }
}
