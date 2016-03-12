<%-- 
    Document   : CadastroProfessor
    Created on : 03/10/2015, 15:44:27
    Author     : Bianca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>PowerQuest Cadastro Aluno</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
        <link rel="stylesheet" type="text/css" href="main.css" />
        <!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
        <!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
    </head>
    <body>
        <form method="post" action="OperacoesAluno">
            <header id="header">
                <h1><a href="PaginaInicial.jsp">PowerQuest</a></h1>
                <!--<a href="#nav">Menu</a>-->
            </header>
            <!-- Main -->
            <section id="main" class="wrapper style1 special">
         <!--  <section id="four" class="wrapper style2 special">-->
               <div class="container">
                    <header class="major special">
                        <h2>Registre-se</h2>
                        <p>Faça gratuitamente seu cadastro</p>
                    </header>
                    <div class="inner">
                        <div class="container 75%">
                            <div class="row uniform 50%">
                                <div class="6u">
                                    <input name="nome" placeholder="Nome" type="text" />
                                </div>
                                <div class="6u">
                                    <input name="cpf" placeholder="CPF" type="text" />
                                </div>
                                <div class="6u">
                                    <input name="matricula" placeholder="Identificador**" type="text" />
                                </div>
                                <div class="6u">
                                    <input name="senha" placeholder="Senha" type="password" />
                                </div>
                            </div> 
                        </div>
                        <ul class="actions">
                            <li><input type="submit" class="special" value="Salvar" /></li>
                        </ul>
                    </div>
                </div>
            </section>            
        </form>
    </body>

</html>

