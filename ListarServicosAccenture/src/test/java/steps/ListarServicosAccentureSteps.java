package steps;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;

public class ListarServicosAccentureSteps {
	
	WebDriver driver;

	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jennefer\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Dado("que eu estou no site da Accenture")
	public void que_eu_estou_no_site_da_accenture() {

		driver.get("https://www.accenture.com/br-pt");
		
	}

	@E("clico no menu serviços")
	public void clico_no_menu_serviços() {

		driver.findElement(By.cssSelector("#navigation-menu > div.nav-submenu.panel.layout-column.short >"
											+ " div.gh-item.nav-submenu-label > span")).click();
		
	}
	
	@Então("devo ver o {string}")
	public void devo_ver_o_serviço(String serviço) {
		
		String title = driver.findElement(By.linkText(serviço)).getText();
		assertEquals(serviço, title);
		
	}
	
	@After
	public void fim() {
		
		driver.quit();
		
	}

}
