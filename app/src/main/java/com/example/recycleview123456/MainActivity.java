package com.example.recycleview123456;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class MainActivity extends AppCompatActivity {

    interface Apiservice {
        @GET("/posts")
        Call<List<item>> getitem();
    }
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title=findViewById(R.id.title);
        Apiservice users = retrofit.create(Apiservice.class);

        users.getitem().enqueue(new Callback<List<item>>() {
            @Override
            public void onResponse(Call<List<item>> call, Response<List<item>> response) {
                Log.e("usersResponse",response.body().toString());
                title.setText(response.body().get(15).body);
            }

            @Override
            public void onFailure(Call<List<item>> call, Throwable t) {
                Log.e("userResponseFail",t.toString());

            }
        });


    }
}





