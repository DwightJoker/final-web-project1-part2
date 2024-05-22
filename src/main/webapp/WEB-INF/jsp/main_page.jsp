<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>ГАВ</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<style>
body {
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 0;
}

header {
	background-color: #333;
	color: #fff;
	padding: 10px;
	text-align: center;
}

nav {
	background-color: #666;
	color: #fff;
	padding: 10px;
	display: flex;
	justify-content: space-between;
}

.profile-button {
	order: -1;
}

section {
	padding: 20px;
	overflow-y: auto;
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 0;
	justify-content: center;
	align-items: center;
	height: 100vh;
	flex-direction: column;
	background-image: url('images/cupra.jpg');
	background-size: cover;
	background-position: center;
}

article {
	margin-bottom: 20px;
}

footer {
	background-color: #333;
	color: #fff;
	padding: 10px;
	text-align: center;
	position: fixed;
	bottom: -130px;
	width: 100%;
	transition: bottom 0.3s;
}

footer:hover {
	bottom: 0;
}

.news-item {
	align-items: center;
	margin-bottom: 15px;
	padding-bottom: 15px;
	border-bottom: 1px solid #eee;
}

.img-fluid {
	width: 200px;
	height: 120px;
	margin-right: 20px;
}

.news-content {
	flex-grow: 1;
}

.news-title {
	color: #007bff;
	font-size: 20px;
}

.news-text {
	font-size: 14px;
	color: #FFFFFF;
}

.news-info {
	font-size: 12px;
	color: #999;
}
</style>
</head>
<body>
	<header>
		<h1>Главный Автомобильный Вестник</h1>
		<h2>Новости</h2>
	</header>

	<nav>
		<a href="Controller?command=go_to_profile_page">Редактировать
			данные аккаунта</a> <a href="Controller?command=do_log_out">Выйти из
			аккаунта</a> <a href="Controller?command=do_delete_user">Удалить
			аккаунт</a>
	</nav>

	<div class="admin-message" id="admin-message">
		<c:if test="${(sessionScope.user.role eq 'admin')}">
			<div class="users-list">

				<h2>Список Пользователей</h2>
				<select name="users" id="users">
					<option value="user1">Пользователь 1</option>
					<option value="user2">Пользователь 2</option>
					<option value="user3">Пользователь 3</option>

				</select>
				<button onclick="blockUser()">Блокировать пользователя</button>
			</div>
			<div class="news-list">
				<h2>Список статей</h2>
				<div class="news-item">
					<c:forEach var="news" items="${requestScope.mainNews}">
						<img src="${news.imgPath}" alt="Базовый курс Java"
							class="img-fluid">
						<div class="news-content">
							<h3 class="news-title">${news.title}</h3>
							<p class="news-text">${news.brief}</p>
							<p class="news-info">${news.info}</p>
							<button onclick="editNews()">Редактировать новость</button>
							<button onclick="deleteNews()">Удалить новость</button>
						</div>
					</c:forEach>
				</div>

			</div>
		</c:if>
	</div>

	<div class="user-message" id="user-message">
		<c:if test="${(sessionScope.user.role eq 'user')}">
			<div class="news-item">
				<c:forEach var="news" items="${requestScope.mainNews}">
					<img src="${news.imgPath}" alt="Базовый курс Java"
						class="img-fluid">
					<div class="news-content">
						<h3 class="news-title">${news.title}</h3>
						<p class="news-text">${news.brief}</p>
						<p class="news-info">${news.info}</p>
					</div>
				</c:forEach>
			</div>
		</c:if>
	</div>

	<div class="editor-message" id="editor-message">
		<c:if test="${(sessionScope.user.role eq 'editor')}">

			<c:forEach var="news" items="${requestScope.mainNews}">
				<img src="${news.imgPath}" class="img-fluid">
				<div class="news-content">
					<h3 class="news-title">${news.title}</h3>
					<p class="news-text">${news.brief}</p>
					<p class="news-info">${news.info}</p>
				</div>
			</c:forEach>


			<div class="news-list">
				<h2>Список статей</h2>
				<select name="news" id="news">
					<option value="news1">Новость 1</option>
					<option value="news2">Новость 2</option>
					<option value="news3">Новость 3</option>
				</select>
				<button onclick="editNews()">Редактировать новость</button>
				<button onclick="deleteNews()">Удалить новость</button>
			</div>
		</c:if>
	</div>

	<div class="error-message" id="error-message">
		<c:if test="${not (param.authError eq null) }">
			<c:out value="${param.authError}" />
		</c:if>
	</div>

</body>
</html>