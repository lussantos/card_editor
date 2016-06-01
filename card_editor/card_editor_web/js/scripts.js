$('.alert-success').hide();
$('.alert-danger').hide();
function salvarUsuario() {
    if ($('#resp_user').text === 'Usuário já existe' || $('#resp_user').text === 'Favor selecionar um usupario válido.' || document.getElementById("name").value === '') {
        $('#resp_user').text('Favor selecionar um usuário válido.');
        window.scrollTo(0, 0);
    } else {
        jQuery.support.cors = true;
        var wsUrl = "http://" + window.location.hostname + ":7004/SystemAccountServiceImpl/SysteAcountService?WSDL";
        var soapRequest = createSoapRequest('criarContaUsuario', 'InSalvarUsuarioPlayer');
        $.ajax({
            crossDomain: false,
            type: "POST",
            url: wsUrl,
            contentType: "text/xml",
            dataType: "xml",
            data: soapRequest,
            success: processSuccess,
            error: processError
        });
    }
}

function createSoapRequest(method, parameterClass) {
    var a = "<soap:Envelope xmlns:soap=" + '"' + "http://schemas.xmlsoap.org/soap/envelope/" + '"' + ">" +
            "<soap:Body>" +
            "<ns1:" + method + " xmlns:ns1=" + '"' + "http://system_account.ejb.card_editor.com.br/" + "" + '"' + "" + ">";
    a += "<" + parameterClass + ">";
    a += "<playerBean>";
    a += "<dataNascimento>" + document.getElementById("bday").value + "</dataNascimento>";
    a += "<descricao>" + document.getElementById("desc").value + "</descricao>";
    a += "<email>" + document.getElementById("email").value + "</email>";
    a += "<idPlayer>";
    a += "    <nick_name>" + document.getElementById("name").value + "</nick_name>";
    a += "    <tp_conta>" + document.getElementById("bday").value + "</tp_conta>";
    a += "</idPlayer>";
    a += "<nome>" + document.getElementById("bday").value + "</nome>";
    a += "<usuarioSistema>" + document.getElementById("usr").value + "</usuarioSistema>";
    a += "</playerBean>";
    a += "<systemUserBean>";
    a += "<userName>" + document.getElementById("usr").value + "</userName>";
    a += "<userPassword>" + document.getElementById("pwd").value + "</userPassword>";
    a += "</systemUserBean>";
    a += "</" + parameterClass + ">";
    a += " </ns1:" + method + ">" +
            "</soap:Body>" +
            "</soap:Envelope>";
    return a.toString();
}
function verificaUsuario() {
    if (document.getElementById("usr") !== null && document.getElementById("usr").value !== "") {
        jQuery.support.cors = true;
        var wsUrl = "http://" + window.location.hostname + ":7004/SystemUserServiceImpl/SystemUserService?WSDL";
        var soapRequest = createSoapRequestSimgleParameter('verificaExistenciaUsuario', 'SystemUser', 'system_user', [['userName', document.getElementById("usr").value]]);
        $.ajax({
            crossDomain: false,
            type: "POST",
            url: wsUrl,
            contentType: "text/xml",
            dataType: "xml",
            data: soapRequest,
            success: processSuccessVerification,
            error: processError
        });
    }
}
function createSoapRequestSimgleParameter(method, parameterClass, packageName, parameterValue) {

    var a = "<soap:Envelope xmlns:soap=" + '"' + "http://schemas.xmlsoap.org/soap/envelope/" + '"' + ">" +
            "<soap:Body>" +
            "<ns1:" + method + " xmlns:ns1=" + '"' + "http://" + packageName + ".ejb.card_editor.com.br/" + "" + '"' + "" + ">";
    a += "<" + parameterClass + ">";
    for (var n = 0; n < parameterValue.length; n++) {
        a += "<" + parameterValue[n][0] + ">" + parameterValue[n][1] + "</" + parameterValue[n][0] + ">";
    }
    a += "</" + parameterClass + ">" +
            " </ns1:" + method + ">" +
            "</soap:Body>" +
            "</soap:Envelope>";
    return a.toString();
}

function processSuccessVerification(data, status, req) {
    if ($(req.responseXML).find("existe").text() === "true") {
        $('#resp_user').text('Usuário já existe');
    } else {
        $('#resp_user').text('Usuário válido!');
    }
}


function processSuccess(data, status, req) {
    if (status === "success") {
        $('#successMessage').text("Salvo com sucesso!");
         $('#resp_user').text('');
    }
}

function processError(data, status, req) {

}