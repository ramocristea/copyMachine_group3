package copy.main;

import copy.machine.CopyMachine;
import copy.reader.Reader;
import copy.reader.impl.KeyboardReader;
import copy.reader.impl.ScannerReader;
import copy.writer.impl.DatabaseWriter;
import copy.writer.impl.PrinterWriter;
import copy.writer.impl.TextFileWriter;

public class CopyMachineExample {

	public static void main(String[] args) {
		CopyMachine copyMachine = new CopyMachine();
		
		KeyboardReader keyboardReader = new KeyboardReader();
		copyMachine.setReader(keyboardReader);
		
		PrinterWriter printerWriter = new PrinterWriter();
		copyMachine.setWriter(printerWriter);
		
		String msg = copyMachine.read();
		copyMachine.write(msg);
		
		DatabaseWriter databaseWriter = new DatabaseWriter();
		copyMachine.setWriter(databaseWriter);
		
		copyMachine.write(msg);
		
		ScannerReader scannerReader = new ScannerReader();
		copyMachine.setReader(scannerReader);
		TextFileWriter textFileWriter = new TextFileWriter();
		copyMachine.setWriter(textFileWriter);
		
		msg = copyMachine.read();
		copyMachine.write(msg);
		
		Reader reader = new KeyboardReader();
		
		KeyboardReader keyboardReader2 = new KeyboardReader();
		keyboardReader2.customRead();
		keyboardReader2.read();
	}

}
