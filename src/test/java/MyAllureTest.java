import io.qameta.allure.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static steps.Steps.*;

public class MyAllureTest {


    @Severity(SeverityLevel.CRITICAL)
    @Description("Check Description 1")
    @Test
    public void simpleTest2() {
        checkSumStep(3, 2, 5);
        checkSumStep(5, 4, 9);
    }

    @Test
    public void attachTest() throws IOException {
        getBytesAnnotationWithArgs("response.json");
        getBytesAnnotationWithArgs("Без названия.jfif");
    }

}