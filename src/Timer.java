import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.util.Duration;

public class Timer {

    private Timeline timeline; //setting timeline

    private int counter;     //setting counter for timeline

    private int time;        //setting duration of timeline


    public Timer() {
        counter = 0;    //setting default values
        time = 2000;

        this.timeline = new Timeline(new KeyFrame(Duration.millis(time), this::doStep));        //setting default keyframe for timeline
    }

    public void doStep(ActionEvent actionEvent) {

    }

    public void start(){
        this.timeline.play();
    }

    public void stop(){
        this.timeline.stop();
    }

    public void changeDuration(int t)
    {
        this.timeline = new Timeline(new KeyFrame(Duration.millis(time), this::doStep));
        timeline.setCycleCount(Timeline.INDEFINITE);
    }

    public void reset(){
        counter = 0;
    }

    public int getCounter() {
        return counter;
    }

    public int getTime(){
        return time;
    }

    public void getTxt(String txt){
        time = Integer.parseInt(txt);
    }

    public void iterate()
    {
        counter++;
    }

}
