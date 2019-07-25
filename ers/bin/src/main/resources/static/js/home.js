$(document).ready(function() {
	$.ajax({ // This is the REST call for the the id and 'hello world' greeting.
        url: "http://rest-service.guides.spring.io/greeting"
    }).then(function(data) {
       $('.greeting-id').append(data.id);
       $('.greeting-content').append(data.content);
    });
	$.ajax({ // REST call for random Spring quote.
        url: "quote"
    }).then(function(data) {
       $('.quote').append(data.value.quote);
    });
});