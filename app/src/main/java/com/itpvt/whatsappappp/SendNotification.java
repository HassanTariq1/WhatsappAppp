package com.itpvt.whatsappappp;

import com.onesignal.OneSignal;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Hassan on 10/17/2018.
 */


    public class SendNotification {

        public SendNotification(String message, String heading, String notificationKey){

            notificationKey = "2ba4fc96-2d4a-43c8-b96a-07962d9dd75b";
            try {
                JSONObject notificationContent = new JSONObject(
                        "{'contents':{'en':'" + message + "'},"+
                                "'include_player_ids':['" + notificationKey + "']," +
                                "'headings':{'en': '" + heading + "'}}");
                OneSignal.postNotification(notificationContent, null);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
}
