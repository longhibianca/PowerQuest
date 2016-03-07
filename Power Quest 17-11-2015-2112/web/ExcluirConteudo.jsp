<%-- 
    Document   : ExcluirConteudo
    Created on : 13/10/2015, 22:17:36
    Author     : Bianca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>PowerQuest Excluir Conteudo</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
        <link rel="stylesheet" type="text/css" href="main.css" />
        <!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
        <!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
    </head>
    <body>
        <form method="post" action="ExcluirConteudo">
            <header id="header">
                <h1><a href="PaginaInicial.jsp">PowerQuest</a></h1>
                <!--<a href="#nav">Menu</a>-->
            </header>
            <!-- Main -->
            <section id="main" class="wrapper style1 special">
         <!--  <section id="four" class="wrapper style2 special">-->
               <div class="container">
                    <header class="major special">
                        <h2>Excluir conteúdo</h2>
      
                    </header>
                    <div class="inner">
                        <div class="container 75%">
                            <div class="row uniform 50%">
                                <div class="6u">
                                    <input name="codigo_conteudo" placeholder="Codigo Conteudo" type="text" />
                                </div>
                              
  
                            </div> 
                        </div>
                        <ul class="actions">
                            <li><input type="submit" class="special" value="Excluir" /></li>
                        </ul>
                    </div>
                </div>
            </section>            
        </form>
    </body>

</html>
