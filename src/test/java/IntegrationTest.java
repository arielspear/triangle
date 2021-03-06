import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class IntegrationTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Triangle Type Checker Machine");
  }

  @Test
  public void paramsTest(){
    goTo("http://localhost:4567");
    fill("#firstSide").with("2");
    fill("#secondSide").with("4");
    fill("#thirdSide").with("3");
    submit(".btn");
    assertThat(pageSource()).contains("scalene");

  }
}
