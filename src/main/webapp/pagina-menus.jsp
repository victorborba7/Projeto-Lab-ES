<%@ page language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-br">

<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Judocas</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="assets/css/Contact-Form-Clean.css">
    <link rel="stylesheet" href="assets/css/Login-Form-Dark.css">
    <link rel="stylesheet" href="assets/css/sidebar-1.css">
    <link rel="stylesheet" href="assets/css/Sidebar-Menu-1.css">
    <link rel="stylesheet" href="assets/css/Sidebar-Menu.css">
    <link rel="stylesheet" href="assets/css/sidebar.css">
</head>

<body style="background-color: rgb(241,247,252);">
    <div id="wrapper"><div id="sidebar-wrapper">
    <ul class="sidebar-nav">
        <li class="sidebar-brand"><a href="#" onclick="judocas()">JUDOCAS</a></li>
        <li class="active">
                        <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false">
                            Dojos
                        </a>
                        <ul class="collapse list-unstyled" id="homeSubmenu">
                            <li><a href="#" onclick="cadastrarDojo()">Cadastrar dojo</a></li>
                            <li><a href="#" onclick="administrarDojo()">Administrar dojo</a></li>
                            <li><a href="#" onclick="visualizarDojos()">Visualizar dojos</a></li>
                        </ul>
                    </li>
        <li class="active">
                        <a href="#homeSubmenu2" data-toggle="collapse" aria-expanded="false">
                            Professores
                        </a>
                        <ul class="collapse list-unstyled" id="homeSubmenu2">
                            <li><a href="#" onclick="cadastrarProfessor()">Cadastrar professor</a></li>
                            <li><a href="#" onclick="administrarProfessor()">Administrar professor</a></li>
                            <li><a href="#" onclick="visualizarProfessores()">Visualizar professores</a></li>
                        </ul>
                    </li>
        <li class="active">
                        <a href="#homeSubmenu3" data-toggle="collapse" aria-expanded="false">
                            Alunos
                        </a>
                        <ul class="collapse list-unstyled" id="homeSubmenu3">
                            <li><a href="#" onclick="cadastrarAluno()">Cadastrar aluno</a></li>
                            <li><a href="#" onclick="administrarAluno()">Administrar aluno</a></li>
                            <li><a href="#" onclick="visualizarAlunos()">Visualizar alunos</a></li>
                        </ul>
                    </li>
    </ul>
</div>
        <div class="page-content-wrapper">
            <div class="container-fluid" id="padrao">
                <div id="bem_vindo" style="/*display: none;*/"><a class="btn btn-link" role="button" id="menu-toggle-bem-vindo" href="#menu-toggle-bem-vindo"><em class="fa fa-bars" style="color: rgb(0,0,0);"></em></a>
                    <div class="row">
                        <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12">
                            <div>
                                <h1 class="text-center" style="margin-bottom: 20px;" id="boas_vindas">Bem vindo</h1>
                            </div>
                        </div>
                    </div>
                    <div class="row text-center">
                        <div class="col" style="margin-top: 100px;"><img src="assets/img/pagina_inicial.png" alt="Logo Judocas" height="500px" width="75%" style="filter: blur(0px) contrast(100%) grayscale(0%) hue-rotate(0deg) invert(0%);"></div>
                    </div>
                </div>
                <div id="cadastrar_dojo" style="display: none;width: 100%;"><a class="btn btn-link" role="button" id="menu-toggle-cadastrar-dojo" href="#menu-toggle2"><em class="fa fa-bars" style="color: rgb(0,0,0);"></em></a>
                    <div class="row" style="width: 100%;">
                        <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12" style="margin-bottom: 50px;">
                            <div>
                                <h1 class="text-center" style="margin-bottom: 20px;">CADASTRAR DOJO</h1>
                            </div>
                        </div>
                        <div class="col-sm-11 col-md-11 col-lg-11 col-xl-11 m-auto">
                            <div class="form-group"><input class="form-control" type="text" name="nome_dojo" placeholder="Nome do dojo" id="txb_nome_dojo_cadastro"></div>
                            <div class="form-group"><input class="form-control" type="text" name="cnpj" placeholder="CNPJ" id="txb_cnpj_dojo_cadastro"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control d-xl-flex" type="text" name="telefone1" placeholder="Telefone 1" id="txb_telefone_dojo_cadastro"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="telefone2" placeholder="Telefone 2" id="txb_celular_dojo_cadastro"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="rua" placeholder="Rua" id="txb_rua_dojo_cadastro"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="numero" placeholder="Número" id="txb_numero_dojo_cadastro"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="texl" name="bairro" placeholder="Bairro" id="txb_bairro_dojo_cadastro"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="estado" placeholder="Estado" id="txb_estado_dojo_cadastro"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="cidade" placeholder="Cidade" id="txb_cidade_dojo_cadastro"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="cep" placeholder="CEP" id="txb_cep_dojo_cadastro"></div>
                            <div class="form-group text-center"><button class="btn btn-primary" style="background-color: rgb(0,0,0);font-size: 20px;padding: 8px 14px;margin-top: 50px;" id="btn_cadastrar_dojo" type="submit">CADASTRAR</button></div>
                        </div>
                    </div>
                </div>
                <div id="administrar_dojo" style="display: none;"><a class="btn btn-link" role="button" id="menu-toggle-administrar-dojo" href="#menu-toggle-administrar-dojo"><em class="fa fa-bars" style="color: rgb(0,0,0);"></em></a>
                    <div class="row">
                        <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12">
                            <div>
                                <h1 class="text-center" style="margin-bottom: 20px;">ADMINISTRAR DOJO</h1>
                            </div>
                        </div>
                        <div class="col-sm-11 col-md-11 col-lg-11 col-xl-11 m-auto" style="filter: blur(0px);">
							<div class="form-group d-inline-block" style="width: 82%;"><input class="form-control" type="text" name="nome_dojo_buscar" placeholder="Nome do dojo" id="txb_adm_nome_dojo_busca"></div>
						   	<div class="form-group text-center d-inline-block float-right" style="margin-left: 15px;"><button class="btn btn-primary" style="background-color: rgb(0,0,0);font-size: 20px;margin-top: 0px;padding-top: 3px;padding-bottom: 3px;" id="btn_adm_nome_dojo_busca">BUSCAR</button></div>
                        </div>
                        <div class="col-sm-11 col-md-11 col-lg-12 col-xl-11 m-auto">
                            <div class="form-group"><input class="form-control dojo_edicao" type="text" name="nome_dojo" placeholder="Nome do dojo" disabled="true" id="txb_nome_dojo_edicao"></div>
                            <div class="form-group"><input class="form-control dojo_edicao" type="text" name="cnpj" placeholder="CNPJ" disabled="true" id="txb_cnpj_dojo_edicao"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control d-xl-flex dojo_edicao" type="text" name="telefone" placeholder="Telefone 1" disabled="true" id="txb_telefone_dojo_edicao"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control dojo_edicao" type="text" name="telefone" placeholder="Telefone 2" disabled="true" id="txb_celular_dojo_edicao"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control dojo_edicao" type="text" name="rua" placeholder="Rua" disabled="true" id="txb_rua_dojo_edicao"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control dojo_edicao" type="text" name="numero" placeholder="Número" disabled="true" id="txb_numero_dojo_edicao"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control dojo_edicao" type="text" name="bairro" placeholder="Bairro" disabled="true" id="txb_bairro_dojo_edicao"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control dojo_edicao" type="text" name="estado" placeholder="Estado" disabled="true" id="txb_estado_dojo_edicao"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control dojo_edicao" type="text" name="cidade" placeholder="Cidade" disabled="true" id="txb_cidade_dojo_edicao"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control dojo_edicao" type="text" name="cep" placeholder="CEP" disabled="true" id="txb_cep_dojo_edicao"></div>
                            <div class="form-group text-center"><button class="btn btn-primary" style="background-color: rgb(0,0,0);font-size: 20px;padding: 8px 14px;margin-top: 50px;" id="btn_editar_dojo">EDITAR</button></div>
                        </div>
                    </div>
                </div>
                <div id="visualizar_dojos" style="display: none;"><a class="btn btn-link" role="button" id="menu-toggle-visualizar-dojos" href="#menu-toggle-visualizar-dojos"><i class="fa fa-bars" style="color: rgb(0,0,0);"></i></a>
                    <div class="row" style="width: 100%;">
                        <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12">
                            <div>
                                <h1 class="text-center" style="margin-bottom: 20px;">VISUALIZAR DOJOS</h1>
                            </div>
                        </div>
                        <div class="col-sm-11 col-md-11 col-lg-11 col-xl-11 m-auto" style="filter: blur(0px);">
							<div class="form-group d-inline-block" style="width: 82%;"><input class="form-control" type="text" name="nome_dojo_filtrar" placeholder="Nome do dojo" id="txb_adm_nome_dojo_filtrar"></div>
						   	<div class="form-group text-center d-inline-block float-right" style="margin-left: 15px;"><button class="btn btn-primary" style="background-color: rgb(0,0,0);font-size: 20px;margin-top: 0px;padding-top: 3px;padding-bottom: 3px;" id="btn_nome_dojo_filtrar">FILTRAR</button></div>
                        </div>
                        <div id="table_dojos" class="col-xl-11 m-auto">
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
						<div class="col-xl-11 m-auto">
                            <div class="form-group"><input class="form-control" type="text" name="nome" placeholder="Nome do professor" id="txb_nome_professor_cadastro"></div>
							<div class="form-group"><input class="form-control" type="text" name="nome_dojo" placeholder="Nome do dojo" id="txb_nome_dojo_professor"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="registro_cbj" placeholder="Registro CBJ" id="txb_registro_cbj_professor_cadastro"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="rg" placeholder="RG" id="txb_rg_professor_cadastro"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="cpf" placeholder="CPF" id="txb_cpf_professor_cadastro"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="telefone1" placeholder="Celular" id="txb_celular_professor_cadastro"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="rua" placeholder="Rua" id="txb_rua_professor_cadastro"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="numero" placeholder="Número" id="txb_numero_professor_cadastro"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="bairro" placeholder="Bairro" id="txb_bairro_professor_cadastro"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="estado" placeholder="Estado" id="txb_estado_professor_cadastro"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="cidade" placeholder="Cidade" id="txb_cidade_professor_cadastro"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="cep" placeholder="CEP" id="txb_cep_professor_cadastro"></div>
							<div class="form-group text-center"><button class="btn btn-primary" type="button" style="background-color: rgb(0,0,0);font-size: 20px;padding: 8px 14px;margin-top: 50px;" id="btn_cadastrar_professor">CADASTRAR</button></div>
                        </div>
                    </div>
                </div>
                <div id="administrar_professor" style="display: none;"><a class="btn btn-link" role="button" id="menu-toggle-administrar-professor" href="#menu-toggle-administrar-professor"><em class="fa fa-bars" style="color: rgb(0,0,0);"></em></a>
                    <div class="row">
                        <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12">
                            <div>
                                <h1 class="text-center" style="margin-bottom: 20px;">ADMINISTRAR PROFESSOR</h1>
                            </div>
                        </div>
						<div class="col-xl-11 m-auto" style="filter: blur(0px);">
                            <div class="form-group d-inline-block" style="width: 82%;"><input class="form-control" type="text" name="nome_professor_buscar" placeholder="Nome do professor" id="txb_adm_nome_professor_busca"></div>
                            <div class="form-group text-center d-inline-block float-none" style="margin-left: 15px;"><button class="btn btn-primary" type="button" style="background-color: rgb(0,0,0);font-size: 20px;margin-top: 0px;padding-top: 3px;padding-bottom: 3px;" id="btn_adm_nome_professor_busca">BUSCAR</button></div>
                        </div>
						<div class="col-xl-11 m-auto">
                            <div class="form-group"><input class="form-control professor_edicao" type="text" name="nome_dojo" placeholder="Nome do professor" disabled="true" id="txb_nome_professor_edicao"></div>
							<div class="form-group"><input class="form-control professor_edicao" type="text" name="nome_professor" placeholder="Nome do professor do professor" disabled="true"  id="txb_nome_professor_professor_edicao"></div>
							<div class="form-group"><input class="form-control professor_edicao" type="text" name="nome_dojo" placeholder="Nome do dojo" disabled="true"  id="txb_nome_dojo_professor_edicao"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control professor_edicao" type="text" name="registro_cbj" placeholder="Registro CBJ" disabled="true" id="txb_registro_cbj_professor_edicao"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control professor_edicao" type="text" name="rg" placeholder="RG" disabled="true" id="txb_rg_professor_edicao"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control professor_edicao" type="text" name="cpf" placeholder="CPF" disabled="true" id="txb_cpf_professor_edicao"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control professor_edicao" type="text" name="celular_professor" placeholder="Celular" disabled="true" id="txb_celular_professor_edicao"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control professor_edicao" type="text" name="rua_professor" placeholder="Rua" disabled="true" id="txb_rua_professor_edicao"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control professor_edicao" type="text" name="numero_professor" placeholder="Número" disabled="true" id="txb_numero_professor_edicao"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control professor_edicao" type="text" name="bairro_professor" placeholder="Bairro" disabled="true" id="txb_bairro_professor_edicao"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control professor_edicao" type="text" name="estado_professor" placeholder="Estado" disabled="true" id="txb_estado_professor_edicao"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control professor_edicao" type="text" name="cidade_professor" placeholder="Cidade" disabled="true" id="txb_cidade_professor_edicao"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control professor_edicao" type="text" name="cep_professor" placeholder="CEP" disabled="true" id="txb_cep_professor_edicao"></div>
                            <div class="form-group text-center"><button class="btn btn-primary" type="button" style="background-color: rgb(0,0,0);font-size: 20px;padding: 8px 14px;margin-top: 50px;" id="btn_editar_professor">EDITAR</button></div>
                        </div>
                    </div>
                </div>
                <div id="visualizar_professores" style="display: none;"><a class="btn btn-link" role="button" id="menu-toggle-visualizar-professores" href="#menu-toggle-visualizar-professores"><i class="fa fa-bars" style="color: rgb(0,0,0);"></i></a>
                    <div class="row" style="width: 100%;">
                        <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12">
                            <div>
                                <h1 class="text-center" style="margin-bottom: 20px;">VISUALIZAR PROFESSORES</h1>
                            </div>
                        </div>
                        <div class="col-sm-11 col-md-11 col-lg-11 col-xl-11 m-auto" style="filter: blur(0px);">
							<div class="form-group d-inline-block" style="width: 82%;"><input class="form-control" type="text" name="nome_professor_filtrar" placeholder="Nome do professor" id="txb_nome_professor_filtrar"></div>
						   	<div class="form-group text-center d-inline-block float-right" style="margin-left: 15px;"><button class="btn btn-primary" style="background-color: rgb(0,0,0);font-size: 20px;margin-top: 0px;padding-top: 3px;padding-bottom: 3px;" id="btn_nome_professor_filtrar">FILTRAR</button></div>
                        </div>
                        <div id="table_professores" class="col-xl-11 m-auto">
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
                            <div class="form-group"><input class="form-control" type="text" name="nome" placeholder="Nome do aluno" id="txb_nome_aluno_cadastro"></div>
							<div class="form-group"><input class="form-control" type="text" name="nome_professor" placeholder="Nome do professor do aluno" id="txb_nome_professor_aluno"></div>
							<div class="form-group"><input class="form-control" type="text" name="nome_dojo" placeholder="Nome do dojo" id="txb_nome_dojo_aluno"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="registro_cbj" placeholder="Registro CBJ" id="txb_registro_cbj_aluno_cadastro"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="rg" placeholder="RG" id="txb_rg_aluno_cadastro"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="cpf" placeholder="CPF" id="txb_cpf_aluno_cadastro"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="celular_aluno" placeholder="Celular" id="txb_celular_aluno_cadastro"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="rua" placeholder="Rua" id="txb_rua_aluno_cadastro"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="numero" placeholder="Número" id="txb_numero_aluno_cadastro"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="bairro" placeholder="Bairro" id="txb_bairro_aluno_cadastro"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="estado" placeholder="Estado" id="txb_estado_aluno_cadastro"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control" type="text" name="cidade" placeholder="Cidade" id="txb_cidade_aluno_cadastro"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control" type="text" name="cep" placeholder="CEP" id="txb_cep_aluno_cadastro"></div>
                            <div class="form-group text-center"><button class="btn btn-primary" type="button" style="background-color: rgb(0,0,0);font-size: 20px;padding: 8px 14px;margin-top: 50px;" id="btn_cadastrar_aluno">CADASTRAR</button></div>
                        </div>
                    </div>
                </div>
                <div id="administrar_aluno" style="display: none;"><a class="btn btn-link" role="button" id="menu-toggle-administrar-aluno" href="#menu-toggle-administrar-aluno"><em class="fa fa-bars" style="color: rgb(0,0,0);"></em></a>
                    <div class="row">
                        <div class="col-md-12">
                            <div>
                                <h1 class="text-center" style="margin-bottom: 20px;">ADMINISTRAR ALUNO</h1>
                            </div>
                        </div>
                        <div class="col-xl-11 m-auto" style="filter: blur(0px);">
                            <div class="form-group d-inline-block" style="width: 82%;"><input class="form-control" type="text" name="nome_aluno_buscar" placeholder="Nome do aluno" id="txb_adm_nome_aluno_busca"></div>
                            <div class="form-group text-center d-inline-block float-none" style="margin-left: 15px;"><button class="btn btn-primary" type="button" style="background-color: rgb(0,0,0);font-size: 20px;margin-top: 0px;padding-top: 3px;padding-bottom: 3px;" id="btn_adm_nome_aluno_busca">BUSCAR</button></div>
                        </div>
                        <div class="col-xl-11 m-auto">
                            <div class="form-group"><input class="form-control aluno_edicao" type="text" name="nome_aluno" placeholder="Nome do aluno" disabled="true" id="txb_nome_aluno_edicao"></div>
							<div class="form-group"><input class="form-control aluno_edicao" type="text" name="nome_professor" placeholder="Nome do professor do aluno" disabled="true"  id="txb_nome_professor_aluno_edicao"></div>
							<div class="form-group"><input class="form-control aluno_edicao" type="text" name="nome_dojo" placeholder="Nome do dojo" disabled="true"  id="txb_nome_dojo_aluno_edicao"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control aluno_edicao" type="text" name="registro_cbj" placeholder="Registro CBJ" disabled="true" id="txb_registro_cbj_aluno_edicao"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control aluno_edicao" type="text" name="rg" placeholder="RG" disabled="true" id="txb_rg_aluno_edicao"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control aluno_edicao" type="text" name="cpf" placeholder="CPF" disabled="true" id="txb_cpf_aluno_edicao"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control aluno_edicao" type="text" name="celular_aluno" placeholder="Celular" disabled="true" id="txb_celular_aluno_edicao"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control aluno_edicao" type="text" name="rua_aluno" placeholder="Rua" disabled="true" id="txb_rua_aluno_edicao"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control aluno_edicao" type="text" name="numero_aluno" placeholder="Número" disabled="true" id="txb_numero_aluno_edicao"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control aluno_edicao" type="text" name="bairro_aluno" placeholder="Bairro" disabled="true" id="txb_bairro_aluno_edicao"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control aluno_edicao" type="text" name="estado_aluno" placeholder="Estado" disabled="true" id="txb_estado_aluno_edicao"></div>
                            <div class="form-group d-inline-block" style="width: 47%;"><input class="form-control aluno_edicao" type="text" name="cidade_aluno" placeholder="Cidade" disabled="true" id="txb_cidade_aluno_edicao"></div>
                            <div class="form-group d-inline-block float-right" style="width: 47%;"><input class="form-control aluno_edicao" type="text" name="cep_aluno" placeholder="CEP" disabled="true" id="txb_cep_aluno_edicao"></div>
                            <div class="form-group text-center"><button class="btn btn-primary" type="button" style="background-color: rgb(0,0,0);font-size: 20px;padding: 8px 14px;margin-top: 50px;" id="btn_editar_aluno">EDITAR</button></div>
                        </div>
                    </div>
                </div>
                <div id="visualizar_alunos" style="display: none;"><a class="btn btn-link" role="button" id="menu-toggle-visualizar-alunos" href="#menu-toggle-visualizar-alunos"><i class="fa fa-bars" style="color: rgb(0,0,0);"></i></a>
                    <div class="row" style="width: 100%;">
                        <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12">
                            <div>
                                <h1 class="text-center" style="margin-bottom: 20px;">VISUALIZAR ALUNOS</h1>
                            </div>
                        </div>
                        <div class="col-sm-11 col-md-11 col-lg-11 col-xl-11 m-auto" style="filter: blur(0px);">
							<div class="form-group d-inline-block" style="width: 82%;"><input class="form-control" type="text" name="nome_professor_filtrar" placeholder="Nome do aluno" id="txb_nome_aluno_filtrar"></div>
						   	<div class="form-group text-center d-inline-block float-right" style="margin-left: 15px;"><button class="btn btn-primary" style="background-color: rgb(0,0,0);font-size: 20px;margin-top: 0px;padding-top: 3px;padding-bottom: 3px;" id="btn_nome_aluno_filtrar">FILTRAR</button></div>
                        </div>
                        <div id="table_alunos" class="col-xl-11 m-auto">
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
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <script src="js/functions.js"></script>
    <script src="js/main.js"></script>
</body>

</html>
