package example;

/**
 * Class for getting your Grade API token.
 */
public class GetToken {

    /**
     * Run to get your token after you complete the code.
     * @param args unused arguments
     */
    public static void main(String[] args) {
        GetExample example = new GetExample();

        String gradeAPISignUpURL = "https://grade-apis.panchen.ca/signUp";
        // TODO Task 1: use the run method to get your Grade API token (or obtain your token through a web browser).
        String response = "";
        try {
            // Replace "your_username_here" with your own desired username
            response = example.run(gradeAPISignUpURL, "username", "Balino");
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
        // response = example.run( ...)
        System.out.println(response);
    }
}
