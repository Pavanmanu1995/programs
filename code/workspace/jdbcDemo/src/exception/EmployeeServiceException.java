package exception;

public class EmployeeServiceException extends EmployeeApplicationException {

	public EmployeeServiceException() {
	}

	public EmployeeServiceException(String message) {
		super(message);
	}

	public EmployeeServiceException(Throwable cause) {
		super(cause);
	}

	public EmployeeServiceException(String message, Throwable cause) {
		super(message, cause);
	}

}
