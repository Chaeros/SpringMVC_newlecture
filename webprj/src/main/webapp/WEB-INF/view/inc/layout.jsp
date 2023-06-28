<!-- WEB-INF 내부의 폴더에는 클라이언트가 접속을 할 수 없다. 따라서 view폴더를 만들어주고 안에 jsp 파일을 넣은것 -->
<!-- 단, 클라이언트가 접속하지 못할뿐, Controller에서는 접근할 수 있다. 그래야 Controller에서 불러올 수 있으니까. -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>

<head>
    <title>코딩 전문가를 만들기 위한 온라인 강의 시스템</title>
    <meta charset="UTF-8">
    <title>공지사항목록</title>

    <link href="/css/layout.css" type="text/css" rel="stylesheet" />
    <link href="/css/index.css" type="text/css" rel="stylesheet" />
</head>

<body>
    <!-- header 부분 -->
	<tiles:insertAttribute name="header"/>

    <!-- --------------------------- <body> --------------------------------------- -->
	<tiles:insertAttribute name="body"/>
   
    <!-- ------------------- <footer> --------------------------------------- -->
	<tiles:insertAttribute name="footer"/>


</body>

</html>