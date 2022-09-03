package Labrys.model;

import javafx.scene.media.AudioClip;

import java.util.Objects;

import static javafx.scene.media.AudioClip.INDEFINITE;

/**
 * @author Taapke Bergsma <t.bergsma@st.hanze.nl>
 */

public class SoundPlayer {


    Boolean isPlaying;

    public SoundPlayer() {
        isPlaying = false;
    }


    public void playSound(String localPath) {
        AudioClip audioClip = new AudioClip(Objects.requireNonNull(getClass().getResource(localPath)).toExternalForm());
        if (!isPlaying) {
            audioClip.setCycleCount(INDEFINITE);
            audioClip.play();
            isPlaying = true;
        } else {
            audioClip.stop();
            isPlaying = false;
        }
    }

    public void playSoundBite(String localPath, int duration) {
        AudioClip audioClip = new AudioClip(Objects.requireNonNull(getClass().getResource(localPath)).toExternalForm());

            audioClip.play();
            isPlaying = true;
            try {
                Thread.sleep(duration * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            audioClip.stop();
            isPlaying = false;


    }


}