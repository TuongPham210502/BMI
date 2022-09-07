package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
//public class MainActivity extends AppCompatActivity {
//    private Button bt;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//}
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText socannang, sochieucao;
    private TextView showketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        socannang = findViewById(R.id.cannang);
        sochieucao = findViewById(R.id.chieucao);
        showketqua = findViewById(R.id.ketqua);
        findViewById(R.id.btTinh).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        float chieucao =Float.parseFloat(sochieucao.getText().toString());
        float cannang = Float.parseFloat(socannang.getText().toString());
        chieucao=chieucao/100;
        float ketqua = 0;
        if(view.getId() == R.id.btTinh)
        {
            ketqua = cannang / (chieucao * chieucao);
            if(ketqua < 16 )
                showketqua.setText("BMI = "+ketqua+": Gầy độ III");
            else if (ketqua<17)
                showketqua.setText("BMI = "+ketqua+": Gầy độ II");
            else if (ketqua <18.5 )
                showketqua.setText("BMI = "+ketqua+": Gầy độ I");
            else if (ketqua <25 )
                showketqua.setText("BMI = "+ketqua+": Bình thường");
            else if (ketqua <30 )
                showketqua.setText("BMI = "+ketqua+": Thừa cân");
            else if (ketqua <35 )
                showketqua.setText("BMI = "+ketqua+": Béo phì độ I");
            else if (ketqua <40 )
                showketqua.setText("BMI = "+ketqua+": Béo phì II");
            else
                showketqua.setText("BMI = "+ketqua+": Béo phì III");
        }
    }
}