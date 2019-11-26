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

function generateTable(id, data){
	var table = $('<table>');
	for(i=0; i<3; i++){
		var row = $('<tr>')
	    for(j=0; j<3; j++){
	    	if(i == 0){
	    		var cell = $('<th>').text('header ' + i);
	    	}else{
	    		var cell = $('<td>').text('result ' + i);
	    	}
		    row.append(cell);
	    }
	    table.append(row);
	}

	$('#' + id).append(table);
}