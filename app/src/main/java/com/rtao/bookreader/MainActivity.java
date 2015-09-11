package com.rtao.bookreader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.TextView;
import android.widget.ViewFlipper;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MAIN ACTIVITY";

    private ViewFlipper viewFlipper;
    private TextView textView;
    private float lastX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);

        textView = (TextView) findViewById(R.id.textView_1);
        textView.setText(Html.fromHtml(getString(R.string.page_1)));

        textView = (TextView) findViewById(R.id.textView_2);
        textView.setText(Html.fromHtml(getString(R.string.page_2)));

        textView = (TextView) findViewById(R.id.textView_3);
        textView.setText(Html.fromHtml(getString(R.string.page_3)));

        textView = (TextView) findViewById(R.id.textView_4);
        textView.setText(Html.fromHtml(getString(R.string.page_4)));

        textView = (TextView) findViewById(R.id.textView_5);
        textView.setText(Html.fromHtml(getString(R.string.page_5)));

        textView = (TextView) findViewById(R.id.textView_6);
        textView.setText(Html.fromHtml(getString(R.string.page_6)));

        textView = (TextView) findViewById(R.id.textView_7);
        textView.setText(Html.fromHtml(getString(R.string.page_7)));

        textView = (TextView) findViewById(R.id.textView_8);
        textView.setText(Html.fromHtml(getString(R.string.page_8)));

        textView = (TextView) findViewById(R.id.textView_9);
        textView.setText(Html.fromHtml(getString(R.string.page_9)));

        textView = (TextView) findViewById(R.id.textView_10);
        textView.setText(Html.fromHtml(getString(R.string.page_10)));

        textView = (TextView) findViewById(R.id.textView_11);
        textView.setText(Html.fromHtml(getString(R.string.page_11)));

        textView = (TextView) findViewById(R.id.textView_12);
        textView.setText(Html.fromHtml(getString(R.string.page_12)));

        textView = (TextView) findViewById(R.id.textView_13);
        textView.setText(Html.fromHtml(getString(R.string.page_13)));

        textView = (TextView) findViewById(R.id.textView_14);
        textView.setText(Html.fromHtml(getString(R.string.page_14)));

        textView = (TextView) findViewById(R.id.textView_15);
        textView.setText(Html.fromHtml(getString(R.string.page_15)));

//        textView = (TextView) findViewById(R.id.textView_16);
//        textView.setText(Html.fromHtml(getString(R.string.page_16)));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onTouchEvent(MotionEvent touchEvent) {

        switch (touchEvent.getAction()) {

            case MotionEvent.ACTION_DOWN:
                lastX = touchEvent.getX();
                Log.i(TAG, "get touch event 1");
                break;
            case MotionEvent.ACTION_UP:
                float currentX = touchEvent.getX();
                Log.i(TAG, "get touch event 2");
                // Handling left to right screen swap.
                if (lastX < currentX) {
                    Log.i(TAG, "get touch event 3");
//                    textView.setText(Html.fromHtml(getString(R.string.page_2)));
                    viewFlipper.showPrevious();
                } else if (lastX > currentX){
                    viewFlipper.showNext();
                }
                break;
            default:
                break;
        }
        return false;
    }
}

