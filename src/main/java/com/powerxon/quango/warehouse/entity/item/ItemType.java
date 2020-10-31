package com.powerxon.quango.warehouse.entity.item;

import com.powerxon.quango.warehouse.entity.base.BaseVersionedEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "item_type")
public class ItemType extends BaseVersionedEntity {

    @Column
    private String code;

    @Column
    private String label;

}
