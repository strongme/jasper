<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${requestScope.tips}</title>
</head>
<body>
<script type="text/javascript" src="<%=request.getContextPath()%>/scripts/jquery-1.7.2.js"></script>
<script type="text/javascript">
	$(function(){
		var tips = "${requestScope.tips}";
		var imgsrc = "";
		if(tips=="验证成功") {
			imgsrc="<%=request.getContextPath()%>/img/head_x460.png";
		}else {
			imgsrc="<%=request.getContextPath()%>/img/head_x460_bw.png";
		}
		var imgelement = "<img src='"+imgsrc+"' id='flag'></img>";
		$("body").append(imgelement);
		$("#flag").css("position","relative");
		$("#flag").css("left","30%");
		$("#flag").css("top","80px");
	});
</script>
</body>
</html>