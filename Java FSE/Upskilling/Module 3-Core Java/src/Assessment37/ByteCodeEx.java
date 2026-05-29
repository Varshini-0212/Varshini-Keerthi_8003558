package Assessment37;
public class ByteCodeEx {

    public void display() {

        int a = 10;

        int b = 20;

        int sum = a + b;

        System.out.println(
                "Sum = " + sum
        );

    }

    public static void main(String[] args) {

        ByteCodeEx obj =
                new ByteCodeEx();

        obj.display();

    }

}
