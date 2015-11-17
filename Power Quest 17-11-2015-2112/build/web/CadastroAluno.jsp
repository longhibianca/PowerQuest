
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
        <form method="post" action="CadastroAluno">
            <div id="main">

                <header>
                    <nav>
                        <div id="menubar">
                            <ul id="nav">
                                <li class="current"><a href="CadastroProfessor.jsp">Cadastro Professor</a></li>
                                <li class="current"><a href="CadastroAluno.jsp">Cadastro Aluno</a></li>
                                <li class="current"><a href="Login.jsp">Login Professor</a></li>
                                <li class="current"><a href="ExcluirConta.jsp">Excluir Conta</a></li>
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
                        Cadastro de Alunos
                    </div>
                    <div id="cadastro_prof">
                        <table>
                            <tr>
                                <td>
                                    Nome:
                                </td>
                                <td>
                                    <input type="text" name="nome_usuario" value="" />
                                </td>
                            </tr>
                            <br />
                        
                            <br />
                            <tr>
                                <td>
                                    CPF:
                                </td>
                                <td>
                                    <input type="text" name="cpf_usuario" value="" />
                                </td>
                            </tr>
                            <br />
                            <tr>
                                <td>
                                    Matrícula:
                                </td>
                                <td>
                                    <input type="text" name="matricula" value="" />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Senha:
                                </td>
                                <td>
                                    <input type="password" name="senha_aluno" value="" />
                                </td>
                            </tr>
                        </table>
                        <br />
                        <input type="submit" value="Salvar" name="BotaoCadProf" />
                        <br />
                       <!-- <asp:GridView ID="GridView1" runat="server">
                        </asp:GridView>-->
                    </div>
                </div>
                <!--close site_content-->

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