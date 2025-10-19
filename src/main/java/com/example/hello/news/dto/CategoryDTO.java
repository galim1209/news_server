package com.example.hello.news.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// POJO : Plain Old java Object ( 아무것도 없는 순수한 객체)

@Getter
@Setter
@NoArgsConstructor
public class CategoryDTO {
    private String id;
    private String name;
    private String memo;
}
