/**
 * Created by Bao on 2/15/2016.
 */
public class UserInput {

    /**
     *  Gets the userInput attribute
     *@return         The userInput value
     */
    public String getUserInput() {
        String  inputLine  = null;
        try {
            BufferedReader  is =
                    new BufferedReader(
                            new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) {
                return null;
            }
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }

        return inputLine.toLowerCase();
    }
}
