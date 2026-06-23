package Week1.Module4.AdvancedMockito;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MultiReturnServiceTest {
    @Test
    public void testServiceWithMultipleReturnValues() {
        Repository mockRepository = mock(Repository.class);
        when(mockRepository.getData())
                .thenReturn("First Mock Data")
                .thenReturn("Second Mock Data");
        Service service = new Service(mockRepository);
        String firstResult = service.processData();
        String secondResult = service.processData();
        assertEquals("First Mock Data", firstResult);
        assertEquals("Second Mock Data", secondResult);
    }
}