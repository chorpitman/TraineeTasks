package com.epam.homeworks.hw7_jdbc.model;

public class Department {

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Override object methods
    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Department) && (id != null) ? id.equals((((Department) obj).id)) : (obj == this);
    }

    @Override
    public int hashCode() {
        return (id != null) ? (this.getClass().hashCode() + id.hashCode()) : super.hashCode();
    }

    @Override
    public String toString() {
        return
                "Department{" +
                        "id=" + id +
                        ", name='" + name + '}';
    }
}

