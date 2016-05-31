

function salvarUsuario() {
    jQuery.support.cors = true;
    $.soap({
        url: 'http://' + window.location.hostname + ':' + window.location.port + '/SystemUserServiceImpl/SystemUserService?wsdl/',
        method: 'alterarUsuario',
        elementName: 'ns0:SystemUser',
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
function salvarUsuario2() {
    jQuery.support.cors = true;
    var wsUrl = "http://172.22.248.163:7004/SystemUserServiceImpl/SystemUserService?wsdl";
    var soapRequest = '<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">    <soap:Body>        <ns1:cadastrarUsuario xmlns:ns1="http://system_user.ejb.card_editor.com.br/">            <SystemUser>                <userName>StringValue</userName>                <userPassword>StringValue</userPassword>            </SystemUser>        </ns1:cadastrarUsuario>    </soap:Body></soap:Envelope>';


    $.ajax({
        type: "POST",
        url: wsUrl,
        contentType: "text/xml",
        dataType: "xml",
        data: soapRequest
    });
}
function soap() {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open('POST', 'http://localhost:7004/SystemUserServiceImpl/SystemUserService', true);

    // build SOAP request
    var sr =
            '<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">' +
            '<soap:Body>' +
            '<ns1:alterarUsuario xmlns:ns1="http://system_user.ejb.card_editor.com.br/">' +
            '<SystemUser>' +
            '<userName>StringValue</userName>' +
            '<userPassword>StringValue</userPassword>'
    ' </SystemUser>'
    '</ns1:alterarUsuario>'
    '</soap:Body>'
    '</soap:Envelope>';

    xmlhttp.onreadystatechange = function () {
        if (xmlhttp.readyState == 4) {
            if (xmlhttp.status == 200) {
                alert('done. use firebug/console to see network response');
            }
        }
    }
    // Send the POST request
    xmlhttp.setRequestHeader('Content-Type', 'text/xml');
    xmlhttp.send(sr);
    // send request
    // ...
}