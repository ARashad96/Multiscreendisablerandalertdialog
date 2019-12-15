package com.ARashad96.androidbeginnerdeveloperkit;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class Multiscreendisablerandalertdialog extends AppCompatActivity {
    Button github;
    Button info;
    Button dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiscreendisablerandalertdialog);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        dialog = findViewById(R.id.dialog);
        dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Multiscreendisablerandalertdialog.this)
                        .setIcon(R.drawable.profile) // here is our own icon
                        .setTitle("Here is my own title")
                        .setMessage("Here is my own message")
                        .setPositiveButton("Yes action", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //Yes action do anything you like here
                                //if no action required leave it empty
                                Toast.makeText(Multiscreendisablerandalertdialog.this, "Do something here", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("No action", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                //No action do anything you like here
                                //if no action required leave it empty
                                Toast.makeText(Multiscreendisablerandalertdialog.this, "I am a lazy person", Toast.LENGTH_SHORT).show();
                            }
                        })
                        //.setContentView(R.layout.) optional show some content after
                        .show();
            }
        });

        github = findViewById(R.id.github);
        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/ARashad96/Multiscreendisablerandalertdialog"));
                startActivity(intent);
            }
        });
        info = findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new android.app.AlertDialog.Builder(Multiscreendisablerandalertdialog.this)
                        .setIcon(R.drawable.profile)
                        .setTitle("App info")
                        .setMessage("This app is creating a custom dialog using button, toast and linearlayout.")
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        })
                        .show();
            }
        });
    }
}
