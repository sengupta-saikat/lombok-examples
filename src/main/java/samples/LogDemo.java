package samples;

import lombok.extern.java.Log;

/**
 * Generates a logger field
 * @see <a href="https://projectlombok.org/features/log">official documentation</a>
 */

@Log
public class LogDemo {

    public static void main(String[] args) {
        log.info("Hi there!");
    }
}
