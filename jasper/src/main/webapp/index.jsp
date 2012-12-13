<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>验证码测试	</title>
<script type="text/javascript">
	
</script>
</head>
<body>
<!--  <em>这里是防盗链检测</em>
<a href="<%=request.getContextPath()%>/DefenseReverseRequest">喜剧片</a>-->
<form action="Submit" method="post">
	<label>验证码:</label><img name="check" alt="" src="<%=request.getContextPath()%>/CheckImage" onclick="document.forms[0].check.src=this.src"><br>
	<label>输入：</label><input type="text" name="code">
	<input type="submit" value="提交">
</form>
</body>
</html>