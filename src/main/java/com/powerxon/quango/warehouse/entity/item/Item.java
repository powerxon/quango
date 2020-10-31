package com.powerxon.quango.warehouse.entity.item;

import com.powerxon.quango.warehouse.entity.base.BaseVersionedEntity;
import com.powerxon.quango.warehouse.entity.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "item")
public class Item extends BaseVersionedEntity {

    @Column
    private String label;

    @Column()
    private String description;

    @OneToMany
    @JoinColumn(name = "item_id")
    private List<ItemNote> itemNotes;


    @ManyToOne
    @JoinColumn(name = "creator_user")
    private User creatorUser;

    @OneToMany()
    @JoinTable(name = "user_item_relationship",
            inverseJoinColumns = { @JoinColumn(name = "id") }
    )
    private Set<User> ownerUsers;

    @ManyToOne
    @JoinColumn(name = "item_type_id")
    private ItemType type;

    @Column(name = "image_uri")
    private String imageURI;
}
