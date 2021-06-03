
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    static WebDriver driver;

    @BeforeClass
    public static void insterData(){
        System.setProperty("webdriver.chrome.driver",
                "webdriver/chromedriver82.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://kitm.epizy.com/filmai.php?i=1");
    }

    @Test
    public void fillForm(){

        WebElement pavadinimas = driver.findElement(By.name("pavadinimas"));
        pavadinimas.sendKeys("pavadinimas");
        WebElement zanras = driver.findElement(By.name("zanras"));
        zanras.sendKeys("zanras");
        WebElement aktoriai = driver.findElement(By.name("aktoriai"));
        aktoriai.sendKeys("aktoriai");
        WebElement rezisierius = driver.findElement(By.name("rezisierius"));
        rezisierius.sendKeys("rezisierius");
        WebElement trukme = driver.findElement(By.name("trukme"));
        trukme.sendKeys("123");


        WebElement siusti = driver.findElement(By.name("insert"));
        siusti.click();
    }
    @Test
    public void notValidateData(){
        WebElement pavadinimas = driver.findElement(By.name("pavadinimas"));
        pavadinimas.sendKeys("pavadinimas");
        WebElement zanras = driver.findElement(By.name("zanras"));
        zanras.sendKeys("zanras");
        WebElement aktoriai = driver.findElement(By.name("aktoriai"));
        aktoriai.sendKeys("aktoriai");
        WebElement rezisierius = driver.findElement(By.name("rezisierius"));
        rezisierius.sendKeys("rezisierius");
        WebElement trukme = driver.findElement(By.name("trukme"));
        trukme.sendKeys("vienas");


        WebElement siusti = driver.findElement(By.name("insert"));
        siusti.click();
    }

    @Test
    public void deleteData(){
        WebElement id = driver.findElement(By.name("id"));
        id.sendKeys("1");
        WebElement trinti = driver.findElement(By.name("delete"));
        trinti.click();
    }
    @Test
    public void editData(){
        WebElement id = driver.findElement(By.name("id"));
        id.sendKeys("1");
        WebElement pavadinimas = driver.findElement(By.name("pavadinimas"));
        pavadinimas.sendKeys("pavadinimas1");
        WebElement zanras = driver.findElement(By.name("zanras"));
        zanras.sendKeys("zanras1");
        WebElement aktoriai = driver.findElement(By.name("aktoriai"));
        aktoriai.sendKeys("aktoriai1");
        WebElement rezisierius = driver.findElement(By.name("rezisierius"));
        rezisierius.sendKeys("rezisierius1");
        WebElement trukme = driver.findElement(By.name("trukme"));
        trukme.sendKeys("321");


        WebElement update = driver.findElement(By.name("update"));
        update.click();
    }
    @Test
    public void editNotValidData() {
        WebElement id = driver.findElement(By.name("id"));
        id.sendKeys("1");
        WebElement pavadinimas = driver.findElement(By.name("pavadinimas"));
        pavadinimas.sendKeys("pavadinimas1");
        WebElement zanras = driver.findElement(By.name("zanras"));
        zanras.sendKeys("zanras1");
        WebElement aktoriai = driver.findElement(By.name("aktoriai"));
        aktoriai.sendKeys("aktoriai1");
        WebElement rezisierius = driver.findElement(By.name("rezisierius"));
        rezisierius.sendKeys("rezisierius1");
        WebElement trukme = driver.findElement(By.name("trukme"));
        trukme.sendKeys("vienas");


        WebElement update = driver.findElement(By.name("update"));
        update.click();
    }

    @AfterClass
    public static void tearDown(){

    }
}