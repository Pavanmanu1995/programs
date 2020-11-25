package exception;

public class EmployeeDaoException extends EmployeeApplicationException {

	public EmployeeDaoException() {
	}

	public EmployeeDaoException(String message) {
		super(message);
	}

	public EmployeeDaoException(Throwable cause) {
		super(cause);
	}

	public EmployeeDaoException(String message, Throwable cause) {
		super(message, cause);
	}
}
