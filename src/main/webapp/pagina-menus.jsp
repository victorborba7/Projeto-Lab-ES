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
                        <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12">
                            <div>
                                <h1 class="text-center" style="margin-bottom: 20px;">Bem vindo, &lt;nome da pessoa&gt;</h1>
                            </div>
                            <p class="text-center" style="color: rgb(0,0,0);">Selecione no canto esquerdo a opção desejada</p>
                        </div>
                    </div>
                    <div class="row text-center">
                        <div class="col"><img src="assets/img/pagina_inicial.png" height="500px" width="75%" style="filter: blur(0px) contrast(100%) grayscale(0%) hue-rotate(0deg) invert(0%);"></div>
                    </div>
                </div>
                <div id="cadastrar_dojo" style="display: none;width: 100%;"><a class="btn btn-link" role="button" id="menu-toggle-cadastrar-dojo" href="#menu-toggle2"><i class="fa fa-bars" style="color: rgb(0,0,0);"></i></a>
                    <div class="row" style="width: 100%;">
                        <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12" style="margin-bottom: 50px;">
                            <div>
                                <h1 class="text-center" style="margin-bottom: 20px;">CADASTRAR DOJO</h1>
                            </div>
                        </div>
                        <div class="col-sm-11 col-md-11 col-lg-11 col-xl-11 m-auto">
                            <form style="background-color: rgb(241,247,252);">
                                <div class="form-group"><input class="form-control" type="text" name="nome_dojo" placeholder="Nome do dojo"></div>
                                <div class="form-group"><input class="form-control" type="email" name="cnpj" placeholder="CNPJ"></div>
                                <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control d-xl-flex" type="email" name="telefone" placeholder="Telefone 1"></div>
                                <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="email" name="telefone" placeholder="Telefone 2"></div>
                                <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="email" name="telefone" placeholder="Rua"></div>
                                <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="email" name="telefone" placeholder="Número"></div>
                                <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="email" name="telefone" placeholder="Bairro"></div>
                                <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="email" name="telefone" placeholder="Estado"></div>
                                <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="email" name="telefone" placeholder="Cidade"></div>
                                <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="email" name="telefone" placeholder="CEP"></div>
                            </form>
							<div class="form-group text-center"><button class="btn btn-primary" style="background-color: rgb(0,0,0);font-size: 20px;padding: 8px 14px;margin-top: 50px;">CADASTRAR</button></div>
                        </div>
                    </div>
                </div>
                <div id="administrar_dojo" style="display: none;"><a class="btn btn-link" role="button" id="menu-toggle-administrar-dojo" href="#menu-toggle-administrar-dojo"><i class="fa fa-bars" style="color: rgb(0,0,0);"></i></a>
                    <div class="row">
                        <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12">
                            <div>
                                <h1 class="text-center" style="margin-bottom: 20px;">ADMINISTRAR DOJO</h1>
                            </div>
                        </div>
                        <div class="col-sm-11 col-md-11 col-lg-11 col-xl-11 m-auto" style="filter: blur(0px);">
							<div class="form-group d-inline-block" style="width: 82%;"><input class="form-control" type="text" name="nome_dojo_buscar" placeholder="Nome do dojo"></div>
							<div class="form-group text-center d-inline-block float-right" style="margin-left: 15px;"><button class="btn btn-primary" style="background-color: rgb(0,0,0);font-size: 20px;margin-top: 0px;padding-top: 3px;padding-bottom: 3px;">BUSCAR</button></div>
                        </div>
                        <div class="col-sm-11 col-md-11 col-lg-12 col-xl-11 m-auto">
                            <form style="background-color: rgb(241,247,252);">
                                <div class="form-group"><input class="form-control" type="text" name="nome_dojo" placeholder="Nome do dojo" disabled=""></div>
                                <div class="form-group"><input class="form-control" type="email" name="cnpj" placeholder="CNPJ" disabled=""></div>
                                <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control d-xl-flex" type="email" name="telefone" placeholder="Telefone 1" disabled=""></div>
                                <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="email" name="telefone" placeholder="Telefone 2" disabled=""></div>
                                <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="email" name="rua" placeholder="Rua" disabled=""></div>
                                <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="email" name="numero" placeholder="Número" disabled=""></div>
                                <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="email" name="bairro" placeholder="Bairro" disabled=""></div>
                                <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="email" name="estado" placeholder="Estado" disabled=""></div>
                                <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="email" name="cidade" placeholder="Cidade" disabled=""></div>
                                <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="email" name="cep" placeholder="CEP" disabled=""></div>
                            </form>
							<div class="form-group text-center"><button class="btn btn-primary" style="background-color: rgb(0,0,0);font-size: 20px;padding: 8px 14px;margin-top: 50px;">EDITAR</button></div>
                        </div>
                    </div>
                </div>
                <div id="cadastrar_professor" style="display: none;"><a class="btn btn-link" role="button" id="menu-toggle-cadastrar-professor" href="#menu-toggle-cadastrar-professor"><i class="fa fa-bars" style="color: rgb(0,0,0);"></i></a>
                    <div class="row">
                        <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12">
                            <div>
                                <h1 class="text-center" style="margin-bottom: 20px;">CADASTRAR PROFESSOR</h1>
                            </div>
                        </div>
                    </div>
                </div>
                <div id="administrar_professor" style="display: none;"><a class="btn btn-link" role="button" id="menu-toggle-administrar-professor" href="#menu-toggle-administrar-professor"><i class="fa fa-bars" style="color: rgb(0,0,0);"></i></a>
                    <div class="row">
                        <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12">
                            <div>
                                <h1 class="text-center" style="margin-bottom: 20px;">ADMINISTRAR PROFESSOR</h1>
                            </div>
                        </div>
                    </div>
                </div>
                <div id="cadastrar_aluno" style="display: none;"><a class="btn btn-link" role="button" id="menu-toggle-cadastrar-aluno" href="#menu-toggle-cadastrar-aluno"><i class="fa fa-bars" style="color: rgb(0,0,0);"></i></a>
                    <div class="row">
                        <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12">
                            <div>
                                <h1 class="text-center" style="margin-bottom: 20px;">CADASTRAR ALUNO</h1>
                            </div>
                        </div>
                    </div>
                </div>
                <div id="administrar_aluno" style="display: none;"><a class="btn btn-link" role="button" id="menu-toggle-administrar-aluno" href="#menu-toggle-administrar-aluno"><i class="fa fa-bars" style="color: rgb(0,0,0);"></i></a>
                    <div class="row">
                        <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12">
                            <div>
                                <h1 class="text-center" style="margin-bottom: 20px;">ADMINISTRAR ALUNO</h1>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
	<script src="assets/js/sidebar_menu.js"></script>
    <script src="assets/js/change_divs.js"></script>
</body>

</html>