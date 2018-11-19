package edu.umkc.readtome;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;

/*import static edu.umkc.readtome.Recording.book_count;*/

public class ReadToMe extends AppCompatActivity {
    private Button record_new_book, book1, book2, book3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_to_me);
        record_new_book = (Button) findViewById(R.id.record_new_book);
        record_new_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRecording();
            }
        });
        book1 = (Button) findViewById(R.id.book1);
        book2 = (Button) findViewById(R.id.book2);
        book3 = (Button) findViewById(R.id.book3);

        book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = new MediaPlayer();
                try {
                    mediaPlayer.setDataSource(Recording.outputFile);
                    mediaPlayer.prepare();
                    mediaPlayer.start();

                } catch (Exception e) {
                }
            }
        });
    }
    public void openRecording(){
        Intent recording = new Intent(this, Recording.class);
        startActivity(recording);
    }


    @Override
    protected void onResume() {
        if ((Recording.showButton=true) && (Recording.book_count==1)){
            book1.setVisibility(View.VISIBLE);
        }
        if ((Recording.showButton=true) && (Recording.book_count==2)) {
            book2.setVisibility(View.VISIBLE);
        }
        if ((Recording.showButton=true) && (Recording.book_count==3)){
                book3.setVisibility(View.VISIBLE);
        }
        super.onResume();
    }




}