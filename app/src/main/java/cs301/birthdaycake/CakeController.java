package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
    //Instance Vars
    private CakeView pCV;
    private CakeModel pCM;


    public CakeController(CakeView cV) {
        //Setters
        pCV = cV;
        pCM = cV.getCakeController();
    }

    public void onClick(View button) {
        Log.d("button", "Cake Controller onClick");

        pCM.candlesLit = false;
        pCV.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton bV, boolean checked) {
        Log.d("switch2", "Cake Controller candleSwitch");

        if(!checked) {
            pCM.hasCandles = false;
            pCV.invalidate();
        }else {
            pCM.hasCandles = true;
            pCV.invalidate();
        }
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        pCM.candleCake = i;
        pCV.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
