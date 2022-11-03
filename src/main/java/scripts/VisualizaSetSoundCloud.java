package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisualizaSetSoundCloud {
    private final ChromeDriver driver = new ChromeDriver();


    public void ouvir() throws InterruptedException {
        driver.get("https://soundcloud.com/hypeermusic/this-is-hyper-2/s-VhfVg71hY3M?si=ecc72c3e8fe44692bb73ab9e1fc537a8&utm_source=clipboard&utm_medium=text&utm_campaign=social_sharing");
        Thread.sleep(2000);
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        driver.findElement(By.className("sc-button-play")).click();
        Thread.sleep(20000);

        driver.close();
    }
}
