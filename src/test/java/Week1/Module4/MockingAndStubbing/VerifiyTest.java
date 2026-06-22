package Week1.Module4.MockingAndStubbing;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class VerifiyTest {
    @Test
    public void testVerifyInteraction() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        service.fetchData();
        verify(mockApi).getData();
    }
}
