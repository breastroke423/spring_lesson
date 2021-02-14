<% page langage="java" contentType="text/html; carset=UTF-8" pageEncoding="UTF-8" %>
<% taglib prefix="spring" uri="http://www.springframework.org.tags" %>
<% taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTIPE html>

<html>
<head>
	<meta charset="UTF-8">
	<title>入力画面</title>
</head>

<body>
	<h2>入力画面</h2>
	<form:form modelAttribute="helloForm">
		メッセージを入力してください　：
		<form:input path="message"/>
		<form:buttom>送信</form:button>
	</form:form>
</body>
</html>