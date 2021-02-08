
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

import java.io.IOException;

public class freestyleController {
    @FXML
    private Button btnG;
    @FXML
    private Button btnC;
    @FXML
    private Button btnE;
    @FXML
    private Button btnA;
    @FXML
    private Button btnF;
    @FXML
    private Button btnGm;
    @FXML
    private Button btnCm;
    @FXML
    private Button btnEm;
    @FXML
    private Button btnAm;
    @FXML
    private Button btnFm;
    @FXML
    private ImageView imgG;
    @FXML
    private ImageView imgC;
    @FXML
    private ImageView imgE;
    @FXML
    private ImageView imgA;
    @FXML
    private ImageView imgF;
    @FXML
    private ImageView imgGm;
    @FXML
    private ImageView imgCm;
    @FXML
    private ImageView imgEm;
    @FXML
    private ImageView imgAm;
    @FXML
    private ImageView imgFm;

    private final String pathG = "file:src/sound/G.mp3";
    private final String pathC = "file:src/sound/C.mp3";
    private final String pathE = "file:src/sound/E.mp3";
    private final String pathA = "file:src/sound/A.mp3";
    private final String pathF = "file:src/sound/F.mp3";
    private final String pathGm = "file:src/sound/Gm.mp3";
    private final String pathCm = "file:src/sound/Cm.mp3";
    private final String pathEm = "file:src/sound/Em.mp3";
    private final String pathAm = "file:src/sound/Am.mp3";
    private final String pathFm = "file:src/sound/Fm.mp3";

    public void HandleBtnG(ActionEvent actionEvent) {
        AudioClip clip = new AudioClip(pathG);
        clip.play();
    }

    public void HandleBtnC(ActionEvent actionEvent) {
        AudioClip clip = new AudioClip(pathC);
        clip.play();
    }

    public void HandleBtnE(ActionEvent actionEvent) {
        AudioClip clip = new AudioClip(pathE);
        clip.play();
    }

    public void HandleBtnA(ActionEvent actionEvent) {
        AudioClip clip = new AudioClip(pathA);
        clip.play();
    }

    public void HandleBtnF(ActionEvent actionEvent) {
        AudioClip clip = new AudioClip(pathF);
        clip.play();
    }

    public void HandleBtnGm(ActionEvent actionEvent) {
        AudioClip clip = new AudioClip(pathGm);
        clip.play();
    }

    public void HandleBtnCm(ActionEvent actionEvent) {
        AudioClip clip = new AudioClip(pathCm);
        clip.play();
    }

    public void HandleBtnEm(ActionEvent actionEvent) {
        AudioClip clip = new AudioClip(pathEm);
        clip.play();
    }

    public void HandleBtnAm(ActionEvent actionEvent) {
        AudioClip clip = new AudioClip(pathAm);
        clip.play();
    }

    public void HandleBtnFm(ActionEvent actionEvent) {
        AudioClip clip = new AudioClip(pathFm);
        clip.play();
    }


    public void HandleBtnBack(ActionEvent actionEvent) throws IOException {
        Parent menuParent = FXMLLoader.load(getClass().getResource("menu.fxml"));
        Scene menuScene = new Scene(menuParent);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(menuScene);
        window.show();
    }
}
