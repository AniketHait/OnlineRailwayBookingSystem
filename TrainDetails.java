package com.toy.Online_Railway_System.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class TrainDetails {

    @Id
    @GeneratedValue
    public int tno;
    public String tname;
    public String tsource;
    public String tdestination;

    }


