public class CommandNotFoundException extends RuntimeException {

    public CommandNotFoundException() {
        super("Invalid Commands");
    }
}
