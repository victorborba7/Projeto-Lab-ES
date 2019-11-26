$(document).ready(function(){
	$("#btn_login").click(function(){
		if($("#username").val() == "" || $("#password").val() == ""){
			swal("Ops!!", "Um dos campos não está preenchido, verifique novamente!");
		}else{
			window.localStorage.setItem('username', $("#username").val());
			window.localStorage.setItem('password', $("#password").val());
			window.location.href = window.location.pathname.replace("index.jsp","") + "pagina-menus.jsp";
		}
	});
});