package com.websocket.controler;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.websocket.model.EnviarMensajeWS;
import com.websocket.model.Metoreologia;
import com.websocket.util.Util;

@Controller
public class WebSocketController {

	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public EnviarMensajeWS conexionOk(Metoreologia message) throws Exception {
		return new EnviarMensajeWS(HtmlUtils.htmlEscape(Util.compareUTC(message.getcDateUTC())));
	}
}
