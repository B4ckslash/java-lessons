public interface Streamable {
    void stream();
    int getFilesize();
    int getRequiredBufferLength();
    String getType();
}
