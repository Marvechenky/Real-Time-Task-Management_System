package com.marve.real_time_task_management_system.data.dto.response;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserResponse {

    private String firstName;
    private String lastName;
    private String email;
    private String username;
}
