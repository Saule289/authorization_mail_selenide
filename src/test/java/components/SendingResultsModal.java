package components;

import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selenide.$;



public class SendingResultsModal {
    public void verifySendModalVisible() {

        $(".compose-app__compose").shouldBe(Condition.visible);

    }

    public void successfulSendLetter() {

        $("a.layer__link").shouldHave(Condition.text("Письмо отправлено"));
        $("span.layer-sent-page__contact-item").shouldHave(Condition.text("<testmail9090@inbox.ru>"));

    }
}