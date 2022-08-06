package Autoria;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class AutoriaUA
{

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://auto.ria.com/uk/");
        driver.manage().window().maximize();

        // Select "New cars"
        driver.findElement(By.cssSelector("#mainSearchForm > div.nav > label:nth-child(6)")).click();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       // Select brand
        driver.findElement(By.cssSelector("#brandTooltipBrandAutocomplete-brand > label")).click();
        driver.findElement(By.cssSelector("#brandTooltipBrandAutocomplete-brand > ul > li:nth-child(44) > a")).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Select a mark
        driver.findElement(By.cssSelector("#brandTooltipBrandAutocomplete-model > label")).click();
        driver.findElement(By.cssSelector("#brandTooltipBrandAutocomplete-model > ul > li:nth-child(8) > a")).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Select region
        driver.findElement(By.cssSelector("#regionCenters")).click();
        driver.findElement(By.cssSelector("#regionCenters > option:nth-child(3)")).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Select years
        driver.findElement(By.cssSelector("#yearTo > option:nth-child(2)")).click();
        driver.findElement(By.cssSelector("#yearFrom > option:nth-child(4)")).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Input Price
        driver.findElement(By.cssSelector("#priceFrom")).sendKeys("19500");
        driver.findElement(By.cssSelector("#priceTo")).sendKeys("23500");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click Search button
        driver.findElement(By.cssSelector("#mainSearchForm > div.footer-form > button")).click();
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Cars Exist
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[1]/div[2]/div/div[2]/div/a[2]")).click();
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // All cars
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[1]/div[2]/div/div[2]/div/a[1]")).click();
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Cars equips
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[1]/div[2]/div/div[2]/div/a[3]")).click();
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Credit terms
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[1]/div[2]/div/div[2]/div/a[4]")).click();
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Test drives
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[1]/div[2]/div/div[2]/div/a[5]")).click();
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // All cars
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[1]/div[2]/div/div[2]/div/a[1]")).click();
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //
        driver.findElement(By.xpath("//*[@id=\"gdprId\"]/div/div[1]/div[2]/label[1]")).click();
        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




        driver.findElement(By.xpath("//*[@id=\"side_banner\"]/div/span")).click();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        // Scroll down
        jse.executeScript("window.scrollBy(0, 700);");

        driver.findElement(By.xpath("//*[@id=\"leftFilterForm\"]/div[7]/div[2]/div/label")).click();

        // Cheng Price min value
        driver.findElement(By.xpath("//*[@id=\"leftFilterPriceFrom\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"leftFilterPriceFrom\"]")).clear();

        driver.findElement(By.xpath("//*[@id=\"leftFilterPriceFrom\"]")).sendKeys("23300");

        // Region
        driver.findElement(By.xpath("//*[@id=\"leftFilterForm\"]/div[5]/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\"leftFilterForm\"]/div[5]/div/div/div/div[3]/div[1]/div[2]/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"leftFilterForm\"]/div[5]/div/div/div/a[1]")).click();

        // Cheng Price max value
        driver.findElement(By.xpath("//*[@id=\"leftFilterPriceTo\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"leftFilterPriceTo\"]")).clear();

        driver.findElement(By.xpath("//*[@id=\"leftFilterPriceTo\"]")).sendKeys("29000");

        // TimeOut for Show button
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Show button
        driver.findElement(By.xpath("//*[@id=\"leftFilterForm\"]/div[13]/div[1]/a")).click();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // ScrollHeight - Scroll down
        jse.executeScript("window.scrollBy(0, document.body.scrollHeight);");

        // ScrollUp
        jse.executeScript("window.scrollBy(0, -document.body.scrollHeight);");
        System.out.println();


        driver.quit();



    }
}
