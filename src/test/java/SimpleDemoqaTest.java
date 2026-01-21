import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
public class SimpleDemoqaTest {

    @Test
    void firstTest() {
        Assertions.assertTrue(3 > 2);
    }

}