package com.sensorweb;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "fields", schema = "sensorweb", catalog = "")
public class FieldsEntity {
    private int fieldId;
    private String address;
    private Timestamp created;
    private Boolean isActive;

    @Id
    @Column(name = "field_id")
    public int getFieldId() {
        return fieldId;
    }

    public void setFieldId(int fieldId) {
        this.fieldId = fieldId;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "created")
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Basic
    @Column(name = "is_active")
    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FieldsEntity that = (FieldsEntity) o;

        if (fieldId != that.fieldId) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (isActive != null ? !isActive.equals(that.isActive) : that.isActive != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fieldId;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        return result;
    }
}
