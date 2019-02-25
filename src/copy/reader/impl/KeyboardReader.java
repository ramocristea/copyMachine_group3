package copy.reader.impl;

import copy.reader.Reader;

public class KeyboardReader implements Reader {

	@Override
	public String read() {
		System.out.println("Reading from keyboard");
		return "keyboard msg";
	}
	
	public String customRead() {
		return "Custom reader msg";
	}

}
