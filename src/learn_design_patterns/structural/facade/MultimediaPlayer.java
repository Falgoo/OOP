package learn_design_patterns.structural.facade;

public class MultimediaPlayer {

    private final AudioPlayer audioPlayer;
    private final VideoPlayer videoPlayer;

    public MultimediaPlayer() {
        audioPlayer = new AudioPlayer();
        videoPlayer = new VideoPlayer();
    }

    public void play(String fileName, MediaType mediaType) {
        switch (mediaType) {
            case AUDIO -> audioPlayer.playAudio(fileName);
            case VIDEO -> videoPlayer.playVideo(fileName);
            default -> System.out.println("Unsupported media type");
        }
    }
}
