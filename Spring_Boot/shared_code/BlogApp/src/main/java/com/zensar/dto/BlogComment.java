package com.zensar.dto;

import lombok.Data;

@Data
public class BlogComment {
	private int id;
    private int blogid;
    private String comment;
}
