package com.example.paddleocr;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.example.paddleocrlib.BaseResult;
import com.example.paddleocrlib.OcrPredictionForImageText;

public class MainActivity extends AppCompatActivity {
    OcrPredictionForImageText obj;
    private static final int INTENT_CODE_PICK_IMAGE = 100;

    Uri selectedImageUri;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);



        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            if (Environment.isExternalStorageManager()) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent, INTENT_CODE_PICK_IMAGE);
            } else {
                try {
                    Intent intent = new Intent(Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION);
                    intent.addCategory("android.intent.category.DEFAULT");
                    intent.setData(Uri.parse(String.format("package:%s", getApplicationContext().getPackageName())));
                    startActivityForResult(intent, 2296);
                } catch (Exception e) {
                    Intent intent = new Intent();
                    intent.setAction(Settings.ACTION_MANAGE_ALL_FILES_ACCESS_PERMISSION);
                    startActivityForResult(intent, 2296);
                }
            }
        }


    }

    public void render(View view)
    {
        if (selectedImageUri != null)
        {

            obj = new OcrPredictionForImageText(selectedImageUri , this , 0.2f );
            BaseResult resultobj  =   obj.detail(this);
            textView = (TextView) findViewById(R.id.textview);
            if (resultobj != null)
            {
            String result = "";
            if (resultobj.isZimbabwe())
            {
                result = result+resultobj.getIdNumber()+"\n";
                result = result+resultobj.getDateOfBirth()+"\n";
                result = result+resultobj.getSex()+"\n";
                result = result+resultobj.getSurname()+"\n";
                result = result+resultobj.getLastName()+"\n";
                result = result+resultobj.getVillageOfOrigin()+"\n";
                result = result+resultobj.getDateOfIssue()+"\n";
            }
            else if (resultobj.isPassport())
            {
                result = result+resultobj.getIdNumber()+"\n";
                result = result+resultobj.getDateOfBirth()+"\n";
                result = result+resultobj.getSex()+"\n";
                result = result+resultobj.getNationality()+"\n";
            }
            else if (resultobj.isAfricaCard()) {
                result = result+resultobj.getIdNumber()+"\n";
                result = result+resultobj.getDateOfBirth()+"\n";
                result = result+resultobj.getSex()+"\n";
                result = result+resultobj.getNationality()+"\n";
                result = result+resultobj.getSurname()+"\n";
                result = result+resultobj.getLastName()+"\n";
                result = result+resultobj.getBirthCountry()+"\n";
                result = result+resultobj.getStatus()+"\n";
            }
            else {
                result = "unknwon";
            }
            textView.setText(result);
            textView.setVisibility(View.VISIBLE);
            }
        }
        else
        {
            Toast.makeText(this, " Uri is null ", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == INTENT_CODE_PICK_IMAGE) {
            if (resultCode == Activity.RESULT_OK) {
                selectedImageUri = data.getData();
            }
        }
    }
}