package com.test.cucumber.persistence.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "regions")
@Getter
@Setter
@ToString
public class RegionEntity {

    @Id
    @Column(name = "region_id")
    private long id;

    @Column(name = "region_name")
    private String name;
}
