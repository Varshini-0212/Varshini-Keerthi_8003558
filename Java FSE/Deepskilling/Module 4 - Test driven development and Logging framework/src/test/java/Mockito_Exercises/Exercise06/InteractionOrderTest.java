package Mockito_Exercises.Exercise06;

import org.junit.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class InteractionOrderTest {

    @Test
    public void testInteractionOrder() {

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.performActions();

        InOrder inOrder = inOrder(mockApi);

        inOrder.verify(mockApi).firstMethod();
        inOrder.verify(mockApi).secondMethod();
    }
}