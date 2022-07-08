$(document).ready($.getStu = function () {
    $("button#getstudents").click(function () {
        $("div#allStudents").html("");
        $.ajax({
            type: 'GET',
            url: 'http://localhost:9999/student',
            success: function (studentList) {
                var studentDiv = $('div#allStudents');
                $.each(studentList, function (index, student) {

                    var studentInfo = '<p>';
                    studentInfo += 'Id: ' + student.id + '<br>';
                    studentInfo += 'Name: ' + student.name + '<br>';
                    studentInfo += 'Age: ' + student.age + '<br>';
                    studentInfo += 'Mobile Number: ' + student.mobileNumber + '<br>';
                    studentInfo += 'Address: ' + student.address + '<br>';
                    studentInfo += '</p><hr>';

                    studentDiv.append(studentInfo);
                })
            },
            error: function () {
                alert('FAILURE!');

            }
        })

    })
})

// var check = false;
$(document).ready(function () {
    $("div#div1").hover(function () {

        // if (check) {
        //     $("div#div1").css("height", "172px");
        //     check = false;
        // }
        // else {
        //     $("div#div1").css("height", "700px");
        //     check = true;
        // }
        $("div#newStudent").toggle();

    })
})

var check2 = false;
$(document).ready(function () {
    $("div#div2").hover(function () {

        if (check2) {
            $("div#div2").css("height", "172");
            check2 = false;
        }
        else {
            $("div#div2").css("height", "700px");
            $("div#allStudents").css("height", "457px")
            check2 = true;
        }
        $("div#showStudent").toggle();

    })
})

var check3 = false;
$(document).ready(function () {
    $("div#div3").hover(function () {

        if (check3) {
            $("div#div3").css("height", "172px");
            check3 = false;
        }
        else {
            $("div#div3").css("height", "700px");
            check3 = true;
        }
        $("div#deleteStudent").toggle();

    })
})




$(document).ready(function () {
    $("button#poststudents").click(function () {
        $.ajax({
            type: 'POST',
            url: 'http://localhost:9999/student',
            contentType: 'application/json',
            dataType: 'json',
            data: JSON.stringify({ "name": $("input#name").val(), "age": $("input:text#age").val(), "mobileNumber": $("input:text#mobileNum").val(), "address": $("input:text#addr").val() }),
            success: function (data, textStatus, jQxhr) {
                $('#response pre').html(JSON.stringify(data));
                $('div#studentsuccess').prepend('<h5 style="font-size: large;" class="text-success">Student successfully registered</h5>');
            },
            error: function (jqXhr, textStatus, errorThrown) {
                console.log(errorThrown);
            }
        })

    })

})

$(document).ready(function () {
    $("button#deletestudent").click(function () {
        $.ajax({
            type: 'DELETE',
            url: 'http://localhost:9999/student/' + $("input#deleteId").val(),
            success: function (data) {
                $('div#deletemsg').append('<h5 style="font-size: large;" class="text-success">Successfully deleted student with id: ' + $("input#deleteId").val() + '</h5>');
            },
            error: function () {
                $('div#deletemsg').prepend('<h5 style="font-size: large;" class="text-danger">No student with id: ' + $("input#deleteId").val() + '</h5>');
            }
        })
    });

})