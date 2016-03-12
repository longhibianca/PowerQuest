<%-- 
    Document   : PaginaInicial
    Created on : 01/10/2015, 13:54:34
    Author     : Bianca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>PowerQuest</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
        <link rel="stylesheet" type="text/css" href="main.css" />
        <!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
        <!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
    </head>
    <body class="landing">
        <form action="PagInicial.jsp">
            <!-- Header -->
            <header id="header" class="alt">
                <h1><a href="index.html">Bem-vindo(a)</a></h1>
                <a href="#nav">
                    Menu
                </a>
            </header>  
            <!-- Nav -->
            <nav id="nav">
                <ul class="links">
                    <li><a href="PaginaInicial.jsp">Home</a></li>
                    <li><a href="CadastroAluno.jsp">Cadastro aluno</a></li>
                </ul>
            </nav>
            <!-- Banner -->
            <section id="banner">
                <i class="icon fa-diamond"></i>
                <h2>PowerQuest</h2>
                <p>frase de efeito</p>
                <ul class="actions">
                    <li><a href="#" class="button big special">Login</a></li>
                </ul>
            </section>
            <!-- One -->
            <section id="one" class="wrapper style1">
                <div class="inner">
                    <article class="feature left">
                        <span class="image"><img src="http://static.tumblr.com/v1nfa2x/ocMnizo7r/estudo.jpg" alt="" /></span>
                        <div class="content">
                            <h2> titulo do texto que temos q colocar</h2>
                            <p>Texto q temos q colocar</p>
                        </div>
                    </article>
                    <article class="feature right">
                        <span class="image"><img src="https://ap.imagensbrasil.org/images/selecao_professores.jpg" alt=""></span>
                        <div class="content">
                            <h2>titulo sobre o texto de professores</h2>
                            <p>Texto falando dos professores</p>

                        </div>
                    </article>
                </div>
            </section>
        </form>

        <!-- Four -->
        <section id="four" class="wrapper style2 special">
            <div class="inner">
                <header class="major narrow">
                    <h2>Login</h2>
                    <p>Faça seu login aqui</p>
                </header>
                <form method="post" action="Login">
                    <div class="container 75%">
                        <div class="row uniform 50%">
                            <div class="6u">
                                <input name="txtId" placeholder="Matrícula" type="text" />
                            </div>
                            <div class="6u">
                                <input name="txtSenha" placeholder="Senha" type="password" />
                            </div>
                        </div> 
                    </div>
                    <ul class="actions">
                        <li><input type="submit" class="special" value="Entrar" /></li>
                    </ul>
                </form>
            </div>
        </section>
        <footer id="footer">
            <div class="inner">

            </div>
        </footer>
        <!-- Scripts -->
        <script src="jquery.min.js"></script>
        <script src="skel.min.js"></script>
        <script src="util.js"></script>
        <!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
        <script src="main.js"></script>
    </form>
</body>
</html>
