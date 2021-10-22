
public class SimpleCalculator {

//	Define fields (Instance Variables)
//	Always define Instance variable with Private access modifier ---> Encapsulation
	private double firstNumber;
	private double secondNumber;
	
//	Define Getters and Setters
	public void setFirstNumber(double number) {
		this.firstNumber=number;
	}
	
	public double getFirstNumber() {
		return firstNumber;
	}
	
	public void setSecondNumber(double number) {
		this.secondNumber=number;
	}
	
	public double getSecondNumber() {
		return secondNumber;
	}
	
//	Methods for Class
	public double getAdditionResult() {
		double getResult= (firstNumber+secondNumber);
		return getResult;
	}
	
	public double getSubtractionResult() {
		double getResult= (firstNumber-secondNumber);
		return getResult;
	}
	
	public double getMultiplicationResult() {
		double getResult = (firstNumber*secondNumber);
		return getResult;
	}
	
	public double getDivisonResult() {
		if(secondNumber!=0) {
			double getResult = (firstNumber/secondNumber);
			return getResult;
		}else {
			return 0;
		}
			
	}
	 
}
