package com.example.usama.test2;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by USAMA on 6/5/2016.
 */
public class UserModel {
    public String Username;
    public String Email ;
    public String Password ;

    public UserModel(){}
    public UserModel(JSONObject jsonObject){

        try {
            this.Username=jsonObject.getString("Username");
            this.Email=jsonObject.getString("Email");
            this.Password=jsonObject.getString("Password");

        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}
