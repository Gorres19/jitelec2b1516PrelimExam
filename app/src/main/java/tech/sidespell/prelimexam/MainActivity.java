package tech.sidespell.prelimexam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton start;
    RadioButton increment,decrement;
    SeekBar seek;
    TextView counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

          Start = (ToggleButton) findViewById(R.id.TogBut);
          increment = (RadioButton) findViewById(R.id.RbtnInc);
          decrement = (RadioButton) findViewById(R.id.RbtnDec);
          seek = (SeekBar) findViewById(R.id.seekBar);
          counter = (TextView) findViewById(R.id.TvCount);

          seek.setProgress(0);
          seek.setMax(1000);
          seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                counter.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }


}
