$(document).ready(function () {
    var userName = $.cookie("userName");
    if (userName === null || userName === undefined) {
        $('#account-info').html("<li><div>Efetue Login!</div><a href=" + '"' + "telaCadastro.html" + '"' + ">Cadastro</a></li>");
    } else {
        $('#account-info').html("<li><div>Bem vindo " + userName + "!</li>");
    }
});