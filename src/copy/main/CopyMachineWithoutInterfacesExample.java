package copy.main;

import copy.machine.CopyMachine;
import copy.machine.CopyMachineWithoutInterfaces;
import copy.reader.Reader;
import copy.reader.impl.KeyboardReader;
import copy.reader.impl.ScannerReader;
import copy.writer.impl.DatabaseWriter;
import copy.writer.impl.PrinterWriter;
import copy.writer.impl.TextFileWriter;

public class CopyMachineWithoutInterfacesExample {
	public static void main(String[] args) {

		KeyboardReader keyboardReader = new KeyboardReader();
		PrinterWriter printerWriter = new PrinterWriter();
		DatabaseWriter databaseWriter = new DatabaseWriter();
		ScannerReader scannerReader = new ScannerReader();
		TextFileWriter textFileWriter = new TextFileWriter();
		
		CopyMachineWithoutInterfaces copyMachine = new CopyMachineWithoutInterfaces(keyboardReader, scannerReader, databaseWriter, textFileWriter, printerWriter);
		
		String msg = copyMachine.readFromKeyboard();
		copyMachine.writeToPrinter(msg);

		copyMachine.writeToDatabase(msg);

		msg = copyMachine.readFromScanner();
		copyMachine.writeToTextFile(msg);

		//keyboardReader1 is of type Reader, so only read method is available
		Reader keyboardReader1 = new KeyboardReader();
		keyboardReader1.read();

		//keyboardReader2 is of type KeyboardReader, so both read and customRead methods are available
		KeyboardReader keyboardReader2 = new KeyboardReader();
		keyboardReader2.customRead();
		keyboardReader2.read();
	}

}
