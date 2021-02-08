import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.media.AudioClip;
import javafx.util.Duration;

import java.io.IOException;

public class memoController {


    @FXML
    public Label stateLabel;
    @FXML
    public CheckBox checkbox;
    @FXML
    public CheckBox checkbox1;
    @FXML
    private Button btnStart;
    @FXML
    private Button btnBack;
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


    private final String pathG = "file:src/sound/G.mp3";      //paths to sounds
    private final String pathC = "file:src/sound/C.mp3";
    private final String pathE = "file:src/sound/E.mp3";
    private final String pathA = "file:src/sound/A.mp3";
    private final String pathF = "file:src/sound/F.mp3";
    private final String pathGm = "file:src/sound/Gm.mp3";
    private final String pathCm = "file:src/sound/Cm.mp3";
    private final String pathEm = "file:src/sound/Em.mp3";
    private final String pathAm = "file:src/sound/Am.mp3";
    private final String pathFm = "file:src/sound/Fm.mp3";
    private boolean GStatus;
    private boolean CStatus;
    private boolean EStatus;
    private boolean AStatus;
    private boolean FStatus;
    private boolean GmStatus;
    private boolean CmStatus;
    private boolean EmStatus;
    private boolean AmStatus;
    private boolean FmStatus;


    public void HandleBtnBack(ActionEvent actionEvent) throws IOException {
        Parent menuParent = FXMLLoader.load(getClass().getResource("menu.fxml"));
        Scene menuScene = new Scene(menuParent);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(menuScene);
        window.show();
    }

    public void HandleBtnStart(ActionEvent actionEvent) throws InterruptedException {

        int counter = 0;    //counter of actions
        int rand = 0;   //random value for memo
        int compare = 1;
        int tries = 3;
        if (checkbox1.isSelected()) //check, if hardcore is activated
            tries = 9;
        Timeline timeline = new Timeline();
        KeyFrame frame;
        KeyFrame frame2;
        btnStart.setText("Restart");
        btnG.setDisable(false);
        btnC.setDisable(false);
        btnE.setDisable(false);
        btnA.setDisable(false);
        btnF.setDisable(false);
        btnGm.setDisable(false);
        btnCm.setDisable(false);
        btnEm.setDisable(false);
        btnAm.setDisable(false);
        btnFm.setDisable(false);
        GStatus = false;
        CStatus = false;
        EStatus = false;
        AStatus = false;
        FStatus = false;
        GmStatus = false;
        CmStatus = false;
        EmStatus = false;
        AmStatus = false;
        FmStatus = false;

        while(counter < tries) {
            rand = ((int) (Math.random() * 10) + 1);    //first pass

            while (rand == compare)
                rand = ((int) (Math.random() * 10) + 1);    //second pass, until next value won't be duplicate

            switch (rand) {

                    case 0:
                        frame = new KeyFrame(Duration.seconds(counter*2), e->{  //keyframe for highlighting the button
                            if (checkbox.isSelected())  //check, if easy mode is activated
                            btnG.setStyle("-fx-background-color: red;");
                            AudioClip clip = new AudioClip(pathG);
                            clip.play();
                        });
                        frame2 = new KeyFrame(Duration.seconds(counter*2+2), e-> {  //keyframe for going back to first state of button
                            btnG.setStyle("-fx-background-color: lightblue;");
                            GStatus = !GStatus;
                        });
                        timeline.getKeyFrames().addAll(frame, frame2);
                        break;
                    case 1:
                        frame = new KeyFrame(Duration.seconds(counter*2), e->{
                            if (checkbox.isSelected())
                            btnC.setStyle("-fx-background-color: red;");
                            AudioClip clip = new AudioClip(pathC);
                            clip.play();
                        });
                        frame2 = new KeyFrame(Duration.seconds(counter*2+2), e-> {
                            btnC.setStyle("-fx-background-color: lightblue;");
                            CStatus = !CStatus;
                        });
                        timeline.getKeyFrames().addAll(frame, frame2);
                        break;
                    case 2:
                        frame = new KeyFrame(Duration.seconds(counter*2), e->{
                            if (checkbox.isSelected())
                            btnE.setStyle("-fx-background-color: red;");
                            AudioClip clip = new AudioClip(pathE);
                            clip.play();
                        });
                        frame2 = new KeyFrame(Duration.seconds(counter*2+2), e-> {
                            btnE.setStyle("-fx-background-color: lightblue;");
                            EStatus = !EStatus;
                        });
                        timeline.getKeyFrames().addAll(frame, frame2);
                        break;
                    case 3:
                        frame = new KeyFrame(Duration.seconds(counter*2), e->{
                            if (checkbox.isSelected())
                            btnA.setStyle("-fx-background-color: red;");
                            AudioClip clip = new AudioClip(pathA);
                            clip.play();
                        });
                        frame2 = new KeyFrame(Duration.seconds(counter*2+2), e-> {
                            btnA.setStyle("-fx-background-color: lightblue;");
                            AStatus = !AStatus;
                        });
                        timeline.getKeyFrames().addAll(frame, frame2);
                        break;
                    case 4:
                        frame = new KeyFrame(Duration.seconds(counter*2), e->{
                            if (checkbox.isSelected())
                            btnF.setStyle("-fx-background-color: red;");
                            AudioClip clip = new AudioClip(pathF);
                            clip.play();
                        });
                        frame2 = new KeyFrame(Duration.seconds(counter*2+2), e-> {
                            btnF.setStyle("-fx-background-color: lightblue;");
                            FStatus = !FStatus;
                        });
                        timeline.getKeyFrames().addAll(frame, frame2);
                        break;
                    case 5:
                        frame = new KeyFrame(Duration.seconds(counter*2), e->{
                            if (checkbox.isSelected())
                            btnGm.setStyle("-fx-background-color: red;");
                            AudioClip clip = new AudioClip(pathGm);
                            clip.play();
                        });
                        frame2 = new KeyFrame(Duration.seconds(counter*2+2), e-> {
                            btnGm.setStyle("-fx-background-color: turquoise;");
                            GmStatus = !GmStatus;
                        });
                        timeline.getKeyFrames().addAll(frame, frame2);
                        break;
                    case 6:
                        frame = new KeyFrame(Duration.seconds(counter*2), e->{
                            if (checkbox.isSelected())
                            btnCm.setStyle("-fx-background-color: red;");
                            AudioClip clip = new AudioClip(pathCm);
                            clip.play();
                        });
                        frame2 = new KeyFrame(Duration.seconds(counter*2+2), e-> {
                            btnCm.setStyle("-fx-background-color: turquoise;");
                            CmStatus = !CmStatus;
                        });
                        timeline.getKeyFrames().addAll(frame, frame2);
                        break;
                    case 7:
                        frame = new KeyFrame(Duration.seconds(counter*2), e->{
                            if (checkbox.isSelected())
                            btnEm.setStyle("-fx-background-color: red;");
                            AudioClip clip = new AudioClip(pathEm);
                            clip.play();
                        });
                        frame2 = new KeyFrame(Duration.seconds(counter*2+2), e-> {
                            btnEm.setStyle("-fx-background-color: turquoise;");
                            EmStatus = !EmStatus;
                        });
                        timeline.getKeyFrames().addAll(frame, frame2);
                        break;
                    case 8:
                        frame = new KeyFrame(Duration.seconds(counter*2), e->{
                            if (checkbox.isSelected())
                            btnAm.setStyle("-fx-background-color: red;");
                            AudioClip clip = new AudioClip(pathAm);
                            clip.play();
                        });
                        frame2 = new KeyFrame(Duration.seconds(counter*2+2), e-> {
                            btnAm.setStyle("-fx-background-color: turquoise;");
                            AmStatus = !AmStatus;
                        });
                        timeline.getKeyFrames().addAll(frame, frame2);
                        break;
                    case 9:
                        frame = new KeyFrame(Duration.seconds(counter*2), e->{
                            if (checkbox.isSelected())
                            btnFm.setStyle("-fx-background-color: red;");
                            AudioClip clip = new AudioClip(pathFm);
                            clip.play();
                        });
                        frame2 = new KeyFrame(Duration.seconds(counter*2+2), e-> {
                            btnFm.setStyle("-fx-background-color: turquoise;");
                            FmStatus = !FmStatus;
                        });
                        timeline.getKeyFrames().addAll(frame, frame2);
                        break;
                }
                counter++;
                compare = rand; //remember the previous value of random number
            }
            timeline.play();
        }




    public void HandleBtnG(ActionEvent actionEvent) {
        if(GStatus)
            stateLabel.setText("Nice hearing!");
        else
            stateLabel.setText("Try another!");
    }

    public void HandleBtnC(ActionEvent actionEvent) {
        if(CStatus)
            stateLabel.setText("Nice hearing!");
        else
            stateLabel.setText("Try another!");
    }

    public void HandleBtnE(ActionEvent actionEvent) {
        if(EStatus)
            stateLabel.setText("Nice hearing!");
        else
            stateLabel.setText("Try another!");
    }

    public void HandleBtnA(ActionEvent actionEvent) {
        if(AStatus)
            stateLabel.setText("Nice hearing!");
        else
            stateLabel.setText("Try another!");
    }

    public void HandleBtnF(ActionEvent actionEvent) {
        if(FStatus)
            stateLabel.setText("Nice hearing!");
        else
            stateLabel.setText("Try another!");
    }

    public void HandleBtnGm(ActionEvent actionEvent) {
        if(GmStatus)
            stateLabel.setText("Nice hearing!");
        else
            stateLabel.setText("Try another!");
    }

    public void HandleBtnCm(ActionEvent actionEvent) {
        if(CmStatus)
            stateLabel.setText("Nice hearing!");
        else
            stateLabel.setText("Try another!");
    }

    public void HandleBtnEm(ActionEvent actionEvent) {
        if(EmStatus)
            stateLabel.setText("Nice hearing!");
        else
            stateLabel.setText("Try another!");
    }

    public void HandleBtnAm(ActionEvent actionEvent) {
        if(AmStatus)
            stateLabel.setText("Nice hearing!");
        else
            stateLabel.setText("Try another!");
    }

    public void HandleBtnFm(ActionEvent actionEvent) {
        if(FmStatus)
            stateLabel.setText("Nice hearing!");
        else
            stateLabel.setText("Try another!");
    }

}
