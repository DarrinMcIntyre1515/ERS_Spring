$(document).ready(function() {
	$.ajax({
        url: "http://rest-service.guides.spring.io/greeting"
    }).then(function(data) {
       $('.greeting-id').append(data.id);
       $('.greeting-content').append(data.content);
    });
	$.ajax({
        url: "quote"
    }).then(function(data) {
       $('.quote').append(data.value.quote);
    });
});