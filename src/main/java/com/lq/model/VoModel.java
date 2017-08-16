package com.lq.model;

/**
 * Created by Administrator on 2017/8/14.
 */
public class VoModel {
    private String name;
    private String id;
    private String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public VoModel() {
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VoModel voModel = (VoModel) o;

        if (name != null ? !name.equals(voModel.name) : voModel.name != null) return false;
        if (id != null ? !id.equals(voModel.id) : voModel.id != null) return false;
        return email != null ? email.equals(voModel.email) : voModel.email == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "VoModel{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
