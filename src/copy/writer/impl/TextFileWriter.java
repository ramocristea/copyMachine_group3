package copy.writer.impl;

import copy.writer.Writer;

public class TextFileWriter implements Writer {

	@Override
	public void write(String msg) {
		System.out.println("Writing to text file " + msg);
	}

}
