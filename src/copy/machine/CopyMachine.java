package copy.machine;

import copy.reader.Reader;
import copy.writer.Writer;

public class CopyMachine implements Reader, Writer {
	private Reader reader;
	private Writer writer;

	@Override
	public void write(String msg) {
		writer.write(msg);

	}

	@Override
	public String read() {
		return reader.read();
	}

	public Reader getReader() {
		return reader;
	}

	public void setReader(Reader reader) {
		this.reader = reader;
	}

	public Writer getWriter() {
		return writer;
	}

	public void setWriter(Writer writer) {
		this.writer = writer;
	}

}
