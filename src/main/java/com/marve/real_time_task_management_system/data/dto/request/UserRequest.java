package com.marve.real_time_task_management_system.data.dto.request;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserRequest {

    @NotBlank(message = "First name cannot be blank")
    @Pattern(regexp = "^[A-Za-zÀ-ÖØ-öø-ÿ'\\-\\s]{2,50}$",
            message = "First name must be between 2 and 50 characters " +
                    "and contain only letters, hyphens, apostrophes, or spaces.")
    private String firstName;

    @NotBlank(message = "Last name cannot be blank")
    @Pattern(regexp = "^[A-Za-zÀ-ÖØ-öø-ÿ'\\-\\s]{2,50}$",
            message = "Last name must be between 2 and 50 characters " +
                    "and contain only letters, hyphens, apostrophes, or spaces.")
    private String lastName;

    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "Invalid email format")
    private String email;

    @NotBlank(message = "Username cannot be blank")
    @Pattern(regexp = "^[a-zA-Z0-9](?!.*[_.]{2})[a-zA-Z0-9_.]{1,18}[a-zA-Z0-9]$",
            message = "Username must be 3-20 characters long, and can only contain letters, " +
                    "numbers, underscores, or dots. No consecutive underscores or dots, " +
                    "and no underscores or dots at the start or end.")
    private String username;


    @NotBlank(message = "Password cannot be blank")
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$",
            message = "Password must be at least 8 characters long, contain an uppercase " +
                    "letter, lowercase letter, number, and special character")
    private String password;

    private String confirmPassword;

}
