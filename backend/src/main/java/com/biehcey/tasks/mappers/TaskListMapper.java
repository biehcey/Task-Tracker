package com.biehcey.tasks.mappers;

import com.biehcey.tasks.domain.dtos.TaskListDto;
import com.biehcey.tasks.domain.entities.TaskList;

public interface TaskListMapper {
    TaskList fromDto(TaskListDto taskListDto);
    TaskListDto toDto(TaskList taskList);
}
