package samples;

import lombok.Cleanup;
import lombok.Getter;

public class CleanupDemo {

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
