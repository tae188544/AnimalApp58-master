package sdu.cs58.pichsinee.animalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nameEditText;
    Button startButton;
    String nameSring;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.edtName);
        startButton = findViewById(R.id.button);
     startButton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             nameSring = nameEditText.getText().toString().trim();

             if (nameSring.length() == 0) {
                 Toast.makeText(getApplicationContext(), "กรุณาใส่ชื่อ", Toast.LENGTH_SHORT).show();
             } else {

                 Intent startIntent = new Intent(MainActivity.this,GameActivity.class);
                 startIntent.putExtra("Name", nameSring);
                 startActivity(startIntent);

             }
         }

         }
    );


    }//end onCreate Method

}//end Class
