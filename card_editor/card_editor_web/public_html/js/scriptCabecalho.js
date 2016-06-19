$(document).ready(function () {
    var userName = $.cookie("userName");
    if (userName === null || userName === undefined) {
        $('#account-info').html("Efetue <a href=" + '"' + "telaCadastro.html" + '"' + ">Login</a> ou <a href=" + '"' + "telaCadastro.html" + '"' + ">Cadastresse</a>!");
    } else {
        $('#account-info').html("<li><div>Bem vindo " + userName + "!</li>");
    }
});