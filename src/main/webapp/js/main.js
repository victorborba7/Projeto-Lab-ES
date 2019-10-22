$(document).ready(function(){
	$("#btn_adm_nome_dojo_busca").click(function(){
		controlarCamposDesabilitadosDojos(false);
		if($("#txb_adm_nome_dojo_busca").val() == ""){
			swal("Ops!!", "Favor Inserir o nome do dojo no campo de busca!");
		}else{
			//Ajax de busca do dojo
		}
	});
	
	$("#btn_adm_nome_aluno_busca").click(function(){
		controlarCamposDesabilitadosAlunos(false);
		if($("#txb_adm_nome_aluno_busca").val() == ""){
			swal("Ops!!", "Favor Inserir o nome do aluno no campo de busca!");
		}else{
			//Ajax de busca do aluno
		}
	});
	
	$("#btn_cadastrar_aluno").click(function(){
		var nome = $("#txb_nome_aluno_cadastro").val();
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
		
		if(nome == "" || cbj == "" || rg == "" || cpf == "" || celular == "" || rua == "" || numero == "" || bairro == "" || cidade == "" || estado == "" || cep == ""){
			swal("Ops!!", "Há campos não preenchidos, por gentileza verifique o formulário novamente!");
		}else{
			var obj = { nome: nome,
					cbj: cbj,
					rg: rg,
					cpf: cpf,
					celular: celular,
					rua: rua,
					numero: numero,
					bairro: bairro,
					cidade: cidade,
					estado: estado,
					cep: cep };
			var json = JSON.stringify(obj);
			//Ajax de cadastro do aluno
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
				swal("Ops!!", "Há campos não preenchidos, por gentileza verifique o formulário novamente!");
		 }else{
			 var obj = { nome: nome,
						cnpj: cnpj,
						telefone: telefone,
						celular: celular,
						rua: rua,
						numero: numero,
						bairro: bairro,
						cidade: cidade,
						estado: estado,
						cep: cep };
				var json = JSON.stringify(obj);
				//Ajax de cadastro do dojo
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
				swal("Ops!!", "Há campos não preenchidos, por gentileza verifique o formulário novamente!");
		 }else{
			 var obj = { nome: nome,
						cnpj: cnpj,
						telefone: telefone,
						celular: celular,
						rua: rua,
						numero: numero,
						bairro: bairro,
						cidade: cidade,
						estado: estado,
						cep: cep };
				var json = JSON.stringify(obj);
				//Ajax de edicao do dojo
		 }
	});
	
	$("#btn_editar_aluno").click(function(){
		var nome = $("#txb_nome_aluno_edicao").val();
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
			swal("Ops!!", "Há campos não preenchidos, por gentileza verifique o formulário novamente!");
		}else{
			var obj = { nome: nome,
					cbj: cbj,
					rg: rg,
					cpf: cpf,
					celular: celular,
					rua: rua,
					numero: numero,
					bairro: bairro,
					cidade: cidade,
					estado: estado,
					cep: cep };
			var json = JSON.stringify(obj);
			//Ajax de edicao do aluno
		}
	});
});