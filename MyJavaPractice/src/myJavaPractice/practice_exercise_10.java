package myJavaPractice;

/*
    Exercise 6: You have to create a custom calculator with following operations:
    1. + -> Addition
    2. - -> Subtraction
    3. * -> Multiplication
    4. / -> Division
    which throws the following exceptions:
    1. Invalid input Exception ex: 8 & 9
    2. Cannot divide by 0 exception
    3. Max Input Exception if any of the inputs is greater than 100000
    4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000

*/

class InvalidInputException extends Exception {
    @Override
    public String toString() {
        return "Cannot add 8 & 9";
    }
}

class CannotDivideByZeroException extends Exception {
    @Override
    public String toString() {
        return "Cannot divide by 0";
    }
}

class MaxInputException extends Exception {
    @Override
    public String toString() {
        return "Input cannot be greater than 100000";
    }
}

class MaxMultiplierException extends Exception {
    @Override
    public String toString() {
        return "Multiplier cannot be greater than 7000";
    }
}

class CustomCalculator {
    double add(double a, double b) throws InvalidInputException, MaxInputException {
        if(a>100000 || b>100000) {
            throw new MaxInputException();
        }
        if(a==8 || b==9) {
            throw new InvalidInputException();
        }
        return a + b;
    }
    double sub(double a, double b) {
        return a - b;
    }
    double multiply(double a, double b) throws MaxMultiplierException {
        if(a>7000 || b>7000) {
            throw new MaxMultiplierException();
        }
        return a * b;
    }
    double divide(double a, double b) throws CannotDivideByZeroException {
        if(b==0) {
            throw new CannotDivideByZeroException();
        }
        return a / b;
    }
}

public class practice_exercise_10 {
    public static void main(String[] args) throws InvalidInputException, CannotDivideByZeroException, MaxInputException, MaxMultiplierException {
        CustomCalculator c = new CustomCalculator();
        //c.add(1000021, 10000023);
        //c.divide(10,0);
        c.multiply(8000,9000);
    }
}
