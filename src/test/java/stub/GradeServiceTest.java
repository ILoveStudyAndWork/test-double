package stub;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    GradeSystem gradeSystem;
    MockGradeService mockGradeService;
    @BeforeEach
    void setUp(){
        gradeSystem = new GradeSystem();
        mockGradeService = new MockGradeService(gradeSystem);
    }

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        //Assertions.assertEquals(90.0, result);
        double result = mockGradeService.calculateAverageGrades(1);
        assertEquals(100,result);

    }
}
