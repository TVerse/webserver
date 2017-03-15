package nl.sogyo.webserver.exceptions;

public class ResourceNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException() {
		super();
	}

	public ResourceNotFoundException(String string) {
		super(string);
	}
}
