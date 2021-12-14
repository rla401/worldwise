<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css" />

<!-- <script>
	$("#modal_open_btn").click(function() {
		$("#modal").attr("style", "display:block");
	});

	$("#modal_close_btn").click(function() {
		$("#modal").attr("style", "display:none");
	});
</script> -->


<style>
#modal {
	display: none;
	position: relative;
	width: 100%;
	height: 100%;
	z-index: 1;
	display: none;
}

#modal h2 {
	margin: 0;
}

#modal button {
	display: inline-block;
	width: 100px;
	margin-left: calc(100% - 100px - 10px);
}

#modal .modal_content {
	width: 300px;
	margin: 100px auto;
	padding: 20px 10px;
	background: #fff;
	border: 2px solid #666;
}

#modal .modal_layer {
	position: fixed;
	top: 0;
	left: 0;
	width: 100%;
	height: 100%;
	background: rgba(0, 0, 0, 0.5);
	z-index: -1;
}

#test_content {
	display: none;
}
</style>

<body>


	<script>
		$(document).ready(function() {
			$("#modal_open_btn").click(function() {
				$("#modal").fadeIn();
			});

			$("#modal_close_btn").click(function() {
				$("#modal").fadeOut();
			});
		});
	</script>

	<form action="/google" method="post">

		<select name="argAreacd">
			<option value="00">전체</option>
			<option value="10">서울</option>
			<option value="20">경기</option>
			<option value="30">원주</option>
			<option value="40">평택</option>
			<option value="50">울산</option>
			<option value="60">대전</option>
			<option value="70">부산</option>
			<option value="80">광주</option>
			<option value="90">파주</option>
		</select> <br> <br> <input name="argGr" type="radio" value="00">
		<label>DATA</label> <input name="argGr" type="radio" value="01">
		<label>중간총계</label> <input name="argGr" type="radio" value="11">
		<label>총계</label> <input name="argGr" type="radio" value="A">
		<label>전체</label> <br /> <br /> <input type="radio" name="argDir"
			value="F"> <label>DATA우선</label> <input type="radio"
			name="argDir" value="R"> <label>총계우선</label> <br /> <br />
		<label>서울</label> <input name="seoul" type="text" size=1 maxlength=2 />
		<label>경기</label> <input name="gyeongi" type="text" size=1 maxlength=2 />
		<label>원주</label> <input name="wonju" type="text" size=1 maxlength=2 />
		<label>평택</label> <input name="pyeongtaek" type="text" size=1
			maxlength=2 /> <label>울산</label> <input name="ulsan" type="text"
			size=1 maxlength=2 /> <label>대전</label> <input name="daejun"
			type="text" size=1 maxlength=2 /> <label>부산</label> <input
			name="busan" type="text" size=1 maxlength=2 /> <label>광주</label> <input
			name="gwangju" type="text" size=1 maxlength=2 /> <label>파주</label> <input
			name="paju" type="text" size=1 maxlength=2 /> <br /> <br /> <label
			for="seoul">건수</label> <input name="argCnt" type="text" size=3
			maxlength=1000000000 /> <input type="submit" value="검색"></input> <input
			id="modal_open_btn" type="button" value="설정"> <input
			id="option" name="option" type="radio" value="0"> <label>설정적용</label>
		<br /> <label>UserId</label> <input type="text" name="userId" />
	</form>

	<div id="modal">
		<div class="modal_content">
			<form action="/modal" method="post" id="form" name="form" ><!-- target="iframe1" -->
				<label>UserId</label> 
				<input type="text" name="searchUserid" /> <br />
				<select name="argAreacd">
					<option value="00">전체</option>
					<option value="10"<c:if test= "${select.argAreacd == 10}">selected</c:if>>서울</option>
					<option value="20"<c:if test= "${select.argAreacd == 20}">selected</c:if>>경기</option>
					<option value="30"<c:if test= "${select.argAreacd == 30}">selected</c:if>>원주</option>
					<option value="40"<c:if test= "${select.argAreacd == 40}">selected</c:if>>평택</option>
					<option value="50"<c:if test= "${select.argAreacd == 50}">selected</c:if>>울산</option>
					<option value="60"<c:if test= "${select.argAreacd == 60}">selected</c:if>>대전</option>
					<option value="70"<c:if test= "${select.argAreacd == 70}">selected</c:if>>부산</option>
					<option value="80"<c:if test= "${select.argAreacd == 80}">selected</c:if>>광주</option>
					<option value="90"<c:if test= "${select.argAreacd == 90}">selected</c:if>>파주</option>
				</select> <br> <br> 
				 <input name="argGr" type="radio" value="00" <c:if test= "${select.argGr == '00'}">checked</c:if>> <label>DATA</label> 
				<input name="argGr" type="radio" value="01" <c:if test= "${select.argGr == '01'}">checked</c:if>> <label>중간총계</label> 
				<input name="argGr" type="radio" value="11" <c:if test= "${select.argGr == '11'}">checked</c:if>> <label>총계</label> 
				 <input name="argGr" type="radio" value="A" <c:if test= "${select.argGr ==  'A' }">checked</c:if>> <label>전체</label>  
				 
				<br /> <br /> 
				<input type="radio" name="argDir"value="F" <c:if test= "${select.argDir == 'F'}">checked</c:if>> <label>DATA우선</label> 
				<input type="radio"name="argDir" value="R" <c:if test= "${select.argDir == 'R'}">checked</c:if>> <label>총계우선</label> 
				
				<br /> <br />
				<label>서울</label> <input name="arg10" value ="${select.arg10 }"  type="text" size=1 maxlength=2 />
				<label>경기</label> <input name="arg20" value ="${select.arg20 }" type="text" size=1 maxlength=2 />
				<label>원주</label> <input name="arg30" value ="${select.arg30 }" type="text" size=1 maxlength=2 />
				<label>평택</label> <input name="arg40" value ="${select.arg40 }" type="text" size=1 maxlength=2 />
				<label>울산</label> <input name="arg50" value ="${select.arg50 }" type="text" size=1 maxlength=2 />
				<label>대전</label> <input name="arg60" value ="${select.arg60 }" type="text" size=1 maxlength=2 />
				<label>부산</label> <input name="arg70" value ="${select.arg70 }" type="text" size=1 maxlength=2 />
				<label>광주</label> <input name="arg80" value ="${select.arg80 }" type="text" size=1 maxlength=2 />
				<label>파주</label> <input name="arg90" value ="${select.arg90 }" type="text" size=1 maxlength=2 />
				<br /> <br /> 
				<label for="seoul">건수</label> 
				<input name="argCnt" type="text" size=3 maxlength=1000000000  value ="${select.argCnt }"/> 
				<input type="submit" id="modal_close_btn" value="설정완료" />
				<!-- <iframe id="iframe1" name="iframe1" style="display:none"></iframe> -->

			</form>
			<div class="modal_layer"></div>
		</div>
	</div>

	<!-- controller의 파라미터 map에서는 jsp의 name이 key고 value는 동일하게 value이다 -->

	<table border="1">

		<thead>

			<tr>

				<th>areaCd</th>

				<th>cdNm</th>

				<th>regionArea</th>

				<th>col0</th>

				<th>col1</th>

				<th>col2</th>

				<th>col3</th>

				<th>col4</th>

				<th>col5</th>

				<th>col6</th>

				<th>col7</th>

				<th>col8</th>

				<th>col9</th>

			</tr>

		</thead>

		<c:forEach var="GoogleVO" items="${success}">

			<tr>

				<td><c:out value="${GoogleVO.areaCd }" /></td>

				<td><c:out value="${GoogleVO.cdNm }" /></td>

				<td><c:out value="${GoogleVO.regionArea }" /></td>

				<td><c:out value="${GoogleVO.col0 }" /></td>

				<td><c:out value="${GoogleVO.col1 }" /></td>

				<td><c:out value="${GoogleVO.col2 }" /></td>

				<td><c:out value="${GoogleVO.col3 }" /></td>

				<td><c:out value="${GoogleVO.col4 }" /></td>

				<td><c:out value="${GoogleVO.col5 }" /></td>

				<td><c:out value="${GoogleVO.col6 }" /></td>

				<td><c:out value="${GoogleVO.col7 }" /></td>

				<td><c:out value="${GoogleVO.col8 }" /></td>

				<td><c:out value="${GoogleVO.col9 }" /></td>

			</tr>

		</c:forEach>


		<c:forEach var="GoogleVO" items="${google}">

			<tr>

				<td><c:out value="${GoogleVO.areaCd }" /></td>

				<td><c:out value="${GoogleVO.cdNm }" /></td>

				<td><c:out value="${GoogleVO.regionArea }" /></td>

				<td><c:out value="${GoogleVO.col0 }" /></td>

				<td><c:out value="${GoogleVO.col1 }" /></td>

				<td><c:out value="${GoogleVO.col2 }" /></td>

				<td><c:out value="${GoogleVO.col3 }" /></td>

				<td><c:out value="${GoogleVO.col4 }" /></td>

				<td><c:out value="${GoogleVO.col5 }" /></td>

				<td><c:out value="${GoogleVO.col6 }" /></td>

				<td><c:out value="${GoogleVO.col7 }" /></td>

				<td><c:out value="${GoogleVO.col8 }" /></td>

				<td><c:out value="${GoogleVO.col9 }" /></td>

			</tr>

		</c:forEach>

		<c:forEach var="GoogleVO" items="${option}">

			<tr>

				<td><c:out value="${GoogleVO.areaCd }" /></td>

				<td><c:out value="${GoogleVO.cdNm }" /></td>

				<td><c:out value="${GoogleVO.regionArea }" /></td>

				<td><c:out value="${GoogleVO.col0 }" /></td>

				<td><c:out value="${GoogleVO.col1 }" /></td>

				<td><c:out value="${GoogleVO.col2 }" /></td>

				<td><c:out value="${GoogleVO.col3 }" /></td>

				<td><c:out value="${GoogleVO.col4 }" /></td>

				<td><c:out value="${GoogleVO.col5 }" /></td>

				<td><c:out value="${GoogleVO.col6 }" /></td>

				<td><c:out value="${GoogleVO.col7 }" /></td>

				<td><c:out value="${GoogleVO.col8 }" /></td>

				<td><c:out value="${GoogleVO.col9 }" /></td>

			</tr>

		</c:forEach>

	</table>


</body>
</html>