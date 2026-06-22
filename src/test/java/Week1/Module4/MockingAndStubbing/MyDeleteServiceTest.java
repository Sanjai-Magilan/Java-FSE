package Week1.Module4.MockingAndStubbing;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class MyDeleteServiceTest {
    @Test
    public void testVoidMethodException() {
        ExternalDeleteApi mockApi = mock(ExternalDeleteApi.class);

        doThrow(new RuntimeException("Delete Failed")).when(mockApi).deleteData();

        MyDeleteService service = new MyDeleteService(mockApi);

        assertThrows(RuntimeException.class, () -> service.removeData());

        verify(mockApi).deleteData();
    }
}
