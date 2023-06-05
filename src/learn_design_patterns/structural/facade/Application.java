package learn_design_patterns.structural.facade;

public class Application {

    public static void main(String[] args) {
        MultimediaPlayer multimediaPlayer = new MultimediaPlayer();

        multimediaPlayer.play("song.mp3", MediaType.AUDIO);
        multimediaPlayer.play("song.mp4", MediaType.VIDEO);
    }
}
