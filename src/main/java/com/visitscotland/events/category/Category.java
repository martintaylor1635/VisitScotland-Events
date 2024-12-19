package com.visitscotland.events.category;

import jakarta.persistence.Entity;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.util.UUID;

@Entity
class Category extends AbstractPersistable<UUID> {
    private String name;

    public String getName() {
        return name;
    }

    public Category(String name) {
        this.name = name;
    }

    protected Category() { }
}
