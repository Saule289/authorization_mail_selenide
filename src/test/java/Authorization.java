import org.junit.jupiter.api.Test;
import static io.qameta.allure.Allure.step;



public class Authorization extends TestBase {

    @Test
    void authorizationToMailAccount() {

        String email = "testmail9090";
        String password = "123qwe+++";

        step("Открываем главную страницу", () -> {
            authorizationPageObject.openPage();
        });

        step("Клик на кнопку Войти", () -> {
            authorizationPageObject.clickOnSingInButton();
        });

        step("Проверка название появившегося модального окна", () -> {
            authorizationPageObject.verifyNameOfModalWindow("Войти в аккаунт");
        });

        step("Ввод имя почтового ящика", () -> {
            authorizationPageObject.inputEmail(email);
        });

        step("Выбор доменного имя email", () -> {
            authorizationPageObject.chooseDomainEmail();
        });

        step("Ввод пароля", () -> {
            authorizationPageObject.inputPassword(password);
        });

        step("Проверка элементов при успешной авторизации", () -> {
            authorizationPageObject.verifySuccessfulLogin();
        });
    }

}
