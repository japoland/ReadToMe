package edu.umkc.readtome;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ReadToMe extends AppCompatActivity {
    private Button record_new_book;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_to_me);
        record_new_book = (Button) findViewById(R.id.record_new_book);
        record_new_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRecording();
            }
        });
    }
    public void openRecording(){
        Intent recording = new Intent(this, Recording.class);
        startActivity(recording);
    }
}