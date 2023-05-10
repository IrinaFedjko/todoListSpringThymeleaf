package com.todolistspringtymeleaf.entity;

import com.todolistspringtymeleaf.entity.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class TodoRequest {

   private String  description;
   private LocalDateTime dueBy;
    private Status status;
}
