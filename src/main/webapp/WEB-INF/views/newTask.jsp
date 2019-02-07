<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="<c:url value="/css/style02.css"/>"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Новая цель</title>
    </head>
    <body>
        <header>
            <a href="/"><img alt="Логотип" id="top-image" src="<c:url value="/img/logo-todo.png"/>"/></a>
        </header>
        
        <div id="main">
            <aside class="leftAside">
                <h2>Больше целей!</h2>
                <p>Добавляй цель и она появится в списке активных!</p>
            </aside>
            <section>
                <article>
                    <h1>Что планируем?</h1>
                    <div class="text-article">
                    
                        <form method="POST" action="addTask">
                            <p><input type="text" name="taskText" id="taskText"/></p>
                            <p><button type="submit">Добавить цель</button></p>
                        </form>
                    </div>
                </article>
            </section>
        </div>
    <footer>
            <div>
                <span>Самое странное ToDo-приложение JAVA EE :)</span>
                <span><a target="_blanc" href="index.jsp">На главную</a></span>
            </div>
        </footer>
    </body>
</html>