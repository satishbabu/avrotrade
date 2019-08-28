import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        createAvroFile();
        readAvroFile();
    }

    private static void readAvroFile() throws IOException {
        DatumReader<Trade> userDatumReader = new SpecificDatumReader<>(Trade.class);
        DataFileReader<Trade> dataFileReader = new DataFileReader<>( new File("trades.avro"), userDatumReader);
        while (dataFileReader.hasNext()) {
            Trade t  = dataFileReader.next();
            System.out.println(t);
        }
    }

    private static void createAvroFile() throws IOException {
        DatumWriter<Trade> dw = new SpecificDatumWriter<>(Trade.class);
        DataFileWriter<Trade> fw = new DataFileWriter<>(dw);
        fw.create(Trade.getClassSchema(), new File("trades.avro"));

        for (int i = 0; i < 10; i++) {
            Trade t = new Trade("id"+i, "book"+i);
            fw.append(t);
        }
        fw.close();
    }
}
