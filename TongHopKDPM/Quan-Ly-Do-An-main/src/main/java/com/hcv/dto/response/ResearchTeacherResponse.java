package com.hcv.dto.response;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ResearchTeacherResponse {

    TeacherResponse teacher;
    TypeTeacherResponse typeTeacher;

}
