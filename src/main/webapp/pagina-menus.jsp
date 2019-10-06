<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>pagina menus</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="assets/css/Contact-Form-Clean.css">
    <link rel="stylesheet" href="assets/css/Login-Form-Dark.css">
    <link rel="stylesheet" href="assets/css/sidebar-1.css">
    <link rel="stylesheet" href="assets/css/Sidebar-Menu-1.css">
    <link rel="stylesheet" href="assets/css/Sidebar-Menu.css">
    <link rel="stylesheet" href="assets/css/sidebar.css">
    <link rel="stylesheet" href="assets/css/styles.css">
</head>

<body style="background-color: rgb(241,247,252);">
    <div id="wrapper"><div id="sidebar-wrapper">
    <ul class="sidebar-nav">
        <li class="sidebar-brand"><a href="#" onclick="judocas()">JUDOCAS</a></li>
        <li class="active">
                        <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false">
                            <i class=""></i>
                            Dojos
                        </a>
                        <ul class="collapse list-unstyled" id="homeSubmenu">
                            <li><a href="#" onclick="cadastrarDojo()">Cadastrar dojo</a></li>
                            <li><a href="#" onclick="administrarDojo()">Administrar dojo</a></li>
                        </ul>
                    </li>
        <li class="active">
                        <a href="#homeSubmenu2" data-toggle="collapse" aria-expanded="false">
                            <i class=""></i>
                            Professores
                        </a>
                        <ul class="collapse list-unstyled" id="homeSubmenu2">
                            <li><a href="#" onclick="cadastrarProfessor()">Cadastrar professor</a></li>
                            <li><a href="#" onclick="administrarProfessor()">Administrar professor</a></li>
                        </ul>
                    </li>
        <li class="active">
                        <a href="#homeSubmenu3" data-toggle="collapse" aria-expanded="false">
                            <i class=""></i>
                            Alunos
                        </a>
                        <ul class="collapse list-unstyled" id="homeSubmenu3">
                            <li><a href="#" onclick="cadastrarAluno()">Cadastrar aluno</a></li>
                            <li><a href="#" onclick="administrarAluno()">Administrar aluno</a></li>
                        </ul>
                    </li>
    </ul>
</div>
        <div class="page-content-wrapper">
            <div class="container-fluid" id="padrao">
                <div id="bem_vindo" style="/*display: none;*/"><a class="btn btn-link" role="button" id="menu-toggle-bem-vindo" href="#menu-toggle-bem-vindo"><i class="fa fa-bars" style="color: rgb(0,0,0);"></i></a>
                    <div class="row">
                        <div class="col-md-12">
                            <div>
                                <h1 class="text-center" style="margin-bottom: 20px;">Bem vindo, &lt;nome da pessoa&gt;</h1>
                            </div>
                            <p class="text-center" style="color: rgb(0,0,0);">Selecione no canto esquerdo a opção desejada</p>
                        </div>
                    </div>
                    <div class="row text-center">
                        <div class="col"><img src="assets/img/pagina_inicial.jpg" height="500px" width="75%" style="filter: blur(0px) contrast(100%) grayscale(0%) hue-rotate(0deg) invert(0%);"></div>
                    </div>
                </div>
                <div id="cadastrar_dojo" style="display: none;/*width: 100%;*/"><a class="btn btn-link" role="button" id="menu-toggle-cadastrar-dojo" href="#menu-toggle2"><i class="fa fa-bars" style="color: rgb(0,0,0);"></i></a>
                    <div class="row" style="width: 100%;">
                        <div class="col-md-12" style="margin-bottom: 50px;">
                            <div>
                                <h1 class="text-center" style="margin-bottom: 20px;">CADASTRAR DOJO</h1>
                            </div>
                        </div>
                        <div class="col-xl-11 m-auto">
                            <form method="post" style="background-color: rgb(241,247,252);">
                                <div class="form-group"><input class="form-control" type="text" name="nome_dojo" placeholder="Nome do dojo"></div>
                                <div class="form-group"><input class="form-control" type="text" name="cnpj" placeholder="CNPJ"></div>
                                <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="telefone1" placeholder="Telefone 1"></div>
                                <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="telefone2" placeholder="Telefone 2"></div>
                                <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="rua_dojo" placeholder="Rua"></div>
                                <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="numero_dojo" placeholder="Número"></div>
                                <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="bairro_dojo" placeholder="Bairro"></div>
                                <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="estado_dojo" placeholder="Estado"></div>
                                <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="cidade_dojo" placeholder="Cidade"></div>
                                <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="cep_dojo" placeholder="CEP"></div>
                                <div class="form-group text-center"><button class="btn btn-primary" type="submit" style="background-color: rgb(0,0,0);font-size: 20px;padding: 8px 14px;margin-top: 50px;">CADASTRAR</button></div>
                            </form>
                        </div>
                    </div>
                </div>
                <div id="administrar_dojo" style="/*display: none;*/"><a class="btn btn-link" role="button" id="menu-toggle-administrar-dojo" href="#menu-toggle-administrar-dojo"><i class="fa fa-bars" style="color: rgb(0,0,0);"></i></a>
                    <div class="row">
                        <div class="col-md-12">
                            <div>
                                <h1 class="text-center" style="margin-bottom: 20px;">ADMINISTRAR ALUNO</h1>
                            </div>
                        </div>
                        <div class="col-xl-11 m-auto" style="filter: blur(0px);">
                            <form method="post" style="background-color: rgb(241,247,252);margin-bottom: 50px;margin-top: 40px;">
                                <div class="form-group d-inline-block" style="width: 82%;"><input class="form-control" type="text" name="nome_dojo_buscar" placeholder="Nome do dojo"></div>
                                <div class="form-group text-center d-inline-block float-none" style="margin-left: 15px;"><button class="btn btn-primary" type="submit" style="background-color: rgb(0,0,0);font-size: 20px;margin-top: 0px;padding-top: 3px;padding-bottom: 3px;">BUSCAR</button></div>
                            </form>
                        </div>
                        <div class="col-xl-11 m-auto">
                            <form method="post" style="background-color: rgb(241,247,252);">
                                <div class="form-group"><input class="form-control" type="text" name="nome_dojo" placeholder="Nome do dojo" disabled=""></div>
                                <div class="form-group"><input class="form-control" type="text" name="cnpj" placeholder="CNPJ" disabled=""></div>
                                <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="telefone1" placeholder="Telefone 1" disabled=""></div>
                                <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="telefone2" placeholder="Telefone 2" disabled=""></div>
                                <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="rua_dojo" placeholder="Rua" disabled=""></div>
                                <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="numero_dojo" placeholder="Número" disabled=""></div>
                                <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="bairro_dojo" placeholder="Bairro" disabled=""></div>
                                <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="estado_dojo" placeholder="Estado" disabled=""></div>
                                <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="cidade_dojo" placeholder="Cidade" disabled=""></div>
                                <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="cep_dojo" placeholder="CEP" disabled=""></div>
                                <div class="form-group text-center"><button class="btn btn-primary" type="submit" style="background-color: rgb(0,0,0);font-size: 20px;padding: 8px 14px;margin-top: 50px;">EDITAR</button></div>
                            </form>
                        </div>
                    </div>
                </div>
                <div id="cadastrar_professor" style="display: none;"><a class="btn btn-link" role="button" id="menu-toggle-cadastrar-professor" href="#menu-toggle-cadastrar-professor"><i class="fa fa-bars" style="color: rgb(0,0,0);"></i></a>
                    <div class="row">
                        <div class="col-md-12">
                            <div>
                                <h1 class="text-center" style="margin-bottom: 20px;">CADASTRAR PROFESSOR</h1>
                            </div>
                        </div>
                    </div>
                </div>
                <div id="administrar_professor" style="display: none;"><a class="btn btn-link" role="button" id="menu-toggle-administrar-professor" href="#menu-toggle-administrar-professor"><i class="fa fa-bars" style="color: rgb(0,0,0);"></i></a>
                    <div class="row">
                        <div class="col-md-12">
                            <div>
                                <h1 class="text-center" style="margin-bottom: 20px;">ADMINISTRAR PROFESSOR</h1>
                            </div>
                        </div>
                    </div>
                </div>
                <div id="cadastrar_aluno" style="display: none;"><a class="btn btn-link" role="button" id="menu-toggle-cadastrar-aluno" href="#menu-toggle-cadastrar-aluno"><i class="fa fa-bars" style="color: rgb(0,0,0);"></i></a>
                    <div class="row" style="width: 100%;">
                        <div class="col-md-12" style="margin-bottom: 50px;">
                            <div>
                                <h1 class="text-center" style="margin-bottom: 20px;">CADASTRAR ALUNO</h1>
                            </div>
                        </div>
                        <div class="col-xl-11 m-auto">
                            <form method="post" style="background-color: rgb(241,247,252);">
                                <div class="form-group"><input class="form-control" type="text" name="nome_dojo" placeholder="Nome do aluno"></div>
                                <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="registro_cbj" placeholder="Registro CBJ"></div>
                                <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="rg" placeholder="RG"></div>
                                <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="cpf" placeholder="CPF"></div>
                                <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="celular_aluno" placeholder="Celular"></div>
                                <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="rua_aluno" placeholder="Rua"></div>
                                <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="numero_aluno" placeholder="Número"></div>
                                <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="bairro_aluno" placeholder="Bairro"></div>
                                <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="estado_aluno" placeholder="Estado"></div>
                                <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="cidade_aluno" placeholder="Cidade"></div>
                                <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="cep_aluno" placeholder="CEP"></div>
                                <div class="form-group text-center"><button class="btn btn-primary" type="submit" style="background-color: rgb(0,0,0);font-size: 20px;padding: 8px 14px;margin-top: 50px;">CADASTRAR</button></div>
                            </form>
                        </div>
                    </div>
                </div>
                <div id="administrar_aluno" style="/*display: none;*/"><a class="btn btn-link" role="button" id="menu-toggle-administrar-aluno" href="#menu-toggle-administrar-aluno"><i class="fa fa-bars" style="color: rgb(0,0,0);"></i></a>
                    <div class="row">
                        <div class="col-md-12">
                            <div>
                                <h1 class="text-center" style="margin-bottom: 20px;">ADMINISTRAR DOJO</h1>
                            </div>
                        </div>
                        <div class="col-xl-11 m-auto" style="filter: blur(0px);">
                            <form method="post" style="background-color: rgb(241,247,252);margin-bottom: 50px;margin-top: 40px;">
                                <div class="form-group d-inline-block" style="width: 82%;"><input class="form-control" type="text" name="nome_aluno_buscar" placeholder="Nome do aluno"></div>
                                <div class="form-group text-center d-inline-block float-none" style="margin-left: 15px;"><button class="btn btn-primary" type="submit" style="background-color: rgb(0,0,0);font-size: 20px;margin-top: 0px;padding-top: 3px;padding-bottom: 3px;">BUSCAR</button></div>
                            </form>
                        </div>
                        <div class="col-xl-11 m-auto">
                            <form method="post" style="background-color: rgb(241,247,252);">
                                <div class="form-group"><input class="form-control" type="text" name="nome_dojo" placeholder="Nome do aluno" disabled=""></div>
                                <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="registro_cbj" placeholder="Registro CBJ" disabled=""></div>
                                <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="rg" placeholder="RG" disabled=""></div>
                                <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="cpf" placeholder="CPF" disabled=""></div>
                                <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="celular_aluno" placeholder="Celular" disabled=""></div>
                                <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="rua_aluno" placeholder="Rua" disabled=""></div>
                                <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="numero_aluno" placeholder="Número" disabled=""></div>
                                <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="bairro_aluno" placeholder="Bairro" disabled=""></div>
                                <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="estado_aluno" placeholder="Estado" disabled=""></div>
                                <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="cidade_aluno" placeholder="Cidade" disabled=""></div>
                                <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="cep_aluno" placeholder="CEP" disabled=""></div>
                                <div class="form-group text-center"><button class="btn btn-primary" type="submit" style="background-color: rgb(0,0,0);font-size: 20px;padding: 8px 14px;margin-top: 50px;">EDITAR</button></div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/mudar_divs.js"></script>
    <script src="assets/js/Sidebar-Menu.js"></script>
</body>

</html>