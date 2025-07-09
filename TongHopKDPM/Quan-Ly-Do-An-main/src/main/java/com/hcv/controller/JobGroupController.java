package com.hcv.controller;

import com.hcv.dto.request.JobGroupInput;
import com.hcv.dto.response.ApiResponse;
import com.hcv.dto.response.JobGroupResponse;
import com.hcv.service.IJobGroupService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequestMapping("/job-group")
public class JobGroupController {

    IJobGroupService jobGroupService;

    @PostMapping("/insert")
    @PreAuthorize("hasRole('TEACHER')")
    public ApiResponse<JobGroupResponse> insert(@RequestBody @Valid JobGroupInput jobInput) {
        JobGroupResponse response = jobGroupService.insert(jobInput);
        return ApiResponse.<JobGroupResponse>builder()
                .result(response)
                .build();
    }

    @PutMapping("/update/{id}")
    @PreAuthorize("hasRole('TEACHER')")
    public ApiResponse<JobGroupResponse> update(@PathVariable(value = "id") String id,
                                                @RequestBody @Valid JobGroupInput jobInput) {
        JobGroupResponse response = jobGroupService.update(id, jobInput);
        return ApiResponse.<JobGroupResponse>builder()
                .result(response)
                .build();
    }

    @PutMapping("/mark-completed/{groupId}")
    @PreAuthorize("hasRole('TEACHER')")
    public ApiResponse<String> markCompleted(@PathVariable(value = "groupId") String groupId) {
        jobGroupService.markCompleted(groupId);
        return ApiResponse.<String>builder()
                .message("Mark completed successfully !")
                .build();
    }

    @DeleteMapping("/delete")
    @PreAuthorize("hasRole('TEACHER')")
    public ApiResponse<String> delete(@RequestBody String[] ids) {
        jobGroupService.delete(ids);
        return ApiResponse.<String>builder()
                .message("Delete successfully !")
                .build();
    }

    @GetMapping("/showJob-detail")
    public ApiResponse<JobGroupResponse> findById(@RequestParam(value = "groupId", required = false, defaultValue = "1") String groupId) {
        JobGroupResponse response = jobGroupService.findById(groupId);
        return ApiResponse.<JobGroupResponse>builder()
                .result(response)
                .build();
    }

}
