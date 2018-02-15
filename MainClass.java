
public class MainClass {

public static void main(String[] args){

    System.out.println("Whats up ");

    //Implemented foo function without implementing VoidInterfaceForLambda using lambda
    VoidInterfaceForLambda voidLamdaVar = () -> {
        System.out.println("Bowhaha");
        System.out.println("Line two");
    };
    voidLamdaVar.foo();

    LengthTest lengthLambda = (String s) -> s.length();
    System.out.println(lengthLambda.lengthTest("SAURABH"));

    //Passing lambda expression directly to function, we can observe that we are not creating an implementation of interface just to get the length of
    //a string, instead just pass the lambda function.
    // else it wuold be like.. create a class implements LengthTest and create an instance of it to call the lenghtTest method.
    handleLength((s) -> s.length());


    //Vehicle object cant call the car function though its a car object
    Vehicle vehicle = new Car();
    Vehicle vehicle2 = new Vehicle();
    vehicle.testVehicle();
    vehicle2.testVehicle();

}


public static void handleLength(LengthTest lengthTest){
    System.out.println(lengthTest.lengthTest("Test Lenght of this"));
}


interface LengthTest{
    int lengthTest(String s);
    }

}
