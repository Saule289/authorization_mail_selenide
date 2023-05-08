package components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$x;

public class AuthorizationPageObject {

    AuthorizationResultsModal authorizationResults = new AuthorizationResultsModal();

    public AuthorizationPageObject openPage() {

        open("https//mail.ru");

        return this;
    }

    public AuthorizationPageObject clickOnSingInButton() {

        $("[data-testid=enter-mail-primary]").click();
        switchTo().frame($x("//div[contains(@class, 'ag-popup__frame_show')]//iframe"));

        return this;
    }

    public AuthorizationPageObject verifyNameOfModalWindow(String value) {
        authorizationResults.verifyModalVisible(value);
        return this;
    }

    public AuthorizationPageObject inputEmail(String value) {
        $("[name=username]").setValue(value);
        return this;
    }

    public AuthorizationPageObject chooseDomainEmail() {
        $("[data-test-id=domain-select-value]").click();
        $(byText("@inbox.ru")).click();
        return this;
    }

    public AuthorizationPageObject inputPassword(String value) {
        $(byText("Ввести пароль")).click();
        $("[name=password]").setValue(value).pressEnter();
        return this;
    }
    public AuthorizationPageObject verifySuccessfulLogin() {
        authorizationResults.verifySuccessfulLoginIn();
        return this;
    }

}
