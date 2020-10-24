package com.powerxon.quango.warehouse.entity.base;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Version;

@Getter
@Setter
public class BaseVersionedEntity extends BaseEntity {

    @Version
    private Integer version;

}
