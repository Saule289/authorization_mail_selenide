package components;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AuthorizationResultsModal {
    public void verifyModalVisible(String value) {
        $x("//h3[text()='Войти в аккаунт']").shouldBe(visible);
        $(".login-header").shouldHave(Condition.text(value));
    }
    public void verifySuccessfulLoginIn() {
        $(".nav-folders").shouldHave(text("Входящие"));
        $("span.compose-button__txt").shouldHave(text("Написать письмо"));
    }

}
