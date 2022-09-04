package org.example.Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumPizzaOrder {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver pizzaOrder = new ChromeDriver();

        pizzaOrder.get("https://dodopizza.ru/moscow");
        pizzaOrder.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        pizzaOrder.manage().window().fullscreen(); // Без полного экрана он просто не находит элементы

        pizzaOrder.findElement(By.xpath("//img[contains(@alt,'Пицца-конструктор')]")).click();
        pizzaOrder.findElement(By.xpath("//label[@data-testid='menu__pizza_size_3']")).click();
        pizzaOrder.findElement(By.xpath("//label[@data-testid='menu__pizza_dough_2']")).click();
        pizzaOrder.findElement(By.xpath("//button[@type='button'][contains(.,'Пикантная пепперони')]")).click();
        pizzaOrder.findElement(By.xpath("//button[contains(.,'Острая чоризо')]")).click();
        pizzaOrder.findElement(By.xpath("//button[contains(.,'Острый халапеньо')]")).click();
        pizzaOrder.findElement(By.xpath("//button[@data-size='big']")).click();
        pizzaOrder.findElement(By.xpath("//button[@type='button'][contains(.,'Корзина')]")).click();
        pizzaOrder.findElement(By.xpath("//div[@class='background'][contains(.,'Соусы')]")).click();
        pizzaOrder.findElement(By.xpath("(//button[contains(.,'35')])[2]")).click();
        pizzaOrder.findElement(By.xpath("(//button[contains(@data-testid,'menu__meta-product_add-control')])[3]")).click();
        pizzaOrder.findElement(By.xpath("(//button[contains(@data-testid,'menu__meta-product_add-control')])[3]")).click(); //Увеличиваем количество соуса до 3
        pizzaOrder.findElement(By.xpath("//button[@class='card-close']")).click();
        pizzaOrder.findElement(By.xpath("//button[contains(.,'К оформлению заказа')]")).click();
        Thread.sleep(5000);// Для просмотра результата
        pizzaOrder.quit();












    }
}
