package com.vladmikhayl.school.client;

import com.vladmikhayl.school.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "student-service", url = "${application.config.students-url}")
public interface StudentClient {

    @GetMapping("/school/{school-id}")
    List<StudentDTO> findAllStudentsBySchool(@PathVariable("school-id") Integer schoolId);

}
