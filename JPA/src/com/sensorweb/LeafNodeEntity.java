package com.sensorweb;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "leaf_node", schema = "sensorweb", catalog = "")
public class LeafNodeEntity {
    private int leafNodeId;
    private Timestamp created;
    private Boolean isActive;

    @Id
    @Column(name = "leaf_node_id")
    public int getLeafNodeId() {
        return leafNodeId;
    }

    public void setLeafNodeId(int leafNodeId) {
        this.leafNodeId = leafNodeId;
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

        LeafNodeEntity that = (LeafNodeEntity) o;

        if (leafNodeId != that.leafNodeId) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (isActive != null ? !isActive.equals(that.isActive) : that.isActive != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = leafNodeId;
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        return result;
    }
}
