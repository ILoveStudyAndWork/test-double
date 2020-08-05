import mock.DoorPanel;
import mock.SecurityCenter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stub.GradeService;
import stub.GradeSystem;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MockitoTest {

    @Test
    public void shouldVerifyDoorIsClosed(){
        DoorPanel doorPanel = mock(DoorPanel.class);
        SecurityCenter securityCenter = new SecurityCenter(doorPanel);
        securityCenter.switchOn();
        verify(doorPanel).close();
    }

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100(){

        GradeSystem gradeSystem = mock(GradeSystem.class);
        GradeService gradeService = new GradeService(gradeSystem);
        when(gradeSystem.gradesFor(1)).thenReturn(Arrays.asList(90.0, 95.0, 100.0));
        double result = gradeService.calculateAverageGrades(1);
        assertEquals(95.0,result);


    }
}
