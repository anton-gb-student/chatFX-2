package client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegController {
    Controller controller;

    @FXML
    public TextField loginField;
    @FXML
    public PasswordField passwordField1;
    @FXML
    public PasswordField passwordField2;
    @FXML
    public TextField nickField;

    public void tryToReg() {
        String login = loginField.getText().trim();
        String password1 = passwordField1.getText().trim();
        String password2 = passwordField2.getText().trim();
        String nickname = nickField.getText().trim();
        if (!password1.equals(password2)) {
            controller.textArea.appendText("Пароли не совпадают" + "/n");
        }
        if (login.equals("") || password1.equals("") || nickname.equals("")) {
            controller.textArea.appendText("Заполните все поля, пожалуйста" + "\n");
        }

        controller.tryRegistration(login, password1, nickname);

        ((Stage) loginField.getScene().getWindow()).close();
    }
}
