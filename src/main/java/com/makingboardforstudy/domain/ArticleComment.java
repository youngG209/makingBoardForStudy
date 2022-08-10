package com.makingboardforstudy.domain;

import java.time.LocalDateTime;

public class ArticleComment {

	private Long id;
	private Article article;
	private String content;

	private LocalDateTime createAt;
	private String createBy;
	private LocalDateTime updateAt;
	private String updateBy;

}
