$(document).ready(function() {
	$.ajax({ // call to RESTController to consume REST API.
        url: "quote"
    }).then(function(data) {
       $('.quote').append(data.value.quote);
    });
	
	$.ajax({
        url: "username"
    }).then(function(data) {
       $(".username").html("Welcome " + data.firstname)
    });
});