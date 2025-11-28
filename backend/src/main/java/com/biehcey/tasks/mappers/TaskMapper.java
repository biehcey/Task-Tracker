package com.biehcey.tasks.mappers;

import com.biehcey.tasks.domain.dtos.TaskDto;
import com.biehcey.tasks.domain.entities.Task;

public interface TaskMapper {
    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}
