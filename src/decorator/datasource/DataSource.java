package decorator.datasource;

/**
 * Interface pour une data source.
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}