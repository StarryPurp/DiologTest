package bstar128.example.hansung.diologtest;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button butd;
    String[] itemTalon={"리퍼","위도우메이커","솜브라"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butd=(Button) findViewById(R.id.but_dialog);
        butd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setTitle("탈론 맴버들");
        dialog.setIcon(R.drawable.reaper);//dialog.setIcon(R.mimap.ic_launcher);는 안드로이드 캐릭터 아이콘이다.
       // dialog.setMessage("여기는 메세지를 쓸 수 있습니다.");
        dialog.setItems(itemTalon, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                butd.setText(itemTalon[which]);
            }
        });//목록을 눌렀을때 변경
        dialog.setPositiveButton("OK",null);//나중에 null에 이벤트 삽입 가능->버튼이 클릭됬을때 변경
        dialog.show();
    }

}
