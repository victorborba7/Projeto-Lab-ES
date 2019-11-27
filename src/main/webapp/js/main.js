$(document).ready(function(){
	generateTable("table_alunos", "");
	generateTable("table_professores", "");
	generateTable("table_dojos", "");
	$("#boas_vindas").html($("#boas_vindas").html() + " " + window.localStorage.getItem("username"));
	
	$("#btn_renovar_professor").click(function(){
		var dataAntiga = window.localStorage.getItem($("#txb_adm_nome_professor_busca").val());
		window.localStorage.removeItem($("#btn_adm_nome_professor_busca").val());
		window.localStorage.setItem($("#txb_adm_nome_professor_busca").val(), dataFomatada(new Date(dataAntiga.replace( /(\d{2})\/(\d{2})\/(\d{4})/, "$2/$1/$3")), 1));
		$("#txb_dt_filiacao_professor_edicao").val(window.localStorage.getItem($("#txb_adm_nome_professor_busca").val()));
		swal("Yahuu!!", "Professor renovado!", "success");
	});
	
	$("#btn_adm_nome_dojo_busca").click(function(){
		if($("#txb_adm_nome_dojo_busca").val() == ""){
			swal("Ops!!", "Favor Inserir o nome do dojo no campo de busca!", "error");
		}else{
			$.post("/judocas/dojo/search.do",
					{
						nome_dojo_buscar: $("#txb_adm_nome_dojo_busca").val(),
						operacao: "buscar"
					},
					function(data){
						if(data == "false"){
							swal("Ops!!", "Dojo não encontrado!", "error");
						}else{
							var obj = JSON.stringify(data);
							$("#txb_nome_dojo_edicao").val(obj.match(/(?:(?=\\"nome\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_cnpj_dojo_edicao").val(obj.match(/(?:(?=\\"cnpj\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_telefone_dojo_edicao").val(obj.match(/(?:(?=\\"telefone1\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_celular_dojo_edicao").val(obj.match(/(?:(?=\\"telefone2\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_rua_dojo_edicao").val(obj.match(/(?:(?=\\"rua\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_numero_dojo_edicao").val(obj.match(/(?:(?=\\"numero\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_bairro_dojo_edicao").val(obj.match(/(?:(?=\\"bairro\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_cidade_dojo_edicao").val(obj.match(/(?:(?=\\"cidade\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_estado_dojo_edicao").val(obj.match(/(?:(?=\\"estado\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_cep_dojo_edicao").val(obj.match(/(?:(?=\\"cep\\"\:\\").+?\\"\:\\")(.+?)(?=\\")/)[1]);
							controlarCamposDesabilitadosDojos(false);
						}
					});
		}
	});
	
	$("#btn_adm_nome_aluno_busca").click(function(){
		if($("#txb_adm_nome_aluno_busca").val() == ""){
			swal("Ops!!", "Favor Inserir o nome do aluno no campo de busca!", "error");
		}else{
			$.post("/judocas/aluno/search.do",
					{
						nome_aluno_buscar: $("#txb_adm_nome_aluno_busca").val(),
						operacao: "buscar"
					},
					function(data){
						if(data == "false"){
							swal("Ops!!", "Aluno não encontrado!", "error");
						}else{
							var obj = JSON.stringify(data);
							$("#txb_nome_aluno_cadastro").val(obj.match(/(?:(?=\\"nome\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_nome_dojo_aluno").val(obj.replace(/(?:(?=\\"nome\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/,"").match(/(?:(?=\\"nome\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_nome_professor_aluno").val(obj.replace(/(?:(?=\\"nome\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/,"").replace(/(?:(?=\\"nome\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/,"").match(/(?:(?=\\"nome\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_registro_cbj_aluno_cadastro").val(obj.match(/(?:(?=\\"registroCbj\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_rg_aluno_cadastro").val(obj.match(/(?:(?=\\"rg\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_cpf_aluno_cadastro").val(obj.match(/(?:(?=\\"cpf\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_celular_aluno_cadastro").val(obj.match(/(?:(?=\\"telefone1\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_rua_aluno_cadastro").val(obj.match(/(?:(?=\\"rua\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_numero_aluno_cadastro").val(obj.match(/(?:(?=\\"numero\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_bairro_aluno_cadastro").val(obj.match(/(?:(?=\\"bairro\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_cidade_aluno_cadastro").val(obj.match(/(?:(?=\\"cidade\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_estado_aluno_cadastro").val(obj.match(/(?:(?=\\"estado\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_cep_aluno_cadastro").val(obj.match(/(?:(?=\\"cep\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_dt_filiacao_aluno_edicao").val(window.localStorage.getItem(obj.match(/(?:(?=\\"nome\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]));
							controlarCamposDesabilitadosDojos(false);
						}
					});
		}
	});
	
	$("#btn_adm_nome_professor_busca").click(function(){
		if($("#txb_adm_nome_professor_busca").val() == ""){
			swal("Ops!!", "Favor Inserir o nome do professor no campo de busca!", "error");
		}else{
			$.post("/judocas/professor/search.do",
					{
						nome_professor_buscar: $("#txb_adm_nome_professor_busca").val(),
						operacao: "buscar"
					},
					function(data){
						if(data == "false"){
							swal("Ops!!", "Professor não encontrado!", "error");
						}else{
							var obj = JSON.stringify(data);
							$("#txb_nome_professor_edicao").val(obj.match(/(?:(?=\\"nome\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_celular_professor_edicao").val(obj.match(/(?:(?=\\"telefone1\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_nome_dojo_professor_edicao").val(obj.replace(/(?:(?=\\"nome\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/,"").match(/(?:(?=\\"nome\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_cpf_professor_edicao").val(obj.match(/(?:(?=\\"cpf\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_rg_professor_edicao").val(obj.match(/(?:(?=\\"rg\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_registro_cbj_professor_edicao").val(obj.match(/(?:(?=\\"registroCbj\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_rua_professor_edicao").val(obj.match(/(?:(?=\\"rua\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_numero_professor_edicao").val(obj.match(/(?:(?=\\"numero\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_bairro_professor_edicao").val(obj.match(/(?:(?=\\"bairro\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_cidade_professor_edicao").val(obj.match(/(?:(?=\\"cidade\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_estado_professor_edicao").val(obj.match(/(?:(?=\\"estado\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]);
							$("#txb_cep_professor_edicao").val(obj.match(/(?:(?=\\"cep\\"\:\\").+?\\"\:\\")(.+?)(?=\\")/)[1]);
							$("#txb_dt_filiacao_professor_edicao").val(window.localStorage.getItem(obj.match(/(?:(?=\\"nome\\"\:\\").+?\\"\:\\")(.+?)(?=\\"\,)/)[1]));
							controlarCamposDesabilitadosProfessores(false);
						}
					});
		}
	});
	
	$("#btn_cadastrar_aluno").click(function(){
		var nome = $("#txb_nome_aluno_cadastro").val();
		var nome_dojo = $("#txb_nome_dojo_aluno").val();
		var nome_professor = $("#txb_nome_professor_aluno").val();
		var cbj = $("#txb_registro_cbj_aluno_cadastro").val();
		var rg = $("#txb_rg_aluno_cadastro").val();
		var cpf = $("#txb_cpf_aluno_cadastro").val();
		var celular = $("#txb_celular_aluno_cadastro").val();
		var rua = $("#txb_rua_aluno_cadastro").val();
		var numero = $("#txb_numero_aluno_cadastro").val();
		var bairro = $("#txb_bairro_aluno_cadastro").val();
		var cidade = $("#txb_cidade_aluno_cadastro").val();
		var estado = $("#txb_estado_aluno_cadastro").val();
		var cep = $("#txb_cep_aluno_cadastro").val();
		
		if(nome == "" || cbj == "" || rg == "" || cpf == "" || celular == "" || rua == "" || numero == "" || bairro == "" || cidade == "" || estado == "" || cep == "" || nome_dojo == "" || nome_professor == ""){
			swal("Ops!!", "Há campos não preenchidos, por gentileza verifique o formulário novamente!", "error");
		}else{
			$.post("/judocas/aluno/add.do",
					{
						nome: nome,
						nome_dojo: nome_dojo,
						nome_professor: nome_professor,
						registro_cbj: cbj,
						rg: rg,
						cpf: cpf,
						telefone1: celular,
						rua: rua,
						numero: numero,
						bairro: bairro,
						cidade: cidade,
						estado: estado,
						cep: cep,
						operacao: "cadastrar"
					},
					function(data){
						if(data == "false"){
							swal("Ops!!", "Erro ao cadastrar o Aluno!", "error");
						}else{
							swal("Yahuu!!", "Aluno " + nome + " cadastrado com sucesso!", "success");
							window.localStorage.setItem(nome, dataFomatada(new Date(), 0));
							controlarCamposDesabilitadosAlunos(true);
							controlarCamposDesabilitadosProfessores(true);
							controlarCamposDesabilitadosDojos(true);
							limparCampos();
						}
					});
		}
	});
	
	$("#btn_cadastrar_professor").click(function(){
		var nome = $("#txb_nome_professor_cadastro").val();
		var nome_dojo = $("#txb_nome_dojo_professor").val();
		var nome_professor = $("#txb_nome_professor_professor").val();
		var cbj = $("#txb_registro_cbj_professor_cadastro").val();
		var rg = $("#txb_rg_professor_cadastro").val();
		var cpf = $("#txb_cpf_professor_cadastro").val();
		var celular = $("#txb_celular_professor_cadastro").val();
		var rua = $("#txb_rua_professor_cadastro").val();
		var numero = $("#txb_numero_professor_cadastro").val();
		var bairro = $("#txb_bairro_professor_cadastro").val();
		var cidade = $("#txb_cidade_professor_cadastro").val();
		var estado = $("#txb_estado_professor_cadastro").val();
		var cep = $("#txb_cep_professor_cadastro").val();
		
		if(nome == "" || cbj == "" || rg == "" || cpf == "" || celular == "" || rua == "" || numero == "" || bairro == "" || cidade == "" || estado == "" || cep == "" || nome_professor == "" || nome_dojo == ""){
			swal("Ops!!", "Há campos não preenchidos, por gentileza verifique o formulário novamente!", "error");
		}else{
			$.post("/judocas/professor/add.do",
					{
						nome: nome,
						nome_dojo: nome_dojo,
						nome_professor: nome_professor,
						registro_cbj: cbj,
						rg: rg,
						cpf: cpf,
						telefone1: celular,
						rua: rua,
						numero: numero,
						bairro: bairro,
						cidade: cidade,
						estado: estado,
						cep: cep,
						operacao: "cadastrar"
					},
					function(data){
						if(data == "false"){
							swal("Ops!!", "Erro ao cadastrar o professor!", "error");
						}else{
							swal("Yahuu!!", "Professor " + nome + " cadastrado com sucesso!", "success");
							window.localStorage.setItem(nome, dataFomatada(new Date(), 0));
							controlarCamposDesabilitadosAlunos(true);
							controlarCamposDesabilitadosProfessores(true);
							controlarCamposDesabilitadosDojos(true);
							limparCampos();
						}
					});
		}
	});
	
	$("#btn_cadastrar_dojo").click(function(){
		 var nome = $("#txb_nome_dojo_cadastro").val();
		 var cnpj = $("#txb_cnpj_dojo_cadastro").val();
		 var telefone = $("#txb_telefone_dojo_cadastro").val();
		 var celular = $("#txb_celular_dojo_cadastro").val();
		 var rua = $("#txb_rua_dojo_cadastro").val();
		 var numero = $("#txb_numero_dojo_cadastro").val();
		 var bairro = $("#txb_bairro_dojo_cadastro").val();
		 var cidade = $("#txb_cidade_dojo_cadastro").val();
		 var estado = $("#txb_estado_dojo_cadastro").val();
		 var cep = $("#txb_cep_dojo_cadastro").val();
		 
		 if(nome == "" || cnpj == "" || telefone == "" || celular == "" || rua == "" || numero == "" || bairro == "" || cidade == "" || estado == "" || cep == ""){
				swal("Ops!!", "Há campos não preenchidos, por gentileza verifique o formulário novamente!", "error");
		 }else{
				
				$.post("/judocas/dojo/add.do",
						{
							nome_dojo: nome,
							cnpj: cnpj,
							telefone1: telefone,
							telefone2: celular,
							rua: rua,
							numero: numero,
							bairro: bairro,
							cidade: cidade,
							estado: estado,
							cep: cep,
							operacao: "cadastrar"
						},
						function(data){
							if(data == "false"){
								swal("Ops!!", "Erro ao cadastrar o dojo!", "error");
							}else{
								swal("Yahuu!!", "Dojo " + nome + " cadastrado com sucesso!", "success");
								controlarCamposDesabilitadosAlunos(true);
								controlarCamposDesabilitadosProfessores(true);
								controlarCamposDesabilitadosDojos(true);
								limparCampos();
							}
						});
		 }
	});
	
	$("#btn_editar_dojo").click(function(){
		 var nome = $("#txb_nome_dojo_edicao").val();
		 var cnpj = $("#txb_cnpj_dojo_edicao").val();
		 var telefone = $("#txb_telefone_dojo_edicao").val();
		 var celular = $("#txb_celular_dojo_edicao").val();
		 var rua = $("#txb_rua_dojo_edicao").val();
		 var numero = $("#txb_numero_dojo_edicao").val();
		 var bairro = $("#txb_bairro_dojo_edicao").val();
		 var cidade = $("#txb_cidade_dojo_edicao").val();
		 var estado = $("#txb_estado_dojo_edicao").val();
		 var cep = $("#txb_cep_dojo_edicao").val();
		 
		 if(nome == "" || cnpj == "" || telefone == "" || celular == "" || rua == "" || numero == "" || bairro == "" || cidade == "" || estado == "" || cep == ""){
				swal("Ops!!", "Há campos não preenchidos, por gentileza verifique o formulário novamente!", "error");
		 }else{
			 $.post("/judocas/dojo/udpate.do",
						{
							nome_dojo_buscar: $("#txb_adm_nome_dojo_busca").val(),
							nome_dojo: nome,
							cnpj: cnpj,
							telefone1: telefone,
							telefone2: celular,
							rua: rua,
							numero: numero,
							bairro: bairro,
							cidade: cidade,
							estado: estado,
							cep: cep,
							operacao: "editar"
						},
						function(data){
							if(data == "false"){
								swal("Ops!!", "Erro ao editar o dojo!", "error");
							}else{
								swal("Yahuu!!", "Dojo " + nome + " editado com sucesso!", "success");
								controlarCamposDesabilitadosAlunos(true);
								controlarCamposDesabilitadosProfessores(true);
								controlarCamposDesabilitadosDojos(true);
								limparCampos();
							}
						});
		 }
	});
	
	$("#btn_editar_aluno").click(function(){
		var nome = $("#txb_nome_aluno_edicao").val();
		var nome_dojo = $("#txb_nome_dojo_aluno_edicao").val();
		var nome_professor = $("#txb_nome_professor_aluno_edicao").val();
		var cbj = $("#txb_registro_cbj_aluno_edicao").val();
		var rg = $("#txb_rg_aluno_edicao").val();
		var cpf = $("#txb_cpf_aluno_edicao").val();
		var celular = $("#txb_celular_aluno_edicao").val();
		var rua = $("#txb_rua_aluno_edicao").val();
		var numero = $("#txb_numero_aluno_edicao").val();
		var bairro = $("#txb_bairro_aluno_edicao").val();
		var cidade = $("#txb_cidade_aluno_edicao").val();
		var estado = $("#txb_estado_aluno_edicao").val();
		var cep = $("#txb_cep_aluno_edicao").val();
		
		if(nome == "" || cbj == "" || rg == "" || cpf == "" || celular == "" || rua == "" || numero == "" || bairro == "" || cidade == "" || estado == "" || cep == ""){
			swal("Ops!!", "Há campos não preenchidos, por gentileza verifique o formulário novamente!", "error");
		}else{
			$.post("/judocas/aluno/update.do",
					{
						nome: nome,
						nome_dojo: nome_dojo,
						nome_professor: nome_professor,
						registro_cbj: cbj,
						rg: rg,
						cpf: cpf,
						celular: celular,
						rua: rua,
						numero: numero,
						bairro: bairro,
						cidade: cidade,
						estado: estado,
						cep: cep,
						operacao: "editar"
					},
					function(data){
						if(data == "false"){
							swal("Ops!!", "Erro ao editar o Aluno!", "error");
						}else{
							swal("Yahuu!!", "Aluno " + nome + " editado com sucesso!", "success");
							controlarCamposDesabilitadosAlunos(true);
							controlarCamposDesabilitadosProfessores(true);
							controlarCamposDesabilitadosDojos(true);
							limparCampos();
						}
					});
		}
	});
	
	$("#btn_editar_professor").click(function(){
		var nome = $("#txb_nome_professor_edicao").val();
		var nome_dojo = $("#txb_nome_dojo_professor_edicao").val();
		var nome_professor = $("#txb_nome_professor_professor_edicao").val();
		var cbj = $("#txb_registro_cbj_professor_edicao").val();
		var rg = $("#txb_rg_professor_edicao").val();
		var cpf = $("#txb_cpf_professor_edicao").val();
		var celular = $("#txb_celular_professor_edicao").val();
		var rua = $("#txb_rua_professor_edicao").val();
		var numero = $("#txb_numero_professor_edicao").val();
		var bairro = $("#txb_bairro_professor_edicao").val();
		var cidade = $("#txb_cidade_professor_edicao").val();
		var estado = $("#txb_estado_professor_edicao").val();
		var cep = $("#txb_cep_professor_edicao").val();
		
		if(nome == "" || cbj == "" || rg == "" || cpf == "" || celular == "" || rua == "" || numero == "" || bairro == "" || cidade == "" || estado == "" || cep == ""){
			swal("Ops!!", "Há campos não preenchidos, por gentileza verifique o formulário novamente!", "error");
		}else{
			$.post("/judocas/professor/update.do",
					{
						nome: nome,
						nome_dojo: nome_dojo,
						nome_professor: nome_professor,
						registro_cbj: cbj,
						rg: rg,
						cpf: cpf,
						telefone1: celular,
						rua: rua,
						numero: numero,
						bairro: bairro,
						cidade: cidade,
						estado: estado,
						cep: cep,
						operacao: "editar"
					},
					function(data){
						if(data == "false"){
							swal("Ops!!", "Erro ao editar o professor!", "error");
						}else{
							swal("Yahuu!!", "Professor " + nome + " editado com sucesso!", "success");
							controlarCamposDesabilitadosAlunos(true);
							controlarCamposDesabilitadosProfessores(true);
							controlarCamposDesabilitadosDojos(true);
							limparCampos();
						}
					});
		}
	});
});