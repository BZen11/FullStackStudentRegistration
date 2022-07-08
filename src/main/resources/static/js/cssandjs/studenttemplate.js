/*$(document).ready(function () {
	alert("hi");
    $("button#getstudents").click(function () {
        $.ajax({
            type: 'GET',
            url: 'http://localhost:9999/student',
            // Get url of studentRegistrationApp
            success: function (studentList) {
	alert("result:" + studentList);
                var studentDiv = $('div#allStudents');
                //$("div#allContacts").html(result);
                
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
    });

})*/