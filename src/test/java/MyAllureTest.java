import io.qameta.allure.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

public class MyAllureTest {
    @Step("Проверка разности числа {num1}")
    public static void checkSumStep(int num1, int num2, int expectedSum) {
        Assert.assertTrue("Сумма слагаемых не соответствует ожидаемому значению", num1 + num2 == expectedSum);
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Check Description 1")
    @Step("{0} for {1}")
    @Test
    public void simpleTest2() {
        checkSumStep(3, 2, 5);
        checkSumStep(5, 4, 9);
    }




    @Description("Checking the text")
    @Test
    public void test1(){
        String title = "my text";
        assertEquals(title,"my text");
        System.out.println("String is verify");
    }

    @Description("Checking the tex2t")
    @Test
    public void test2(){
        String title = "My text";
        assertEquals(title,"my text");
        System.out.println("String is verify");
    }


    @Attachment(value = "Вложение", type = "application/json")
    public static byte[] getBytesAnnotationWithArgs(String resourceName) throws IOException {
        return Files.readAllBytes(Paths.get("src/main/resources", resourceName));
    }

}