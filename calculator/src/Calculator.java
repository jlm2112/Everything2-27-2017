public class Calculator {

    public float sum(float firstValue, float secondValue) {
        return firstValue + secondValue;
    }
    
    public float difference(float firstValue, float secondValue) {
    	return sum(firstValue, -secondValue);
    }
    
    public float product(float firstValue, float secondValue) {
    	return (firstValue * secondValue);
    }
    public float divide(float firstValue, float secondValue) {
    	return (firstValue / secondValue);
    }
    
}
