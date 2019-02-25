package copy.machine;

import copy.reader.impl.KeyboardReader;
import copy.reader.impl.ScannerReader;
import copy.writer.impl.DatabaseWriter;
import copy.writer.impl.PrinterWriter;
import copy.writer.impl.TextFileWriter;

public class CopyMachineWithoutInterfaces {
	private KeyboardReader keyboardReader;
	private ScannerReader scannerReader;
	private DatabaseWriter databaseWriter;
	private TextFileWriter fileWriter;
	private PrinterWriter printerWriter;

	public CopyMachineWithoutInterfaces(KeyboardReader keyboardReader, ScannerReader scannerReader,
			DatabaseWriter databaseWriter, TextFileWriter fileWriter, PrinterWriter printerWriter) {
		this.keyboardReader = keyboardReader;
		this.scannerReader = scannerReader;
		this.databaseWriter = databaseWriter;
		this.fileWriter = fileWriter;
		this.printerWriter = printerWriter;
	}
	
	public String readFromKeyboard() {
		return keyboardReader.read();
	}
	
	public String readFromScanner() {
		return scannerReader.read();
	}
	
	public void writeToDatabase(String msg) {
		databaseWriter.write(msg);
	}
	
	public void writeToTextFile(String msg) {
		fileWriter.write(msg);
	}
	
	public void writeToPrinter(String msg) {
		printerWriter.write(msg);
	}

}
