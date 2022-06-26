import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqaTest {
    public static void main(String[] args) {
        WebDriver auto = new ChromeDriver();

        auto.get("https://demoqa.com");

        auto.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[1]")).click();
        auto.findElement(By.id("item-1")).click();
        auto.findElement(By.className("rct-checkbox")).click();
        auto.findElement(By.id("item-2")).click();
        auto.findElement(By.xpath("//div/label[text()='Impressive']")).click();
        auto.findElement(By.xpath("//div/label[text()='Yes']")).click();


    }
}
