
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function verificarGrowl() {
    var err = $("body").find("[class*='ui-growl-image-error']");
    var warn = $("body").find("[class*='ui-growl-image-warn']");
    var sucess = $("body").find("[class*='ui-growl-image-info']");

    if (err !== undefined && err.is(":visible")) {
        var growl = $("body").find("[class*='ui-growl-item-container']");
        var els = $(growl).find("[class*='ui-growl-image-error']");
        if (els !== undefined && els.length > 0) {
            for (var i = 0, l = growl.length; i < l; i++) {
                var el = $(growl[i]).find("[class*='ui-growl-image-error']");
                if (el !== undefined && el.length > 0) {
                    if (growl[i].className === undefined
                            || (growl[i].className !== undefined &&
                                    growl[i].className.indexOf(" error-growl") < 0)) {
                        growl[i].className += " error-growl";
                    }
                    growl[i].className.replace(" sucess-growl", "");
                    growl[i].className.replace(" warn-growl", "");
                }
            }
        }
    }
    if (warn !== undefined && warn.is(":visible")) {
        var growl = $("body").find("[class*='ui-growl-item-container']");
        var els = $(growl).find("[class*='ui-growl-image-warn']");
        if (els !== undefined && els.length > 0) {
            for (var i = 0, l = growl.length; i < l; i++) {
                var el = $(growl[i]).find("[class*='ui-growl-image-warn']");
                if (el !== undefined && el.length > 0) {
                    if (growl[i].className === undefined
                            || (growl[i].className !== undefined &&
                                    growl[i].className.indexOf(" warn-growl") < 0)) {
                        growl[i].className += " warn-growl";
                    }
                    growl[i].className.replace(" sucess-growl", "");
                    growl[i].className.replace(" error-growl", "");
                }
            }
        }
    }
    if (sucess !== undefined && sucess.is(":visible")) {
        var growl = $("body").find("[class*='ui-growl-item-container']");
        var els = $(growl).find("[class*='ui-growl-image-info']");
        if (els !== undefined && els.length > 0) {
            for (var i = 0, l = growl.length; i < l; i++) {
                var el = $(growl[i]).find("[class*='ui-growl-image-info']");
                if (el !== undefined && el.length > 0) {
                    if (growl[i].className === undefined
                            || (growl[i].className !== undefined &&
                                    growl[i].className.indexOf(" sucess-growl") < 0)) {
                        growl[i].className += " sucess-growl";
                    }
                    growl[i].className.replace(" warn-growl", "");
                    growl[i].className.replace(" error-growl", "");
                }
            }
        }
    }
}
