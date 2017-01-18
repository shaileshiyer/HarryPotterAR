package com.example.shailesh.harrypotterar;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.threed.jpct.Config;
import com.threed.jpct.World;

import org.artoolkit.ar.jpct.ArJpctActivity;
import org.artoolkit.ar.jpct.TrackableObject3d;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ArActivity extends ArJpctActivity {
    private TextView txtSpeechInput;
    private SpeechRecognizerManager mSpeechRecognizerManager;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar);

        txtSpeechInput = (TextView) findViewById(R.id.txtSpeechInput);
        mSpeechRecognizerManager = new SpeechRecognizerManager(this);
    }

    @Override
    protected FrameLayout supplyFrameLayout() {
        return (FrameLayout)this.findViewById(R.id.cameraview);
    }

    @Override
    protected void populateTrackableObjects(List<TrackableObject3d> list) {

    }

    @Override
    public void configureWorld(World world) {
        Config.farPlane = 2000;
        world.setAmbientLight(255, 255, 255);
    }


}
