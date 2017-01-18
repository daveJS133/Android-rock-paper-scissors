package example.codeclan.com.rockpaperscissors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by user on 18/01/2017.
 */

public class ResultActivity extends AppCompatActivity {
    TextView player_text;
    TextView com_text;
    TextView result_text;

    Game game = new Game();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_result);
        player_text = (TextView)findViewById(R.id.player_choice_out);
        com_text = (TextView)findViewById(R.id.com_choice_out);
        result_text = (TextView)findViewById(R.id.winner);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String playerChoice = extras.getString("playerChoice");

        String comChoice = game.make_choice();

        String result = game.play(playerChoice,comChoice);


        player_text.setText(playerChoice);
        com_text.setText(comChoice);
        result_text.setText(result);
    }

}
