package com.biehcey.tasks.domain.dtos;

import com.biehcey.tasks.domain.entities.TaskPriority;
import com.biehcey.tasks.domain.entities.TaskStatus;

import java.time.LocalDate;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDate dueDate,
        TaskPriority priority,
        TaskStatus status
        ) {
}
