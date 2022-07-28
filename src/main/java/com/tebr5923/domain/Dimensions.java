package com.tebr5923.domain;

import java.util.Objects;

public class Dimensions {
    public Dimensions(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    private int x;

    private int y;

    private int z;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dimensions that = (Dimensions) o;
        return x == that.x && y == that.y && z == that.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public String toString() {
        return "Dimensions{" +
                x +
                "X" + y +
                "X" + z +
                '}';
    }
}
