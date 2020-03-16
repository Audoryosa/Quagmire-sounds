package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class Controller {

    private static MediaPlayer player;

    @FXML
    public void handleButtonClick(ActionEvent actionEvent) {
        String title = "src/sample/raw/" + ((Button) actionEvent.getSource()).getText().toLowerCase() + ".mp3";
        title = title.replace(" ", "_");
//        System.out.println(title);
        playAudio(title);

    }

    private void playAudio(String title){
        String file = new File(title).toURI().toString();
        System.out.println(file);
        Media media = new Media(file);
        player = new MediaPlayer(media);
        player.setAutoPlay(true);
    }

}
