package exception;

public class ConnectionFailedException extends EmployeeDaoException {

	public ConnectionFailedException() {
	}

	public ConnectionFailedException(String message) {
		super(message);
	}

	public ConnectionFailedException(Throwable cause) {
		super(cause);
	}

	public ConnectionFailedException(String message, Throwable cause) {
		super(message, cause);
	}

}
