package Mockito_Exercises.Exercise04;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class VoidMethodTest {

    @Test
    public void testVoidMethod() {

        Logger mockLogger = mock(Logger.class);

        MyService service = new MyService(mockLogger);

        doNothing().when(mockLogger).log(anyString());

        service.performAction();

        verify(mockLogger).log("Action Performed");
    }
}