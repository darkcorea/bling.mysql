<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>login main</title>
	<!-- Bootstrap core CSS -->
  		<link href="/resources/css/bootstrap.css" rel="stylesheet">
  	<!-- Bootstrap core JavaScript -->
  		<script src="/resources/js/jquery-3.6.0.min.js"></script>
		<script src="/resources/js/bootstrap.bundle.js"></script>
  	<!-- Bootsrap icon(cart, heart) -->
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
  	
  	
  	
  	<style>
  		section{
			max-width:1008px;
			margin:  0px auto;
		}
/*--------------- section-begin ---------------*/
		#loginBtn{
			background-color: #CB7878;
			border: none;
			width: 400px;
			height: 50px;
		}
		#loginBtn:hover{
			color: #CB7878;
			background-color: #ffffff;
			border: 1px solid #CB7878;
			width: 400px;
			height: 50px;
		}
		#login_Id,#login_Pw{
			border-top: none;
			border-left: none;
			border-right: none;
			width: 400px;
		}
		#btnDiv{
			position: relative;
			top: 40px;
			text-align: center;
		}
		#formText{
			position: relative;
			left: 123px;
		}
		#inputPw{
			position: relative;
			left: 123px;
		}
		#pwDiv{
			position: relative;
			top: 30px;
		}
		#searchSpan{
			margin: 0px 30px;
		}
		#searchA{
			text-decoration-line: none;
			color: #000000;	
		}
		#formDiv{
			height: 600px;
		}
		#caution{
			position: relative;
			left: 123px;
			top: 40px;
		}
		#cautionDiv{
			height: 50px;
		}
/*--------------- section-end ---------------*/
  	</style>
</head>
<body>

	<section>
		<div class="container" style="margin-top:200px;">
			<div class="row">
				<div class="col-0 col-sm-2 col-md-2 col-lg-2 col-xl-2">
				
				</div>
				<div class="col-12 col-sm-8 col-md-8 col-lg-8 col-xl-8" id="formDiv">
					<form name="form" action="/Ad_login/check2.do" method="post">
						<div id="pwDiv">	
							<div id="formText">
								<label for="login_Pw">???????????? ??????</label>
							</div>
							<div id="inputPw">
								<input id="login_Pw" name="pwd2" type="password">
								<span class="check"></span>
							</div>
						</div>
						<div id="cautionDiv">
							<c:if test="${msg == 'failure'}">
								<div id="caution" style="color: red;">??????????????? ?????? ?????? ???????????????.</div>
								<div id="caution" style="color: red;">??????????????? ????????? ????????? ?????????.</div>
							</c:if>
						</div>
						<div id="btnDiv">
							<input class="btn btn-primary" id="loginBtn" type="submit" value="?????????">
						</div>
					</form>
				</div>
				<div class="col-0 col-sm-2 col-md-2 col-lg-2 col-xl-2">
				</div>
			</div>
		</div>
		
	</section>
		
</body>
</html>