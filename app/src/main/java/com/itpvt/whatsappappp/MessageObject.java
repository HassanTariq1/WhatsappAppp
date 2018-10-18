package com.itpvt.whatsappappp;

import java.util.ArrayList;

/**
 * Created by Hassan on 10/17/2018.
 */

public class MessageObject  {


        String  messageId,
                senderId,
                message;

        ArrayList<String> mediaUrlList;

        public MessageObject(String messageId, String senderId, String message, ArrayList<String> mediaUrlList){
            this.messageId = messageId;
            this.senderId = senderId;
            this.message = message;
            this.mediaUrlList = mediaUrlList;
        }

        public String getMessageId() {
            return messageId;
        }
        public String getSenderId() {
            return senderId;
        }
        public String getMessage() {
            return message;
        }
        public ArrayList<String> getMediaUrlList() {
            return mediaUrlList;
        }
    }

