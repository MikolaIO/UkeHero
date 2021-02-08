import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

import java.io.IOException;


public class rythmController  {

    @FXML
    public TextField timerField1;
    @FXML
    public TextField timerField2;
    @FXML
    public TextField timerField3;
    @FXML
    private TextField timerField;
    @FXML
    private Label counterLabel;
    @FXML
    private Label counterLabel1;
    @FXML
    private Label counterLabel2;
    @FXML
    private Label counterLabel3;
    @FXML
    private Button btnStart;
    @FXML
    private Button btnBack;

    private String path;        //audio paths for individual timelines
    private String path1;
    private String path2;
    private String path3;


    private Timer timer = new Timer()       //creates an timer object
    {
        @Override
        public void doStep(ActionEvent actionEvent) {       //override of step in KeyFrame
            super.doStep(actionEvent);
            iterate();  //iteration of counter
            counterLabel.setText(String.valueOf(getCounter()));
            AudioClip clip = new AudioClip(path);
            clip.play();
        }
    };

    private Timer timer1 = new Timer()
    {
        @Override
        public void doStep(ActionEvent actionEvent) {
            super.doStep(actionEvent);
            iterate();
            counterLabel1.setText(String.valueOf(getCounter()));
            AudioClip clip = new AudioClip(path1);
            clip.play();
        }
    };

    private Timer timer2 = new Timer()
    {
        @Override
        public void doStep(ActionEvent actionEvent) {
            super.doStep(actionEvent);
            iterate();
            counterLabel2.setText(String.valueOf(getCounter()));
            AudioClip clip = new AudioClip(path2);
            clip.play();
        }
    };

    private Timer timer3 = new Timer()
    {
        @Override
        public void doStep(ActionEvent actionEvent) {
            super.doStep(actionEvent);
            iterate();
            counterLabel3.setText(String.valueOf(getCounter()));
            AudioClip clip = new AudioClip(path3);
            clip.play();
        }
    };




    public void HandleBtnBack(ActionEvent actionEvent) throws IOException {
        timer.stop();       //resets the timer during exit to menu
        timer.reset();
        timer1.stop();
        timer1.reset();
        timer2.stop();
        timer2.reset();
        timer3.stop();
        timer3.reset();
        Parent menuParent = FXMLLoader.load(getClass().getResource("menu.fxml"));
        Scene menuScene = new Scene(menuParent);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(menuScene);
        window.show();
    }

    public void HandleBtnStart(ActionEvent actionEvent) {
        if(!timerField.getText().isEmpty()) {     //in case when timer fields aren't empty
            timer.getTxt(timerField.getText());     //get text from a Text Field
            timer.changeDuration(timer.getTime());
            timer.start();
        }

        if(!timerField1.getText().isEmpty()) {
            timer1.getTxt(timerField1.getText());
            timer1.changeDuration(timer1.getTime());
            timer1.start();
        }

        if(!timerField2.getText().isEmpty()) {
            timer2.getTxt(timerField2.getText());
            timer2.changeDuration(timer2.getTime());
            timer2.start();
        }

        if(!timerField3.getText().isEmpty()) {
            timer3.getTxt(timerField3.getText());
            timer3.changeDuration(timer3.getTime());
            timer3.start();
        }
    }

    public void HandleBtnC(ActionEvent actionEvent) {
        path = "file:src/sound/C.mp3";
    }

    public void HandleBtnG(ActionEvent actionEvent) {
        path = "file:src/sound/G.mp3";
    }

    public void HandleBtnAm(ActionEvent actionEvent) {
        path = "file:src/sound/Am.mp3";
    }

    public void HandleBtnF(ActionEvent actionEvent) {
        path = "file:src/sound/F.mp3";
    }

    public void HandleBtnC1(ActionEvent actionEvent) {
        path1 = "file:src/sound/C.mp3";
    }

    public void HandleBtnG1(ActionEvent actionEvent) {
        path1 = "file:src/sound/G.mp3";
    }

    public void HandleBtnAm1(ActionEvent actionEvent) {
        path1 = "file:src/sound/Am.mp3";
    }

    public void HandleBtnF1(ActionEvent actionEvent) {
        path1 = "file:src/sound/F.mp3";
    }

    public void HandleBtnC2(ActionEvent actionEvent) {
        path2 = "file:src/sound/C.mp3";
    }

    public void HandleBtnG2(ActionEvent actionEvent) {
        path2 = "file:src/sound/G.mp3";
    }

    public void HandleBtnAm2(ActionEvent actionEvent) {
        path2 = "file:src/sound/Am.mp3";
    }

    public void HandleBtnF2(ActionEvent actionEvent) {
        path2 = "file:src/sound/F.mp3";
    }

    public void HandleBtnC3(ActionEvent actionEvent) {
        path3 = "file:src/sound/C.mp3";
    }

    public void HandleBtnG3(ActionEvent actionEvent) {
        path3 = "file:src/sound/G.mp3";
    }

    public void HandleBtnAm3(ActionEvent actionEvent) {
        path3 = "file:src/sound/Am.mp3";
    }

    public void HandleBtnF3(ActionEvent actionEvent) {
        path3 = "file:src/sound/F.mp3";
    }

    public void HandleBtnStop(ActionEvent actionEvent) {
        timer.stop();       //resets the timer during exit to menu
        timer.reset();
        timer1.stop();
        timer1.reset();
        timer2.stop();
        timer2.reset();
        timer3.stop();
        timer3.reset();
        counterLabel.setText("0");
        counterLabel1.setText("0");
        counterLabel2.setText("0");
        counterLabel3.setText("0");
    }
}
