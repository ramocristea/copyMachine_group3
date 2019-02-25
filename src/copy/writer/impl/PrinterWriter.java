package copy.writer.impl;

import copy.writer.Writer;

public class PrinterWriter implements Writer {

	@Override
	public void write(String msg) {
		System.out.println("Writing to printer " + msg);
	}

}
