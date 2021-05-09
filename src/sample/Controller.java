package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;



public class Controller {
    @FXML
    TextArea userMessage;
    @FXML
    TextArea chatArea;

    public void btnClicked(ActionEvent actionEvent) {
        copyUserMessage();
    }

    public void pressedEnter(KeyEvent keyEvent) {
        if (keyEvent.getCode().equals(KeyCode.ENTER)){
            copyUserMessage();
            //userMessage.clear();
        }
    }

    public void copyUserMessage() {
        String message;
        message = userMessage.getText();
        chatArea.appendText(message);
        chatArea.appendText("\n");
        userMessage.setText("");
    }
}
