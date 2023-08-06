import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class GoogleSearch {

    private WebDriver driver;

    @BeforeTest
    public void start() throws InterruptedException {
        //locate webdriver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //Open browser
        driver = new ChromeDriver();
        //Input url
        driver.get("https://www.google.com/");
        Thread.sleep(1500);
        //Maximize the browser
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //locate and input the word in the search box
        driver.findElement(By.id("APjFqb")).sendKeys("Best QA Engineering practices");
        Thread.sleep(1000);
        //Click on any blank side of the page to make the search button visible
        driver.findElement(By.xpath("/html/body/div[1]/div[2]")).click();
        //click the search button
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
        Thread.sleep(5000);

    }
    @AfterTest
    public void close(){
        //Close browser
        driver.quit();
    }

}
