import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
public class SimpleDemoqaTest {

    int result;

   @BeforeAll
   static void DlyaVsego(){
       System.out.println("\n### Zapomni\n");
   }

    @AfterAll
    static void Agaponyal() {
        System.out.println("\n### Kones\n");
    }

    @BeforeEach
    void Aaponyal(){
        System.out.println("### Nastroika");
        result = 3;
    }

    @AfterEach
    void Posle() {
        System.out.println("### WorkCLOSE\n");
        result = 0;
    }

    @Test
    void firstTest() {
        System.out.println("###      firstTest()");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void secondTest() {
        System.out.println("###      secondTest()");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void thirdTest() {
        System.out.println("###      thirdTest()");
        Assertions.assertTrue(result > 2);
    }
}