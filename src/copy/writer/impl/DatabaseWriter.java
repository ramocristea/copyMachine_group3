package copy.writer.impl;

import copy.writer.Writer;

public class DatabaseWriter implements Writer {

	@Override
	public void write(String msg) {
		System.out.println("Writing to database " + msg);
	}

}
