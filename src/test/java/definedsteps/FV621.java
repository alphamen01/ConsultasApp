package definedsteps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class FV621 {
    WebDriver driver;

    @Given("que la web de Conduit esta disponible")
    public void que_la_web_de_Conduit_esta_disponible() {
        System.setProperty("web-driver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://alphamen01.github.io/angular-realworld-example-app-testing-2023/");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@routerlink='/login']")).click();
    }

    @When("me logueo con mis credenciales")
    public void me_logueo_conmis_credenciales() {
        driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("lesg.2233@gmail.com");
        driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("LuisEnrique");
        driver.findElement(By.xpath("//button[@type='submit']")).click();;
    }
//////
    @When("realizo el registro de un nuevo articulo")
    public void realizo_el_registro_de_un_nuevo_articulo() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(driver -> driver.findElement(By.xpath("//a[@routerlink='/editor']")));
        driver.findElement(By.xpath("//a[@routerlink='/editor']")).click();
        driver.findElement(By.xpath("//input[@formcontrolname='title']")).sendKeys("Gaseosa");
        driver.findElement(By.xpath("//input[@formcontrolname='description']")).sendKeys("Bebida refrecante");
        driver.findElement(By.xpath("//textarea[@formcontrolname='body']")).sendKeys("Compuesta");
        driver.findElement(By.xpath("//input[@placeholder='Enter tags']")).sendKeys("Bebidas");
        driver.findElement(By.xpath("//button[@type='button']")).click();

    }

    @Then("el articulo agregado se mostrara en el Home")
    public void el_articulo_agregado_se_mostrara_en_el_Home() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(driver -> driver.findElement(By.xpath("//h1[text()='Gaseosa']")));
        driver.findElement(By.xpath("//a[@href='/angular-realworld-example-app-testing-2023/']")).click();
    }
 //////
     @When("se selecciona el nuevo registro")
     public void se_selecciona_el_nuevo_registro() {
         // Write code here that turns the phrase above into concrete actions
         WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
         wait.until(driver -> driver.findElement(By.xpath("//h1[text()='Gaseosa']")));
         driver.findElement(By.xpath("//h1[text()='Gaseosa']")).click();
     }
    @Then("realizo el comentario del registro seleccionado")
    public void realizo_el_comentario_del_registro_seleccionado() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(driver -> driver.findElement(By.xpath("//h1[text()='Gaseosa']")));
        //driver.findElement(By.xpath("//a[text()=' Edit Article ']")).click();
        driver.findElement(By.xpath("//textarea[@placeholder='Write a comment...']"))
                .sendKeys("Me encanto la bebida.");
    }

    @And("guardo el comentario realizado al registro")
    public void guardo_el_comentario_realizado_al_registro() {
        /*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(driver -> driver.findElement(By.xpath("//span[text()=' Bebidas ']")));
        driver.findElement(By.xpath("//textarea[@formcontrolname='body']"))
                .sendKeys(" a base de agua carbonatada, edulcorantes naturales como fructosa o sacarosa " +
                        "o sintéticos como el ciclamato (E952), acidulantes, colorantes, antioxidantes, estabilizadores " +
                        "de acidez y conservantes.");
        driver.findElement(By.xpath("//button[@type='button']")).click();*/
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(driver -> driver.findElement(By.xpath("//p[@class='card-text']")));
        driver.findElement(By.xpath("//a[@href='/angular-realworld-example-app-testing-2023/']")).click();
    }
///
    @When("se selecciona el registro de un articulo")
    public void se_selecciona_el_registro_de_un_articulo() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(driver -> driver.findElement(By.xpath("//h1[text()='Gaseosa']")));
        driver.findElement(By.xpath("//h1[text()='Gaseosa']")).click();
    }
    @Then("realizo la eliminacion del comentario")
    public void realizo_la_eliminacion_del_comentario() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(driver -> driver.findElement(By.xpath("//h1[text()='Gaseosa']")));
        driver.findElement(By.xpath("//span[@class='mod-options']")).click();
    }
    @And("regresar a la vista principal")
    public void regresar_a_la_vista_principal() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//p[@class='card-text']")));
        driver.findElement(By.xpath("//a[@href='/angular-realworld-example-app-testing-2023/']")).click();
    }
}

