package components;

import static com.codeborne.selenide.Selenide.$;

public class SendingLetterPageObject {

    SendingResultsModal sendingResultsModal = new SendingResultsModal();

    public SendingLetterPageObject clickOnWriteLetterButton() {

        $(".compose-button__txt").click();

        return this;
    }

    public SendingLetterPageObject verifySendModalVisible() {

        sendingResultsModal.verifySendModalVisible();

        return this;
    }

    public SendingLetterPageObject inputRecepient(String value) {

        $("input.container--H9L5q.size_s--3_M-_").setValue(value);
        return this;
    }

    public SendingLetterPageObject inputSubject(String value) {

        $("[name=Subject]").setValue(value);
        return this;
    }

    public SendingLetterPageObject inputBody(String value) {
        $("div.container--1HmQy.compact--2gF4W").click();
        $("strong").sendKeys(value);
        return this;
    }

    public SendingLetterPageObject clickOnSendButton() {

        $(".vkuiButton__content").click();
        return this;
    }

    public SendingLetterPageObject verifySuccessfulSend() {

        sendingResultsModal.successfulSendLetter();
        return this;

    }
}

