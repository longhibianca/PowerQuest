<%-- 
    Document   : ExcluirProf
    Created on : 13/10/2015, 21:15:48
    Author     : Bianca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head id="Head1" runat="server">
        <title>Power Quest</title>
        <meta name="description" content="website description" />
        <meta name="keywords" content="website keywords, website keywords" />
        <meta http-equiv="content-type" content="text/html; charset=windows-1252" />
        <link rel="stylesheet" type="text/css" href="stylePowerQuest.css" />
        <!-- modernizr enables HTML5 elements and feature detects -->

    </head>
    <body>
        <form method="post" action="ExcluirProf">
            <div id="main">

                <header>
                    <nav>
                        <div id="menubar">
                            <ul id="nav">
                                <li class="current"><a href="CadastroProfessor.jsp">Cadastro Professor</a></li>
                                <li class="current"><a href="CadastroAluno.jsp">Cadastro Aluno</a></li>
                                <li class="current"><a href="Login.jsp">Login Professor</a></li>
                                <li class="current"><a href="ExcluirProf.jsp">Excluir Conta</a></li>
                                <li class="current"><a href="LoginAluno.jsp">Login Aluno</a></li>
                                <li class="current"><a href="Questionario.jsp">Questionário</a></li>
                            </ul>
                        </div>
                        <!--close menubar-->
                    </nav>
                    <div id="strapline">
                        <div id="welcome_slogan">
                            <h3>Power<span>Quest</span></h3>
                        </div>
                        <!--close welcome_slogan-->
                    </div>
                    <!--close strapline-->
                </header>

                <div id="site_content">
                    <div id="prof">
                        Excluir Conta
                    </div>
                    <div id="cadastro_prof">
                        <table>
                            <tr>
                                <td>
                                    Siape:
                                </td>
                                <td>
                                    <input type="text" name="siape" value="" />
                                </td>
                            </tr>
                        </table>
                        <br />
                        <input type="submit" value="Excluir" name="BotaoExc" />
                        <br />
                        <!-- <asp:GridView ID="GridView1" runat="server">
                         </asp:GridView>-->
                    </div>
                </div>
                <!--close site_content-->
                <div>
                    <a href="MenuProfessor.jsp" id="voltar">Voltar</a>
                </div>
                <footer>
                    <a href="index.html">Home</a>  <a href=""></a><a href=""></a><a href=""></a><a href=""></a>
                    
                    <br />
                    <br />

                </footer>

            </div>
            <!--close main-->

        </form>
    </body>

</html>

