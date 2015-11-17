<%-- 
    Document   : PaginaInicial
    Created on : 01/10/2015, 13:54:34
    Author     : Bianca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head runat="server">
        <title>Power Quest</title>
        <meta name="description" content="website description" />
        <meta name="keywords" content="website keywords, website keywords" />
        <meta http-equiv="content-type" content="text/html; charset=windows-1252" />
        <link rel="stylesheet" type="text/css" href="stylePowerQuest.css" />
        <!-- modernizr enables HTML5 elements and feature detects -->
    </head>
    <body>
        <form action="PagInicial.jsp">
            <div id="main">
                <header>
                    <div id="menubar">
                        <ul id="nav">
                            <li class="current"><a href="CadastroProfessor.jsp">Cadastro Professor</a></li>
                            <li class="current"><a href="CadastroAluno.jsp">Cadastro Aluno</a></li>
                            <li class="current"><a href="Login.jsp">Login Professor</a></li>
                            <li class="current"><a href="LoginAluno.jsp">Login Aluno</a></li>
                            <li class="current"><a href="Questionario.jsp">Questionário</a></li>
                        </ul>
                    </div>
                    <div id="strapline">
                        <div id="welcome_slogan">
                            <h3>Power<span>Quest</span></h3>
                        </div>
                        <!--close welcome_slogan-->
                    </div>
                    <!--close strapline-->
                </header>

                <div id="site_content">

                    <div class="sidebar_container">
                        <div class="sidebar">
                            <div class="sidebar_item">
                                <h2>Sobre</h2>
                                <p>Bem-vindo ao Power Quest, um questionário online, contendo diversas disciplinas, e que te ajudará a estudar para provas e vestibulares.</p>
                            </div>
                            <!--close sidebar_item-->
                        </div>
                        <!--close sidebar-->
                        <div class="sidebar">
                            <div class="sidebar_item">
                                <h2></h2>
                                <h3></h3>
                                <p></p>
                            </div>
                            <!--close sidebar_item-->
                        </div>
                        <!--close sidebar-->
                        <div class="sidebar">
                            <div class="sidebar_item">
                                <h3></h3>
                                <p></p>
                            </div>
                            <!--close sidebar_item-->
                        </div>
                        <!--close sidebar-->
                        <div class="sidebar">
                            <div class="sidebar_item">
                                <h3></h3>
                                <p></p>
                            </div>
                            <!--close sidebar_item-->
                        </div>
                        <!--close sidebar-->
                        <div class="sidebar">
                            <div class="sidebar_item">
                                <h2></h2>
                                <p></p>
                                <p></p>
                            </div>
                            <!--close sidebar_item-->
                        </div>
                        <!--close sidebar-->
                    </div>
                    <div class="slideshow">
                        <ul class="slideshow">
                            <li class="show">
                                <img width="680" height="450" src="http://static.tumblr.com/v1nfa2x/ocMnizo7r/estudo.jpg" alt="&quot;Enter your caption here&quot;" /></li>
                            <li>
                                <img width="680" height="450" src="images/home_2.jpg" alt="&quot;Enter your caption here&quot;" /></li>
                        </ul>
                    </div>

                    <div id="content">
                        <div class="content_item">
                            <div class="form_settings">
                                <h2></h2>
                                <p style="padding-bottom: 15px;"></p>
                                <p><span></span><input class="contact" type="text" name="your_name" value="" /></p>
                                <p><span></span><input class="contact" type="text" name="your_email" value="" /></p>
                                <p><span></span></p>
                                <p style="padding: 10px 0 10px 0;"></p>
                                <p><span></span><input type="text" name="user_answer" class="contact" /><input type="hidden" name="answer" value="4d76fe9775" /></p>
                                <p style="padding-top: 15px"><span>&nbsp;</span></p>
                            </div>
                            <!--close form_settings-->
                        </div>
                        <!--close content_item-->
                    </div>
                    <!--close content-->
                </div>
                <!--close site_content-->

                <footer>
                    <a href="index.html">Home</a>  <a href=""></a>  <a href=""></a>  <a href=""></a> <a href=""></a><br />
                    <br />
                </footer>
            </div>
        </form>
    </body>
</html>
