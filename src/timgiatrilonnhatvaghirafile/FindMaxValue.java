package timgiatrilonnhatvaghirafile;

import java.util.List;

public class FindMaxValue {

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("numbers.txt");

        int maxValue = ReadAndWriteFile.findMax(numbers);
        readAndWriteFile.writeFile("result.txt", maxValue);
    }
}
