package ThirdTask;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, InstantiationException {
        Test test = new Test();
        test.setA(7);
        test.setB("Serialization");

        String result = Serialization.serialize(test);
        System.out.println("Serialized " + result);

        test = Serialization.deserialize(result,Test.class);
        System.out.println("Deserialized " + test.getA() + ", " + test.getB() + ", " + test.getC());
    }
}
