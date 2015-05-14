$(document).ready(function () {

    $("#birthday").datepicker();

    $("button").on("click", function () {

        var data = {};
        $("input").each(function (index, element) {
            data[element.id] = element.value;
        });

        $.ajax({
            url: res.url.person.post,
            type: "POST",
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            success: function () {
            }
        });

    });

});
