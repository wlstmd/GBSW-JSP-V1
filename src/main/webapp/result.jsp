<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="com.Crawling.Posts" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
     <link rel="stylesheet" href="./style.css">
    <title>크롤링 결과</title>
</head>
<body>
	<header>
		<nav>
			<ul>
				<li><a href="/JSP_PJT/popular">인기매물 불러오기</a></li>
				<li><a href="/JSP_PJT/worker">알바 불러오기</a></li>
			</ul>
		</nav>
	</header>
	<h1>크롤링 결과</h1>
    <ul>
        <% 
        @SuppressWarnings("unchecked")
        List<Posts> posts = (List<Posts>) request.getAttribute("posts");
        if (posts != null) {
            for (Posts post : posts) {
        %>
		<div class="border">
			<li>
	            <p>게시물 제목: <%= post.getTitle() %></p>
	            <p>가격: <%= post.getPrice() %></p>
	            <p>위치: <%= post.getRegion() %></p>
	            <p>조회수: <%= post.getCounts() %></p>
        	</li>
		</div>
        <% 
            } 
        } 
        %>
    </ul>
</body>
</html>
