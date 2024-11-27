package pckg_strategy_file_writing;


public class TestContentWriter {
    public static void main(String[] args) {
        ControllerContent controllerContent = new ControllerContent(new FileWriterStrategy(), new BRStrategy());
        String content = "Hello world!\nnew line";
        String additional = "This is somehting new\nagain new line";
        String filePath = "/home/szb/Documents/noop_gh/DATA/testContentWriter.txt";
        controllerContent.writeContentToFile(content, filePath);
        controllerContent.setWriteStrategy(new BWStrategy());
        controllerContent.writeContentToFile(additional, filePath);

        controllerContent.readContentFromFile(filePath);

    }
}
