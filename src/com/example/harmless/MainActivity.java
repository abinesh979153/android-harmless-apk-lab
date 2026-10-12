package com.example.harmless;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(24, 24, 24, 24);

        TextView title = new TextView(this);
        title.setText("Android Lab Test App");
        title.setTextSize(24);
        layout.addView(title);

        TextView message = new TextView(this);
        message.setText("Safe app for static analysis practice.");
        message.setTextSize(16);
        layout.addView(message);

        Button button = new Button(this);
        button.setText("Test Button");
        button.setOnClickListener(v ->
            message.setText("Button works successfully!")
        );
        layout.addView(button);

        setContentView(layout);
    }
}
