<%-- 
    Document   : MenuProfessor
    Created on : 03/10/2015, 22:47:42
    Author     : Bianca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>PowerQuest Menu Professor</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
        <link rel="stylesheet" type="text/css" href="main.css" />
        <!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
        <!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
    </head>
    <body>
        <form id="form1" runat="server">
            <header id="header">
                <h1><a href="PaginaInicial.jsp">PowerQuest</a></h1>
                <a href="#nav">Menu</a>
            </header>
            <!-- nav -->
            <nav id="nav">
                <ul class="links">
                    <li><a href="CadastroDisciplina.jsp">Cadastro de disciplinas</a></li>
                    <li><a href="CadastroConteudo.jsp">Cadastro de conteúdos</a></li>
                    <li><a href="CadastroPergunta.jsp">Cadastro de perguntas</a></li>
                    <li><a href="ExcluirDisciplina.jsp">Excluir disciplina</a></li>
                    <li><a href="ExcluirConteudo.jsp">Excluir conteúdo</a></li>
                    <li><a href="ExcluirPergunta.jsp">Excluir pergunta</a></li>
                </ul>
            </nav>
            <!-- Main -->
            <section id="main" class="wrapper style1 special">
                <!--  <section id="four" class="wrapper style2 special">-->
                <div class="container">
                    <header class="major special">
                        <h2>Página do Professor</h2>
                        <p>Página em construção</p>
                    </header>
                </div>
            </section>
            <!-- Scripts -->
            <script src="jquery.min.js"></script>
            <script src="skel.min.js"></script>
            <script src="util.js"></script>
            <!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
            <script src="main.js"></script>
        </form>
    </body>
</html>