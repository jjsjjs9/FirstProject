package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString   // tostring의 리팩터링
public class ArticleFormDto {
    private String title;       // 제목 필드
    private String content;     // 내용 필드


     public Article toEntity() {
        return new Article(null, title,content);
     }
 }
