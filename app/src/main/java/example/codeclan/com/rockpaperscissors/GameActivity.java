package example.codeclan.com.rockpaperscissors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 18/01/2017.
 */

public class GameActivity extends AppCompatActivity{
    Button rock_button;
    Button paper_button;
    Button scissors_button;
    String playerChoice = "";
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game);

        rock_button = (Button)findViewById(R.id.rock_button);
        paper_button = (Button)findViewById(R.id.paper_button);
        scissors_button = (Button)findViewById(R.id.scissors_button);

        intent = new Intent(GameActivity.this, ResultActivity.class);
    }


    public void onRockButtonPressed(View Button){
        playerChoice = "Rock";
        intent.putExtra("playerChoice", playerChoice);

        startActivity(intent);
    }


    public void onPaperButtonPressed(View Button){
        playerChoice = "Paper";
        intent.putExtra("playerChoice", playerChoice);

        startActivity(intent);
    }


    public void onScissorsButtonPressed(View Button){
        playerChoice = "Scissors";
        intent.putExtra("playerChoice", playerChoice);

        startActivity(intent);
    }


}
