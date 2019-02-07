<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="<c:url value="/css/style02.css"/>"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Список целей</title>
    </head>
    <body>
        <header>
            <a href="/"><img alt="Логотип" id="top-image" src="<c:url value="/img/logo-todo.png"/>"/></a>
        </header>
        
        <div id="main">
            <aside class="leftAside">
                <h2>Действуй!</h2>
                <p>Отмечай выполненные цели и добавляй новые!</p>
            </aside>
            <section>
                <article>
                <table width="100%" border="0">
                  <tr>
                    <td><h1>До сих пор не выполнено:</h1></td> 
                    <td align="right">
                        <form method="GET" action="newTask">
                            <button type="submit">Добавить цель</button>
                        </form>
                    </td>
                    <td align="right">
                        <form method="POST" action="showDisable">
                            <button type="submit">Смотреть архив</button>
                        </form>
                    </td>
                    </tr>
                </table>
                   
                <div class="text-article">
                    <form method="GET" name='list' action='setDisable'>
                        <c:forEach items="${tasks}" var="task">
                            <h3><input type='checkbox' name='task' value='${task.taskText}'> ${task.taskText} </h3>
                        </c:forEach>
                        <p><button type="submit">Считать выполненным</button></p>
                    </form>
                </div>
                
                </article>
            </section>
        </div>
    <footer>
            <div>
            <table width="100%" border="0">
            <tr>
                <td><span>Самое странное ToDo-приложение JAVA EE :)</span></td>
                <td align="right"><span><a target="_blanc" href="index.jsp">На главную</a></span></td>
            </tr>
            </table>
            </div>
        </footer>
    </body>
</html>