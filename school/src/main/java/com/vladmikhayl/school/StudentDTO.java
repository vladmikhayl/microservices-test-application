package com.vladmikhayl.school;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDTO {

    private String firstname;
    private String lastname;
    private String email;

}
