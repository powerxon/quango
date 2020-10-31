package com.powerxon.quango.warehouse.entity.base;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uuid;

    @Column(name = "persist_datetime")
    private LocalDateTime persistDatetime;

    @Column(name = "delete_datetime")
    private LocalDateTime deleteDatetime;

    @Column(name = "last_update_datetime")
    private LocalDateTime lastUpdateDatetime;

}
