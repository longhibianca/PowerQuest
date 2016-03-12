<%-- 
    Document   : CadastroConteudo
    Created on : 07/10/2015, 15:17:44
    Author     : Bianca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>PowerQuest Cadastro Professor</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
        <link rel="stylesheet" type="text/css" href="main.css" />
        <!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
        <!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
    </head>
    <body>
        <form method="post" action="OperacoesConteudo">
            <%@ include file="/WEB-INF/jspf/headerProfessor.jspf" %>
            <!-- Main -->
            <section id="main" class="wrapper style1 special">
         <!--  <section id="four" class="wrapper style2 special">-->
               <div class="container">
                    <header class="major special">
                        <h2>Cadastre seu conteúdo</h2>
      
                    </header>
                    <div class="inner">
                        <div class="container 75%">
                            <div class="row uniform 50%">
                                <div class="6u">
                                    <input name="codigo_conteudo" placeholder="Codigo Conteudo" type="text" />
                                </div>
                                <div class="6u">
                                    <input name="conteudo_nome" placeholder="Nome" type="text" />
                                </div>
                                <div class="6u">
                                    <input name="cod_disciplina" placeholder="Codigo Disciplina" type="text" />
                                </div>
                               
                            </div> 
                        </div>
                        <ul class="actions">
                            <li><input type="submit" class="special" value="Salvar" /></li>
                        </ul>
                    </div>
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
