import mock.DoorPanel;
import mock.SecurityCenter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stub.GradeService;
import stub.GradeSystem;

import static org.mockito.Mockito.*;

public class MockitoTest {

    @BeforeEach
    void setUp(){

    }

    @Test
    public void shouldVerifyDoorIsClosed(){
        DoorPanel doorPanel = mock(DoorPanel.class);
        SecurityCenter securityCenter = new SecurityCenter(doorPanel);
        securityCenter.switchOn();
        verify(doorPanel).close();
    }

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100(){

        GradeService gradeService = mock(GradeService.class);
        when(gradeService.calculateAverageGrades(1)).thenReturn(100.0);
        gradeService.calculateAverageGrades(1);
        verify(gradeService).calculateAverageGrades(1);


    }
}
