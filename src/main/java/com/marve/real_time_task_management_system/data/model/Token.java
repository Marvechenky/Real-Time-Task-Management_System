package com.marve.real_time_task_management_system.data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Token")
public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "accessToken", nullable = false )
    private String accessToken;

    @Column(name = "refreshToken", nullable = false)
    private String refreshToken;

    @Column(name = "createdAt", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "expiredAt", nullable = false)
    private LocalDateTime expiredAt;

    @Column(name = "userName", nullable = false)
    private String userName;


}
