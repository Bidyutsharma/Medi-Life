package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.util.Log;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.example.signup.JSONAdapter;
import com.example.signup.JSONDomain;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class TopHospital extends AppCompatActivity {
    RecyclerView recyclerView ;
    List<JSONDomain> jsonDomains;
    JSONAdapter adapter;
    private static String JSON_URL="https://api.npoint.io/09d6df45ca015e58c1f2" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_hospital);
        recyclerView=findViewById(R.id.clientList);
        jsonDomains=new ArrayList<>();

        extractClients();
    }
    private void extractClients(){
        RequestQueue queue= Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest=new JsonArrayRequest(Request.Method.GET, JSON_URL, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject clientObject = response.getJSONObject(i);

                        JSONDomain jsonDomain = new JSONDomain();
                        jsonDomain.setTitle(clientObject.getString("name").toString());

                        jsonDomain.setDetails(clientObject.getString("about").toString());
                        jsonDomain.setCoverImage(clientObject.getString("img"));

                        jsonDomain.setURL(clientObject.getString("url"));

                        jsonDomains.add(jsonDomain);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                adapter = new JSONAdapter(getApplicationContext(), jsonDomains);
                recyclerView.setAdapter(adapter);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("tag", "onErrorResponse: " + error.getMessage());
            }
        });
        queue.add(jsonArrayRequest);
    }
}