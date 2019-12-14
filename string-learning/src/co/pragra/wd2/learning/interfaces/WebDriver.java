public interface WebDriver {
    int counter =0;
    void get(String url);
    String findElement(String id);
    void close();
}
