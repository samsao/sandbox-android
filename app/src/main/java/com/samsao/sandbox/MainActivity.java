package com.samsao.sandbox;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.main_telephone_button)
    void onTelephoneButtonClick() {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "5144321234", null));
        startActivity(intent);
    }
}
