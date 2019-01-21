public class HelloWorldLambda {
    interface HelloWorld{
        void sayHello();
    }
    public static void main(String args[]){
        HelloWorld helloWorld = () -> System.out.println("Hello World!!");
        helloWorld.sayHello();
    }
}
