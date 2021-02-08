import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class menuController {
    @FXML
    private Button BtnRythm;
    @FXML
    private Button BtnFree;

    public void HandleBtnFree(ActionEvent actionEvent) throws IOException {
        Parent freestyleParent = FXMLLoader.load(getClass().getResource("freestyle.fxml"));
        Scene freestyleScene = new Scene(freestyleParent);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(freestyleScene);
        window.show();

    }

    public void HandleBtnRythm(ActionEvent actionEvent) throws IOException {
        Parent rythmParent = FXMLLoader.load(getClass().getResource("rythm.fxml"));
        Scene rythmScene = new Scene(rythmParent);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(rythmScene);
        window.show();
    }

    public void HandleBtnMemo(ActionEvent actionEvent) throws IOException {
        Parent memoParent = FXMLLoader.load(getClass().getResource("memo.fxml"));
        Scene memoScene = new Scene(memoParent);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(memoScene);
        window.show();
    }
}
