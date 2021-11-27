public class toolbox {

    /**
     * Wraps the Thread.sleep() Method and catches the exception by ignoring
     *
     * @param TimeInMillis time in Milliseconds to sleep
     */
    static void sleep(long TimeInMillis) {
        try {
            Thread.sleep(TimeInMillis);
        } catch (Exception ignored) {
        }
    }

    /**
     * Wraps the Thread.sleep() Method and catches the exception by ignoring
     *
     * @param TimeInSeconds time in Seconds to sleep
     */
    static void sleepSeconds(long TimeInSeconds) {
        try {
            Thread.sleep(TimeInSeconds / 1000);
        } catch (Exception ignored) {
        }
    }

    /**
     * Wraps System.out.println()
     *
     * @param string String to be printed
     */
    static void print(String string) {
        System.out.println(string);
    }

    /**
     * Wraps System.err.println()
     *
     * @param string String to be printed
     */
    static void printErr(String string) {
        System.err.println(string);
    }

    /**
     * Parses an Integer to a String using Integer.toString
     *
     * @param i Integer to be parsed
     * @return Integer as String
     */
    static String intToString(int i) {
        return Integer.toString(i);
    }

    /**
     * Returns a random integer in the given range, including the boundaries
     *
     * @param min lower boundary(included)
     * @param max upper boundary(included)
     * @return random Integer in the given range
     */
    static int RandomInt(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    /**
     * Returns a random String
     *
     * @param length length of the String
     * @return random String of the given length
     */
    static String randomString(int length) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append((char) RandomInt(33, 126));
        }
        return result.toString();
    }

    /**
     * Quit program execution successfully
     * status = 0  (successful)
     */
    public static void exit() {
        System.exit(0);
    }

    /**
     * Quit program execution unsuccessfully
     * status = 1 (some error happened)
     */
    public static void quit() {
        System.exit(1);
    }
    /**
     * Quit program execution unsuccessfully and print an Error Message to System.err
     * status = 1 (some error happened)
     *
     * @param error Error message to be displayed
     */
    public static void quit(String error) {
        printErr(error);
        System.exit(1);
    }

    /**
     * Test stuff here
     * @param args arguments
     */
    public static void main(String[] args) {
        //Test stuff here
        print(randomString(20));
        System.err.println("hallo");
    }

}


