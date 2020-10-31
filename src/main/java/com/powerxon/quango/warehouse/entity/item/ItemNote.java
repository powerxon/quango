package com.powerxon.quango.warehouse.entity.item;

import com.powerxon.quango.warehouse.entity.base.BaseVersionedEntity;
import com.powerxon.quango.warehouse.entity.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "item_note")
public class ItemNote extends BaseVersionedEntity {

    @ManyToOne
    private User creatorUser;

    private String note;

}
