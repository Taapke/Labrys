package Labrys.controller;

import Labrys.model.SoundPlayer;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import java.util.Timer;

/**
 * @author Taapke Bergsma <t.bergsma@st.hanze.nl>
 */

public class SoundboardController {


    SoundPlayer soundPlayer = new SoundPlayer();
    Timer timer = new Timer();
    @FXML
    public void alarm() {
        soundPlayer.playSound("/sounds/long/alarm.wav");
    }

    @FXML
    public void cryo() {
        soundPlayer.playSoundBite("/sounds/short/cryo.wav", 4);
    }

    @FXML
    public void spacedoor() {
        soundPlayer.playSoundBite("/sounds/short/spacedoor.wav", 3);
    }

}
