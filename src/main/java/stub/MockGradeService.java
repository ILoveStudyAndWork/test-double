package stub;

public class MockGradeService extends GradeService {
    private double stubGradeToBeReturn = 100;
    public MockGradeService(GradeSystem gradeSystem) {
        super(gradeSystem);
    }

    @Override
    public double calculateAverageGrades(long studentId) {
        return stubGradeToBeReturn;
    }
}
