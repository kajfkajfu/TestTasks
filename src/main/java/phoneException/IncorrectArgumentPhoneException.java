package phoneException;

public class IncorrectArgumentPhoneException extends Exception {

    /**
     * Return IncorrectArgumentPhoneException if the argument
     * is entered incorrectly
     */
    public IncorrectArgumentPhoneException(String errorMessage) {
        super(errorMessage);
    }
}
