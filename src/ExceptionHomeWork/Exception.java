package ExceptionTest;

class IncorrectValueException extends RuntimeException{
	public IncorrectValueException() {
	}
	public  void incorrectValueException(String i) {
		System.out.println("Exception: Не верный пол");
		System.out.printf("Не корректно введен пол: %s", i);
		System.out.println();
	}
}

class DateFormatException extends RuntimeException{
	public DateFormatException() {
	}
	public  void dateFormatException(String i) {
		System.out.println("Exception: Не корректная дата");
		System.out.printf("Не корректно введена дата: %s", i);
		System.out.println();
	}}


class DataFormatException extends Exception{
	public DataFormatException() {
	}
	
	public void dataFormatException(String i) {
		
		System.out.println("Exception: Не корректный формат данных");
		System.out.printf("It`s not correct format: %s", i);
		System.out.println();
	}
}
class EmptyStringException extends RuntimeException{
	public EmptyStringException(String message) {
		super(message);
	}
}

class ArrayCountElementException extends RuntimeException{
	public ArrayCountElementException(String message) {
		super(message);
	}
}



