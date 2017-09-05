package com.sensorweb;

import javax.persistence.*;

@Entity
@Table(name = "sensor_readings", schema = "sensorweb", catalog = "")
public class SensorReadingsEntity {
    private int sensorReadingsId;
    private Double readingValue;
    private String location;

    @Id
    @Column(name = "sensor_readings_id")
    public int getSensorReadingsId() {
        return sensorReadingsId;
    }

    public void setSensorReadingsId(int sensorReadingsId) {
        this.sensorReadingsId = sensorReadingsId;
    }

    @Basic
    @Column(name = "reading_value")
    public Double getReadingValue() {
        return readingValue;
    }

    public void setReadingValue(Double readingValue) {
        this.readingValue = readingValue;
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

        SensorReadingsEntity that = (SensorReadingsEntity) o;

        if (sensorReadingsId != that.sensorReadingsId) return false;
        if (readingValue != null ? !readingValue.equals(that.readingValue) : that.readingValue != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sensorReadingsId;
        result = 31 * result + (readingValue != null ? readingValue.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }
}
