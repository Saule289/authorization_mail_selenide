import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class SendingLetter extends TestBase {

    @Test
    void successfulSendingLetter() {
        String email = "testmail9090";
        String password = "123qwe+++";
        String recipient = "testmail9090@inbox.ru";
        String subject = "Test";
        String body = "TEST TEST TEST TEST";


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

        step("Клик по кнопке Написать письмо", () -> {

            sendingLetter.clickOnWriteLetterButton();

        });

        step("Проверка появление модального окна для составления письма", () -> {
            sendingLetter.verifySendModalVisible();

        });

        step("Ввод электронной почты адресата", () -> {
            sendingLetter.inputRecepient(recipient);
        });

        step("Ввод темы письма", () -> {
            sendingLetter.inputSubject(subject);

        });

        step("Ввод тело письма", () -> {
            sendingLetter.inputBody(body);
        });
        step("Клик на кнопку Отправить", () -> {
            sendingLetter.clickOnSendButton();
        });
        step("Проверка успешной отправки письма", () -> {
            sendingLetter.verifySuccessfulSend();

        });


    }
}


