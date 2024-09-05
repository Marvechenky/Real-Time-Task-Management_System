package com.marve.real_time_task_management_system.data.model;

import com.marve.real_time_task_management_system.constant.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "taskTitle", nullable = false)
    private String title;

    @Column(name = "taskDescription", nullable = false)
    private String description;

    private LocalDateTime createdAt;

    private LocalDateTime completedAt;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "username", nullable = false)
    private String userName;
}
