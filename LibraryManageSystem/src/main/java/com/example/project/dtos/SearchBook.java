package com.example.project.dtos;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SearchBook {
    private String searchKey;
    private String searchValue;
}
