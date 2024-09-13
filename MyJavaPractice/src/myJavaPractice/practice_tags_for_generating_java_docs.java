package myJavaPractice;

/**
 * This is a test class
 */
public class practice_tags_for_generating_java_docs {
    /**
     *
     * @param args These are arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     * Hi this is a method I have written to test JavaDoc. It was fun!
     * @param i This is the first parameter
     * @param j This is the second parameter
     * @return Sum of two numbers as an integer
     * @throws Exception if j is 0
     * @deprecated This method is deprecated use + operator
     */
    public int add(int i, int j) throws Exception {
        if(j == 0) {
            throw new Exception();
        }
        int c;
        c = i + j;
        return c;
    }

}
