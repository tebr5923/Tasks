package com.tebr5923.domain.model;


import com.tebr5923.converter.DimensionsConverter;
import com.tebr5923.domain.Dimensions;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "machines", schema = "public")
public class Machine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Convert(converter = DimensionsConverter.class)
    @Column(name = "dimensions")
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
                ", " + dimensions +
                '}';
    }
}
