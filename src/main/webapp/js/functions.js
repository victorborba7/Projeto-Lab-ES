function controlarCamposDesabilitadosAlunos(val){
	$(".aluno_edicao").prop("disabled", val);
}

function controlarCamposDesabilitadosDojos(val){
	$(".dojo_edicao").prop("disabled", val);
}

function controlarCamposDesabilitadosProfessores(val){
	$(".professor_edicao").prop("disabled", val);
}

function limparCampos(){
	$("input").val("");
}

function generateTableDojos(filtro, param){
	$.post("/judocas/dojo/listar.do",
			{
				operacao: param,
				nome_dojo_filtrar: filtro
			},
			function(data){
				var dojos = JSON.parse(data.replace("Dojos: ", "").replace(/(?=Dojos\:).*/g, ""));
				var table = $('<table>');
				var row = $('<tr>');
				var cell = $('<th>').text('Nome');
			    row.append(cell);
				var cell = $('<th>').text('CNPJ');
			    row.append(cell);
				var cell = $('<th>').text('Endereço');
				row.append(cell);
			    table.append(row);
				for(i in dojos){
					row = $('<tr>');
					cell = $('<td>').text(dojos[i].nome);
				    row.append(cell);
					cell = $('<td>').text(dojos[i].cnpj);
				    row.append(cell);
					cell = $('<td>').text(dojos[i].endereco.rua + ", Nº " + dojos[i].endereco.numero);
				    row.append(cell);
				    table.append(row);
				}
				$("#table_dojos").empty().append(table);
			});
}

function generateTableAlunos(filtro, param){
	$.post("/judocas/aluno/listar.do",
			{
				operacao: param,
				nome_aluno_filtrar: filtro
			},
			function(data){
				var alunos = JSON.parse(data.replace("Alunos: ", "").replace(/(?=Alunos\:).*/g, ""));
				var table = $('<table>');
				var row = $('<tr>');
				var cell = $('<th>').text('Nome');
			    row.append(cell);
				var cell = $('<th>').text('CBJ');
			    row.append(cell);
				var cell = $('<th>').text('CPF');
				row.append(cell);
				var cell = $('<th>').text('Telefone');
				row.append(cell);
				var cell = $('<th>').text('Endereco');
				row.append(cell);
				var cell = $('<th>').text('Professor');
				row.append(cell);
				var cell = $('<th>').text('Dojo');
				row.append(cell);
			    table.append(row);
				for(i in alunos){
					row = $('<tr>');
					cell = $('<td>').text(alunos[i].filiado.nome);
				    row.append(cell);
					cell = $('<td>').text(alunos[i].filiado.registroCbj);
				    row.append(cell);
					cell = $('<td>').text(alunos[i].filiado.cpf);
				    row.append(cell);
					cell = $('<td>').text(alunos[i].filiado.telefone1);
				    row.append(cell);
					cell = $('<td>').text(alunos[i].filiado.endereco.rua + ", Nº " + alunos[i].filiado.endereco.numero);
				    row.append(cell);
					cell = $('<td>').text(alunos[i].professor.filiado.nome);
				    row.append(cell);
					cell = $('<td>').text(alunos[i].entidade.nome);
				    row.append(cell);
				    table.append(row);
				}
				$("#table_alunos").empty().append(table);
			});
}

function generateTableProfessores(filtro, param){
	$.post("/judocas/professor/listar.do",
			{
				operacao: param,
				nome_professor_filtrar: filtro
			},
			function(data, textStatus, request){
				var professores = JSON.parse(request.getResponseHeader("result"));
				console.info(professores);
				var table = $('<table>');
				var row = $('<tr>');
				var cell = $('<th>').text('Nome');
			    row.append(cell);
				var cell = $('<th>').text('CBJ');
			    row.append(cell);
				var cell = $('<th>').text('Dojo');
				row.append(cell);
			    table.append(row);
				for(i in professores){
					row = $('<tr>');
					cell = $('<td>').text(professores[i].filiado.nome);
				    row.append(cell);
					cell = $('<td>').text(professores[i].filiado.registroCbj);
				    row.append(cell);
					cell = $('<td>').text(professores[i].entidades[0].nome);
				    row.append(cell);
				    table.append(row);
				}
				$("#table_professores").empty().append(table);
			});
}

function dataFomatada(data, val){
        dia  = data.getDate().toString(),
        diaF = (dia.length == 1) ? '0'+dia : dia,
        mes  = (data.getMonth()+1).toString(),
        mesF = (mes.length == 1) ? '0'+mes : mes,
        anoF = data.getFullYear() + val;
        return diaF+"/"+mesF+"/"+anoF;
}