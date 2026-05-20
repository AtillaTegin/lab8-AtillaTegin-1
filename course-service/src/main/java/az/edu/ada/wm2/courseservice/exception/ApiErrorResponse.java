package az.edu.ada.wm2.courseservice.exception;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ApiErrorResponse {

    private String status;
    private LocalDateTime timestamp;
    private int httpStatus;
    private String error;
    private String message;
    private String path;
}
