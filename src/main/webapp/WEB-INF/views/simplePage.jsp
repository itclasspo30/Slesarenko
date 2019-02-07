<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="<c:url value="/css/style02.css"/>"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Начальная страница</title>
    </head>
    <body>
        <header>
            <a href="/"><img alt="Логотип" id="top-image" src="<c:url value="/img/logo-todo.png"/>"/></a>
        </header>
        
        <div id="main">
            <aside class="leftAside">
                <h2>Больше целей!</h2>
                <p>Добавляй цель и она появится в списке активных!</p>
                <p>Выполненные цели ты найдешь в архиве</p>
            </aside>
            <section>
                <article>
                    <h1><c:out value=" ${requestScope.message}" /></h1>
                    <div class="text-article">
                        <h3>Списки целей:</h3>
                        <form method="POST" action="showEnable">
                            <p><button type="submit"><ins>_Смотреть активные_</ins></button></p>
                        </form>
                        <form method="POST" action="showDisable">
                            <p><button type="submit"><ins>__ Смотреть aрхив __</ins></button></p>
                        </form>
                    </div>
                </article>
            </section>
        </div>
    <footer>
            <div>
                <span>Самое странное ToDo-приложение JAVA EE :)</span>
            </div>
        </footer>
    </body>
</html>