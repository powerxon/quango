package com.powerxon.quango.warehouse.entity.base;

import lombok.Getter;

@Getter
public enum BaseStatus {

    DRAFT("draft"),
    CREATED("created"),
    DELETED("deleted"),
    FILED("filed"),

    ;

    private String code;

    BaseStatus(String code) {
        this.code = code;
    }
}
