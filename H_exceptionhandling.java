// Exception Handling

// Custom Exception
class Custom_Exception extends Exception {

    // Custom Exception Method
    @Override
    public String getMessage() {
        return "new Exception";
    }
}

public class H_exceptionhandling {
    public static void main(String[] args) throws Custom_Exception {

        int a = 5;
        int b = 0;

        // Try Catch Finally Block
        try {
            System.out.println(a / b);
        } catch (Exception e) {

            // Exception Printing
            System.out.println("Sorry Exception is : " + e);

            // Custom Exception Throw
            throw new Custom_Exception();

        } finally {
            System.out.println("Compalsory Executable Code");
        }
    }
}
