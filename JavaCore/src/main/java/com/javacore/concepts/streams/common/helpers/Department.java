package com.javacore.concepts.streams.common.helpers;

import java.util.Objects;

public class Department {
    private int id;
    private String name;
    private String location;

    public Department(int id, String name, String location) {
        this.id = id;
        this.name = Objects.requireNonNull(name);
        this.location = location;
    }

    public Department(String name) {
        this(0, name, null);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Objects.requireNonNull(name);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;
        return id == that.id &&
               Objects.equals(name, that.name) &&
               Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, location);
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", name='" + name + '\'' + ", location='" + location + '\'' + '}';
    }
}
