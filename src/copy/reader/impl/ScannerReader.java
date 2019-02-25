package copy.reader.impl;

import copy.reader.Reader;

public class ScannerReader implements Reader {

	@Override
	public String read() {
		System.out.println("Reading from scanner");
		return "scanner msg";
	}

}
