package com.sinensia.hellotestrobobar;

// Generated by Selenium IDE

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RoboBarCartTest {
    private WebDriver driver;
    JavascriptExecutor js;
    @BeforeAll
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
    }
    @AfterAll
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void x1RobaColaCompleto() {
        // Test name: x1RobaColaCompleto
        // Step # | name | target | value
        // 1 | open | http://localhost:3000/#!/#%2F |
        driver.get("http://localhost:3000/#!/#%2F");
        // 2 | setWindowSize | 1035x947 |
        driver.manage().window().setSize(new Dimension(1035, 947));
        // 3 | click | css=.ng-scope:nth-child(1) > td .input-group-append > .btn |
        driver.findElement(By.cssSelector(".ng-scope:nth-child(1) > td .input-group-append > .btn")).click();
        // 4 | click | css=.btn-success |
        driver.findElement(By.cssSelector(".btn-success")).click();
        // 5 | click | css=.btn-success |
        driver.findElement(By.cssSelector(".btn-success")).click();
        // 6 | close |  |
        //driver.close();
    }
    @Test
    public void x1RobaBeer() {
        // Test name: x1RobaBeer
        // Step # | name | target | value
        // 1 | open | http://localhost:3000/#!/#%2F |
        driver.get("http://localhost:3000/#!/#%2F");
        // 2 | setWindowSize | 1159x948 |
        driver.manage().window().setSize(new Dimension(1159, 948));
        // 3 | click | css=.ng-scope:nth-child(2) > td .input-group-append > .btn |
        driver.findElement(By.cssSelector(".ng-scope:nth-child(2) > td .input-group-append > .btn")).click();
        // 4 | assertText | css=tr:nth-child(4) > .ng-binding | €2.00
        assertThat(driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).getText(), is("€2.00"));
        // 5 | close |  |
        //driver.close();
    }
    @Test
    public void x1RobaCola() {
        // Test name: x1RobaCola
        // Step # | name | target | value
        // 1 | open | http://localhost:3000/#!/#%2F |
        driver.get("http://localhost:3000/#!/#%2F");
        // 2 | setWindowSize | 1097x948 |
        driver.manage().window().setSize(new Dimension(1097, 948));
        // 3 | click | css=.ng-scope:nth-child(1) > td .input-group-append > .btn |
        driver.findElement(By.cssSelector(".ng-scope:nth-child(1) > td .input-group-append > .btn")).click();
        // 4 | click | css=tr:nth-child(4) > .ng-binding |
        driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).click();
        // 5 | click | css=tr:nth-child(4) > .ng-binding |
        driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).click();
        // 6 | doubleClick | css=tr:nth-child(4) > .ng-binding |
        {
            WebElement element = driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        // 7 | click | css=tr:nth-child(4) > .ng-binding |
        driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).click();
        // 8 | assertText | css=tr:nth-child(4) > .ng-binding | €1.25
        assertThat(driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).getText(), is("€1.25"));
        // 9 | close |  |
        //driver.close();
    }
    @Test
    public void x1RobaLos3() {
        // Test name: x1RobaLos3
        // Step # | name | target | value
        // 1 | open | http://localhost:3000/#!/#%2F |
        driver.get("http://localhost:3000/#!/#%2F");
        // 2 | setWindowSize | 1221x948 |
        driver.manage().window().setSize(new Dimension(1221, 948));
        // 3 | click | css=.ng-scope:nth-child(1) > td .input-group-append > .btn |
        driver.findElement(By.cssSelector(".ng-scope:nth-child(1) > td .input-group-append > .btn")).click();
        // 4 | click | css=.ng-scope:nth-child(2) > td .input-group-append > .btn |
        driver.findElement(By.cssSelector(".ng-scope:nth-child(2) > td .input-group-append > .btn")).click();
        // 5 | click | css=.ng-scope:nth-child(3) .input-group-append > .btn |
        driver.findElement(By.cssSelector(".ng-scope:nth-child(3) .input-group-append > .btn")).click();
        // 6 | assertText | css=tr:nth-child(4) > .ng-binding | €6.25
        assertThat(driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).getText(), is("€6.25"));
        // 7 | close |  |
        //driver.close();
    }
    @Test
    public void x1RobaWine() {
        // Test name: x1RobaWine
        // Step # | name | target | value
        // 1 | open | http://localhost:3000/#!/#%2F |
        driver.get("http://localhost:3000/#!/#%2F");
        // 2 | setWindowSize | 1035x948 |
        driver.manage().window().setSize(new Dimension(1035, 948));
        // 3 | click | css=.ng-scope:nth-child(3) .input-group-append > .btn |
        driver.findElement(By.cssSelector(".ng-scope:nth-child(3) .input-group-append > .btn")).click();
        // 4 | assertText | css=tr:nth-child(4) > .ng-binding | €3.00
        assertThat(driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).getText(), is("€3.00"));
        // 5 | close |  |
        //driver.close();
    }
    @Test
    public void x2RobaBeer() {
        // Test name: x2RobaBeer
        // Step # | name | target | value
        // 1 | open | http://localhost:3000/#!/#%2F |
        driver.get("http://localhost:3000/#!/#%2F");
        // 2 | setWindowSize | 1035x948 |
        driver.manage().window().setSize(new Dimension(1035, 948));
        // 3 | click | css=.ng-scope:nth-child(2) > td .input-group-append > .btn |
        driver.findElement(By.cssSelector(".ng-scope:nth-child(2) > td .input-group-append > .btn")).click();
        // 4 | click | css=.ng-scope:nth-child(2) > td .input-group-append > .btn |
        driver.findElement(By.cssSelector(".ng-scope:nth-child(2) > td .input-group-append > .btn")).click();
        // 5 | assertText | css=tr:nth-child(4) > .ng-binding | €4.00
        assertThat(driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).getText(), is("€4.00"));
        // 6 | close |  |
        //driver.close();
    }
    @Test
    public void x2RobaCola() {
        // Test name: x2RobaCola
        // Step # | name | target | value
        // 1 | open | http://localhost:3000/#!/#%2F |
        driver.get("http://localhost:3000/#!/#%2F");
        // 2 | setWindowSize | 1097x948 |
        driver.manage().window().setSize(new Dimension(1097, 948));
        // 3 | click | css=.ng-scope:nth-child(1) > td .input-group-append > .btn |
        driver.findElement(By.cssSelector(".ng-scope:nth-child(1) > td .input-group-append > .btn")).click();
        // 4 | click | css=.ng-scope:nth-child(1) > td .input-group-append > .btn |
        driver.findElement(By.cssSelector(".ng-scope:nth-child(1) > td .input-group-append > .btn")).click();
        // 5 | assertText | css=tr:nth-child(4) > .ng-binding | €2.50
        assertThat(driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).getText(), is("€2.50"));
        // 6 | close |  |
        //driver.close();
    }
    @Test
    public void x2RobaWine() {
        // Test name: x2RobaWine
        // Step # | name | target | value
        // 1 | open | http://localhost:3000/#!/#%2F |
        driver.get("http://localhost:3000/#!/#%2F");
        // 2 | setWindowSize | 1159x948 |
        driver.manage().window().setSize(new Dimension(1159, 948));
        // 3 | click | css=.ng-scope:nth-child(3) .input-group-append > .btn |
        driver.findElement(By.cssSelector(".ng-scope:nth-child(3) .input-group-append > .btn")).click();
        // 4 | click | css=.ng-scope:nth-child(3) .input-group-append > .btn |
        driver.findElement(By.cssSelector(".ng-scope:nth-child(3) .input-group-append > .btn")).click();
        // 5 | assertText | css=tr:nth-child(4) > .ng-binding | €6.00
        assertThat(driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).getText(), is("€6.00"));
        // 6 | close |  |
        //driver.close();
    }
}
