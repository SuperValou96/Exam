package fr.emse.majeureinfo.springbootintro.model;

import javax.persistence.*;

@Entity
@SuppressWarnings("serial")
@Table(name="ROBOT")
public class Robot {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Sensor sensor;

    @Column(nullable = false)
    private Actuator actuator;

    @SuppressWarnings("unused")
    public Robot() {
    }

    public Robot(Sensor sensor, Actuator actuator) {
        this.sensor = sensor;
        this.actuator = actuator;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public Actuator getActuator() {
        return actuator;
    }

    public void setActuator(Actuator actuator) {
        this.actuator = actuator;
    }

    public void switchSensor() {
        if (getSensor().getStatus() == Status.ON){
            getSensor().setStatus(Status.OFF);
        }
        else {
            getSensor().setStatus(Status.ON);
        }
    } // Here we could also put sensor instead of getSensor()


    public void switchActuator() {
        if (getActuator().getStatus() == Status.ON) {
            getActuator().setStatus(Status.OFF);
        }
        else {
            getActuator().setStatus(Status.ON);
        }
    }



}
