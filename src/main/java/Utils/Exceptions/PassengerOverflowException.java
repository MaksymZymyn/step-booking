package Utils.Exceptions;

public class PassengerOverflowException extends Exception {
    public PassengerOverflowException() {
        super("Passenger amount exceeded!");
    }
}
