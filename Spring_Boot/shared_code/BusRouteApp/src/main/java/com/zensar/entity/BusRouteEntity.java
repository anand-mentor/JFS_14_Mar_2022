package com.zensar.entity;

import javax.persistence.Entity;

@Entity
public class BusRouteEntity {
	private int id;
    private String title;
    private String source;
    private String destination;
	private String stations;
}
