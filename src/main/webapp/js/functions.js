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
//
function generateTable(id, data){
	$.post("/judocas/professor/listar.do",
			{
				operacao: "listar"
			},
			function(data){
				console.info(data);
			});
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

function dataFomatada(data, val){
        dia  = data.getDate().toString(),
        diaF = (dia.length == 1) ? '0'+dia : dia,
        mes  = (data.getMonth()+1).toString(),
        mesF = (mes.length == 1) ? '0'+mes : mes,
        anoF = data.getFullYear() + val;
        return diaF+"/"+mesF+"/"+anoF;
}