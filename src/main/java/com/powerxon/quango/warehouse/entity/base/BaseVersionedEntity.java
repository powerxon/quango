package com.powerxon.quango.warehouse.entity.base;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseVersionedEntity extends BaseEntity {

    @Version
    private Integer version;

}
