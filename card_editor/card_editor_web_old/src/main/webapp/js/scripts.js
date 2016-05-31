
function salvarUsuario() {
    $.soap({
        url: 'http://192.168.56.1:7004/SystemUserServiceImpl/SystemUserService?wsdl/',
        method: 'ns0:cadastrarUsuario',
        elementName: 'SystemUser',
        envAttributes: {
            'xmlns:ns0': 'http://system_user.ejb.card_editor.com.br/'
        },
        data: {
            userName: 'user_testejs',
            userPassword: 'teste!'
        },
        success: function (SOAPResponse) {
            $('#resposta').text("Sucesso");
        },
        error: function (SOAPResponse) {
            $('#resposta').text("Erro");
            console.log(SOAPResponse.toString());
        }
    });
}

