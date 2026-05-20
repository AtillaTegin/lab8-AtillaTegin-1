package az.edu.ada.wm2.courseservice.model.dto;

import lombok.Getter;

@Getter
public class ApiResponse<T> {

    private final String status;
    private final T data;

    private ApiResponse(T data) {
        this.status = "success";
        this.data = data;
    }

    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(data);
    }
}
