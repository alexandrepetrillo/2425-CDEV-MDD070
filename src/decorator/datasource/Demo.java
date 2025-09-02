package decorator.datasource;

public class Demo {
    public static void main(String[] args) {
        // exemple de données à sauvegarder compressées puis encryptées
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        DataSource dataSource = new FileDataSource("OutputDemo.txt");
        Compressor compressor = new Compressor();
        Encryptor encryptor = new Encryptor();

        String compressed = compressor.compress(salaryRecords);
        System.out.println(compressed);
        String compressedAndEncoded = encryptor.encode(compressed);
        System.out.println(compressedAndEncoded);
        dataSource.writeData(compressedAndEncoded);

        String valeurLue = dataSource.readData();
        String decrypted  = encryptor.decode(valeurLue);
        String decryptedAndUncompressed = compressor.decompress(decrypted);
        System.out.println(decryptedAndUncompressed);
    }

}