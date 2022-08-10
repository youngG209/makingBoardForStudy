package com.makingboardforstudy.domain;

import java.time.LocalDateTime;

public class Article {

	private Long id;
	private String title;
	private String content;
	private String hashtag;

	private LocalDateTime createAt;
	private String createBy;
	private LocalDateTime updateAt;
	private String updateBy;
}
