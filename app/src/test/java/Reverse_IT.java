
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Reverse_IT {

    @Test
    @DisplayName("canReverseStringArray")
    void canReverseStringArray()
    {
        //Arrange
       ReverseStringArrays reverse = new ReverseStringArrays();
       String[] actualArray = { "All", "Your", "Basses", "Are", "Belong", "To", "Us"};
       String[] expectedArray = {"Us", "To", "Belong", "Are", "Basses", "Your", "All" };
       //Act
        reverse.reverse(actualArray);

        //Assert
        assertThat(actualArray, is(expectedArray));
    }

    @Test
    @DisplayName("Output test")
    void canBuildStringWithTag()
    {
        //Arrange
        ReverseStringArrays reverse = new ReverseStringArrays();
        String lineTag = String.format("Case #%s: ", 1);
        String[] expectedArray = {"Us", "To", "Belong", "Are", "Basses", "Your", "All" };
        String expectedOutput = "Case #1: Us To Belong Are Basses Your All";

        //Act
        String actualOutput = reverse.buildArrayWithTag(lineTag, expectedArray, expectedArray.length);

        //Assert
        assertThat(actualOutput, is(expectedOutput));
    }
}
