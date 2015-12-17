<%-- 
    Document   : CadastroPergunta
    Created on : 07/10/2015, 19:27:10
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
        <form method="post" action="OperacoesPergunta">
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
                        Cadastro de Perguntas
                    </div>
                    <div id="cadastro_prof">
                        <table>
                            <tr>
                                <td>
                                    Enunciado:
                                </td>
                                <td>
                                    <textarea name="enunciado" rows="10" cols="45">
                                    </textarea>
                                  
                                   <!-- <input type="text" name="enunciado" value="" Height="500px" Width="600px"/>-->
                                </td>
                            </tr>
                            <br />
                            <tr>
                                <td>
                                    Alternativas:
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    a)
                                </td>
                                <td>
                                    <textarea name="alternativa_a" rows="10" cols="45">
                                    </textarea>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    b)
                                </td>
                                <td>
                                    <textarea name="alternativa_b" rows="10" cols="45">
                                    </textarea>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    c)
                                </td>
                                <td>
                                    <textarea name="alternativa_c" rows="10" cols="45">
                                    </textarea>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    d)
                                </td>
                                <td>
                                    <textarea name="alternativa_d" rows="10" cols="45">
                                    </textarea>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    e)
                                </td>
                                <td>
                                    <textarea name="alternativa_e" rows="10" cols="45">
                                    </textarea>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Resposta correta:
                                </td>
                                <td>
                                    <textarea name="resp_correta" rows="10" cols="45">
                                    </textarea>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Código da pergunta:
                                </td>
                                <td>
                                    <input type="text" name="cod_perg" value="" />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Código conteúdo:
                                </td>
                                <td>
                                    <input type="text" name="codigo_conteudo" value="" />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Código disciplina:
                                </td>
                                <td>
                                    <input type="text" name="cod_disciplina" value="" />
                                </td>
                            </tr>
                            <br />
                        </table>
                        <br />
                        <input type="submit" value="Salvar" name="BotaoCadPerg" />
                        <br />
                        <!-- <asp:GridView ID="GridView1" runat="server">
                         </asp:GridView>-->
                    </div>
                </div>
                <!--close site_content-->
                <a href="MenuProfessor.jsp">Voltar</a>
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
