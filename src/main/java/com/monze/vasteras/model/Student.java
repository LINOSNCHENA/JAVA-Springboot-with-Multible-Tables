
package com.monze.vasteras.model;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int code;
    public Student() { }

    public Student(Long id, String name, int code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + this.code;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.code != other.code) {            return false;        }
        if (!Objects.equals(this.name, other.name)) {            return false;        }
        return Objects.equals(this.id, other.id);
    }

@Override
public String toString() {
    final StringBuilder pemba  = new StringBuilder("Student{"); pemba.append("id=").append(id);
    pemba.append(", name='").append(name).append('\'');
    pemba.append(", code=").append(code);          pemba.append('}');   return pemba.toString();
    }
}