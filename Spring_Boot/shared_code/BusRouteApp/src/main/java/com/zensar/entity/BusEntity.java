package com.zensar.entity;

import javax.persistence.Entity;

@Entity
public class BusEntity {
	private int id;
	private String busNo;
    private String color;
    private int capacity;
	private int routeId;
}
