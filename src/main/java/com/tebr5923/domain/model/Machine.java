package com.tebr5923.domain.model;

import com.tebr5923.domain.Dimensions;

import java.util.Objects;

public class Machine {

    private long id;

    private String name;

    private Dimensions dimensions;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Machine machine = (Machine) o;
        return id == machine.id && Objects.equals(name, machine.name) && Objects.equals(dimensions, machine.dimensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dimensions);
    }

    @Override
    public String toString() {
        return "Machine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dimensions=" + dimensions +
                '}';
    }
}
