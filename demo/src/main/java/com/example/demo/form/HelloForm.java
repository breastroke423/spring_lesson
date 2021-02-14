package com.example.demo.form;

import lombok.Data;

@Data
public class HelloForm {
	@NotEmpty(message = "メッセージを入力してください")
	private String messege;
}
