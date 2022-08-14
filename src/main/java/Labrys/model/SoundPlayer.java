package Labrys.model;

import javafx.scene.media.AudioClip;

import java.util.Objects;

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
            audioClip.play();
            isPlaying = true;
        } else {
            audioClip.stop();
            isPlaying = false;
        }
    }

    public void playSoundBite(String localPath, int duration) {
        AudioClip audioClip = new AudioClip(Objects.requireNonNull(getClass().getResource(localPath)).toExternalForm());
        if (!isPlaying) {
            audioClip.play();
            try {
                Thread.sleep(duration * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            audioClip.stop();
            isPlaying = true;
        } else {
            audioClip.stop();
            isPlaying = false;
        }
    }


}