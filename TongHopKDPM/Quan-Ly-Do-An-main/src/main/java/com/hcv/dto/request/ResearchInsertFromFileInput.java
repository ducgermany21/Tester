package com.hcv.dto.request;

import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ResearchInsertFromFileInput {

    @Valid
    List<ResearchInput> researches = new ArrayList<>();

}
