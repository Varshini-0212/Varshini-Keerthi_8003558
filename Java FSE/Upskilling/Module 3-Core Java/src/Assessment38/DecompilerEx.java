package Assessment38;

public class DecompilerEx {

    public void show() {

        int a = 10;

        int b = 20;

        System.out.println(
                "Sum = " + (a + b)
        );

    }

    public static void main(String[] args) {

        DecompilerEx obj =
                new DecompilerEx();

        obj.show();

    }

}