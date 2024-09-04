package com.marve.real_time_task_management_system.data.model;

import com.marve.real_time_task_management_system.constant.Status;
import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private LocalDateTime createdAt;
    private LocalDateTime completedAt;

    @Enumerated
    private Status status;

    private User user;
}
