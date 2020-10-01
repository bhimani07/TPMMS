import java.io.File;

public interface Configuration {
    String FILE_PATH = "." + File.separator + "Dataset";
    String TEMP_FILE_NAME = "temp.txt";
    String INPUT_FILE_NAME_1 = "input1.txt";
    String INPUT_FILE_NAME_2 = "input2.txt";
    String MERGED_FILE = "merged.txt";
    String DUPLICATE_OUTPUT_FILE_NAME = "outputWithDuplicate.txt";
    String OUTPUT_FILE_NAME = "output.txt";
    String BLOCK_FILE_PATH = "." + File.separator + "Dataset" + File.separator + "Block";
    String BLOCK_NAME = "Block";
    Integer MAX_TUPLES = 5000;
    Integer EMP_ID_LENGTH = 8;
};