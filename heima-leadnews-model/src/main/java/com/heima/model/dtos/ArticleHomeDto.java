package com.heima.model.dtos;

import lombok.Data;

import java.util.Date;

@Data
public class ArticleHomeDto {

    Date maxBehotTime;

    Date minBehotTime;

    Integer size;

    String tag;
}
