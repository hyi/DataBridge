package org.renci.databridge.mhandling;

import com.rabbitmq.client.*;

public interface BaseHandler{

  public void handle(String msg, Channel channel, String LOG_QUEUE) throws Exception;

}