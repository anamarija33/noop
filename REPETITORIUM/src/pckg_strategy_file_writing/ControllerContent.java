package pckg_strategy_file_writing;

public class ControllerContent {
    // postižemo loose coupling, izbjegavamo tight coupling
    private WriteStrategy writeStrategy;
    private ReadStrategy readStrategy;



    public ControllerContent(WriteStrategy writeStrategy, ReadStrategy readStrategy) {
        this.writeStrategy = new FileWriterStrategy();
        this.readStrategy = new BRStrategy();
        System.out.println("Default write strategy : "+writeStrategy.getClass().getSimpleName());
        System.out.println("Default read strategy : "+readStrategy.getClass().getSimpleName());
    }

    public void setWriteStrategy(WriteStrategy writeStrategy) {
        this.writeStrategy = writeStrategy;
        System.out.println("Write strategy set to: "+writeStrategy.getClass().getSimpleName());
    }

    public void writeContentToFile(String content, String filePath) {
        if(writeStrategy != null) {
            writeStrategy.writeToFile(content, filePath);
            System.out.println("Content is written to file: "+filePath);
            System.out.println("Write strategy used: "+writeStrategy.getClass().getSimpleName());
        }
    }
    public void setReadStrategy(ReadStrategy readStrategy) {
        this.readStrategy = readStrategy;

    }
    public void readContentFromFile(String filePath) {
        if(readStrategy != null) {
            readStrategy.readFromFile(filePath);

        }
    }

}
