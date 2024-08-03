package com.company.commoneventlib.event;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductEvent {
    private Long id;
    private String name;
    private String description;
    private Long categoryId;
    private String status;
}
