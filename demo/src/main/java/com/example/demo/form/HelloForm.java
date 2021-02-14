package com.example.demo.form;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class HelloForm {
	@NotEmpty(message = "メッセージを入力してください")
	private String messege;
}
