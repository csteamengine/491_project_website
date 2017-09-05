package com.sensorweb;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "home_node", schema = "sensorweb", catalog = "")
public class HomeNodeEntity {
    private int homeNodeId;
    private Boolean isActive;
    private Timestamp created;
    private String location;

    @Id
    @Column(name = "home_node_id")
    public int getHomeNodeId() {
        return homeNodeId;
    }

    public void setHomeNodeId(int homeNodeId) {
        this.homeNodeId = homeNodeId;
    }

    @Basic
    @Column(name = "is_active")
    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
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
    @Column(name = "location")
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

        HomeNodeEntity that = (HomeNodeEntity) o;

        if (homeNodeId != that.homeNodeId) return false;
        if (isActive != null ? !isActive.equals(that.isActive) : that.isActive != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = homeNodeId;
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }
}
