<%@ page language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>login</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/Login-Form-Clean.css">
    <link rel="stylesheet" href="assets/css/styles.css">
</head>

<body>
    <div class="login-clean" style="padding-bottom: 80px;height: 100vh;">
        <form>
            <h2 class="sr-only">Login Form</h2>
            <div class="illustration" style="height: 100px;">
                <h1 style="color: rgb(0,0,0);">JUDOCAS</h1>
            </div>
            <div class="form-group"><input class="form-control" type="text" name="username" placeholder="Login" id="username"></div>
            <div class="form-group" style="height: 30px;"><input class="form-control" type="password" name="password" placeholder="Senha" id="password"></div><a class="text-right forgot" href="#">Esqueceu sua senha?</a>
        </form>
		<div class="form-group"><button class="btn btn-primary btn-block" id="btn_login" form="login" style="background-color: rgb(0,0,0); width: 320px;">Log In</button></div>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <script src="js/login.js"></script>
</body>

</html>