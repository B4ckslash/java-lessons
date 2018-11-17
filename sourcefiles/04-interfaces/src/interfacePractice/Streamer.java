public class Streamer {
    public static void main(String[] args) {
        Streamable audio = new Audio(15, 2048);
        Streamable video = new Video(120, 65536);

        audio.stream();
        video.stream();

        System.out.println(audio.getFilesize());
        System.out.println(video.getFilesize());

        System.out.println(audio.getRequiredBufferLength());
        System.out.println(video.getRequiredBufferLength());

        System.out.println(audio.getType());
        System.out.println(video.getType());
    }
}
