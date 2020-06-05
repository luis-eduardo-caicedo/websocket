var stompClient = null;

function connect() {
	var socket = new SockJS('/gs-guide-websocket');
	stompClient = Stomp.over(socket);
	stompClient.connect({}, function(frame) {
		// setConnected(true);
		console.log('Connected: ' + frame);
		stompClient.subscribe('/topic/greetings', function(greeting) {
			showGreeting(greeting.body);
		});
	});
}

function sendName() {
	stompClient.send("/app/hello", {}, JSON.stringify({
		'cDateUTC' : new Date()
	}));
}

function showGreeting(message) {
	var v = JSON.parse(message);
	$("#dato").html(v.cMensajeEnviar);
}

$(document).ready(function() {
	connect();
	function getMeteorologia() {
		sendName();
	}
	setInterval(getMeteorologia, 3000);
});