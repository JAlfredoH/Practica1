package Features;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiPrimerTest {
private static WebDriver driver;
    @Before
        public void setUp()
    {

        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
    }

    @Test

        public void Test1() throws InterruptedException
    {
        WebElement InputBusqueda = driver.findElement(By.id("twotabsearchtextbox"));
        InputBusqueda.click();
        InputBusqueda.sendKeys("Alexa");
        WebElement InputBoton = driver.findElement(By.id("nav-search-submit-button"));
        InputBoton.click();
        WebElement BuscarOrdenar = driver.findElement(By.id("a-autoid-0-announce"));
        BuscarOrdenar.click();
        Thread.sleep(2000);
        WebElement SeleccionarOrden = driver.findElement(By.id("s-result-sort-select_2"));
        SeleccionarOrden.click();
        Thread.sleep(5000);

    }

    @After
        public void tearDown () throws InterruptedException
    {
       driver.quit();
    }
}
