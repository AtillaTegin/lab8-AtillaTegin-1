package az.edu.ada.wm2.courseservice.exception;

public class PrerequisiteNotSatisfiedException extends RuntimeException {

    public PrerequisiteNotSatisfiedException(Long studentId, Long prerequisiteCourseId) {
        super("Student " + studentId + " has not completed prerequisite course " + prerequisiteCourseId);
    }
}
