package com.example.usama.test2;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by USAMA on 6/5/2016.
 */
public class UserDA {
    public ArrayList<UserModel> GetUsers(String result){

        ArrayList<UserModel> listModel= new ArrayList<UserModel>();
        try {
            JSONArray jsonArray= new JSONArray(result);
            int length =jsonArray.length();

            for (int i=0;i<length;i++ ){
                JSONObject jsonObject=jsonArray.getJSONObject(i);
                UserModel model= new UserModel(jsonObject);
                listModel.add(model);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return listModel;
    }
}
