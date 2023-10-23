package org.example.department.entities;

import java.util.Objects;

public class Classes {
    private String name;
    private String level;

    public Classes(String name, String level) {
        this.name = name;
        this.level = level;
    }

    public Classes() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classes classes = (Classes) o;
        return Objects.equals(name, classes.name) && Objects.equals(level, classes.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, level);
    }

    @Override
    public String toString() {
        return "Classes{" +
                "name='" + name + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
