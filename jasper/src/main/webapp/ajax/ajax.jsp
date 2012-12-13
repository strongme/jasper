<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajax</title>
<script type="text/javascript">
		var server;
		
	function getData() {
		if(window.XMLHttpRequest) {
			server = new XMLHttpRequest();
		}else if(window.ActiveXObject){
			server = new ActiveXObject("Microsoft.XMLHTTP");
		}
		server.onreadystatechange = callready;
		server.open("GET", "<%=request.getContextPath()%>/DataReqServlet", true);
		server.send(null);
	}

	function callready() {
		var content = document.getElementById("content");
		if(server.readyState==4) {
			if(server.status==200){
				content.innerHTML = "";
				var people = eval(server.responseText);
				content.innerHTML += people[0].name;
				content.innerHTML += people[1].name;
				//var doc = server.responseXML;
				/* var root = doc.documentElement; */
				//alert(doc);
			}else {
				content.innerHTML = "ERROR TRANSMIT";
			}
		}else {
			alert(server.readyState);
			content.innerHTML = "ERROR NOT READY";	
		}
	}

</script>
</head>
<body>
<input type="button" value="Get" onclick="getData()">
<div id="content"></div>
</body>
</html>