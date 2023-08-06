import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

    public class LoginAndPost {
    private WebDriver driver;

        @BeforeTest
        public void start() throws InterruptedException {
            //locate webdiver
            System.setProperty("webdiver.chrome.driver", "resources/chromedriver.exe");
            //Open the browser
            driver = new ChromeDriver();
            //Input the url
             driver.get("https://web.facebook.com/");
            Thread.sleep(1500);
            //Maximise the browser
            driver.manage().window().maximize();
            Thread.sleep(2500);

            // Email and password variable
            String email = " ";
            String password = " ";

            //Click on email or phone input field
            driver.findElement(By.id("email")).sendKeys(email);
            //Enter password
            driver.findElement(By.id("pass")).sendKeys(password);
            //Click on login button
            driver.findElement(By.name("login")).click();
            Thread.sleep(6000);

            //Click on what is on your mind
            driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[3]/div/div[2]/div/div/div/div[1]/div/div[1]/span")).click();
            Thread.sleep(2000);
            //Locate the Iframe //*[@id="facebook"]/body/iframe[1]
            By locIframe = By.xpath("//*[@id=\"facebook\"]/body/iframe[1]");
            driver.switchTo().frame(driver.findElement(locIframe));
            Thread.sleep(4000);
            //Post what's on your mind
            driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div[2]")).sendKeys("I Kill Bugs");
            //Click post
            driver.findElement(By.xpath("//*[@id=\"mount_0_0_j6\"]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[3]/div[2]/div/div")).click();

            }

            @AfterTest
            public void close(){
            driver.quit();
            //Quit browser
            }

    }


