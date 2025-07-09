package com.hcv.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotificationDTO {

    String id;
    String message;
    String sendTo;
    String sendFrom;
    String type;
    String status;

    TeacherDTO teacher;
    StudentDTO student;
    ResearchDTO research;

}
