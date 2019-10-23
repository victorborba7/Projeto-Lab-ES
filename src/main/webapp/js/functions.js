function controlarCamposDesabilitadosAlunos(val){
	$(".aluno_edicao").prop("disabled", val);
}

function controlarCamposDesabilitadosDojos(val){
	$(".dojo_edicao").prop("disabled", val);
}

function limparCampos(){
	$("input").val("");
}