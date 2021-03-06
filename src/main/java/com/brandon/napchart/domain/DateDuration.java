package com.brandon.napchart.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class DateDuration implements Serializable{
    @Id
    @Column
    private String id;

    @Column
    private LocalDate localDate;

    @Column
    private Float totalDuration;

    @Column
    private String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Float getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(Float totalDuration) {
        this.totalDuration = totalDuration;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setDay(LocalDate date) {
        this.localDate = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
