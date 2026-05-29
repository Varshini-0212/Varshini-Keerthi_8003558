package Assessment39;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Sample Class

class Student {

    int id = 101;

    String name = "Varshini";

    public void display() {

        System.out.println(
                "Student Method Called"
        );

    }

}

public class ReflectionEx{

    public static void main(String[] args) {

        try {

            // Get Class Object

            Class<?> cls =
                    Student.class;

            // Display Class Name

            System.out.println(
                    "Class Name: "
                            + cls.getName()
            );

            // Display Fields

            System.out.println(
                    "\nFields:"
            );

            Field[] fields =
                    cls.getDeclaredFields();

            for(Field f : fields) {

                System.out.println(
                        f.getName()
                );

            }

            // Display Methods

            System.out.println(
                    "\nMethods:"
            );

            Method[] methods =
                    cls.getDeclaredMethods();

            for(Method m : methods) {

                System.out.println(
                        m.getName()
                );

            }

        }

        catch(Exception e) {

            System.out.println(
                    e.getMessage()
            );

        }

    }

}