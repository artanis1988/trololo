package gradle.sample;

/**
 * User: kariakin
 * Date: 4/7/14
 * Time: 4:51 PM
 */
public class SampleApp {

    public SampleApp() {}

    public static void main(String[] args) {
        final SampleApp app = new SampleApp();
        app.welcomeMessage();
    }

    public void welcomeMessage() {
        final String welcomeMessage = readMessage();
        showMessage(welcomeMessage);
    }

    private String readMessage() {
        final ReadWelcomeMessage reader = new ReadWelcomeMessageImpl();
        final String message = reader.getWelcomeMessage();
        return message;
    }

    private void showMessage(final String message) {
        System.out.println(message);
    }
}
