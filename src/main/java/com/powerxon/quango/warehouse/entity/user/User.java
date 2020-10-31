package com.powerxon.quango.warehouse.entity.user;

import com.powerxon.quango.warehouse.entity.base.BaseVersionedEntity;
import com.powerxon.quango.warehouse.entity.item.Item;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User extends BaseVersionedEntity {

    @Column()
    private String username;

    @Column()
    private String lastname;

    @Column()
    private String email;

    @OneToMany
    @JoinTable(name = "user_item_relationship",
            inverseJoinColumns = { @JoinColumn(name = "id") }
    )
    private Set<Item> ownedItems;
}

