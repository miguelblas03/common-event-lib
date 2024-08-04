package com.company.commoneventlib.event;

import com.company.commoneventlib.enums.ActionEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductEvent {
    private Long id;
    private String name;
    private String description;
    private Long previousCategoryId;
    private Long currentCategoryId;
    private String status;
    private ActionEnum action;
}
