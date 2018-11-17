public class Video implements Streamable{
    private int length;
    private int filesize;

    public Video(int length, int filesize) {
        this.length = length;
        this.filesize = filesize;
    }

    @Override
    public void stream() {
        System.out.println("I am a Video Stream!");
    }

    @Override
    public int getFilesize() {
        return this.filesize;
    }

    @Override
    public int getRequiredBufferLength() {
        return (this.filesize/this.length)*5;
    }

    @Override
    public String getType() {
        return this.getClass().getCanonicalName();
    }
}
