package com.door43.obt.ata;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.content.Intent;


public class SplashActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        startAnimating();
    }

    private void startAnimating() {
        // Fade in top title
        TextView logo1 = (TextView) findViewById(R.id.splashText);
        Animation fade1 = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        if (fade1 != null) {
            logo1.startAnimation(fade1);
            fade1.setAnimationListener(new AnimationListener() {
                public void onAnimationEnd(Animation animation) {
                    // The animation has ended, transition to the Main Menu screen
                    startActivity(new Intent(SplashActivity.this, MenuListActivity.class));
                    SplashActivity.this.finish();
                }

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }
            });
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.splash, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
