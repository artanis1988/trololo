package gradle.sample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: kariakin
 * Date: 4/7/14
 * Time: 4:55 PM
 */

public class ReadWelcomeMessageTest {

    @Test
    public void testGetWelcomeMessage() throws Exception {
        //given
        final ReadWelcomeMessage reader = new ReadWelcomeMessageImpl();
        final String realMessage = reader.getWelcomeMessage();

        //when
        final String expectedMessage = "Welcome to Gradle!";

        //expected
        assertEquals("Get text from implementation and compare to the expected result", expectedMessage, realMessage);
    }
}
