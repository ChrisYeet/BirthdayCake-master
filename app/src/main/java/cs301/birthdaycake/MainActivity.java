package cs301.birthdaycake;

import android.arch.lifecycle.AndroidViewModel;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView findID = findViewById(R.id.cakeview);
        CakeController CC = new CakeController(findID);

        Button buttonView = findViewById(R.id.button);
        buttonView.setOnClickListener(CC);

        CompoundButton candlesSwitch = findViewById(R.id.switch2);
        candlesSwitch.setOnCheckedChangeListener(CC);

        SeekBar amtCandles = findViewById(R.id.seekBar3);
        amtCandles.setOnSeekBarChangeListener(CC);
    }

    public void goodbye(View button) {
        Log.i("button", "Goodbye");
    }
}
