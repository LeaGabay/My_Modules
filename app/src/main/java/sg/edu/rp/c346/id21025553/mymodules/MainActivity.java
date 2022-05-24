package sg.edu.rp.c346.id21025553.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Creating Variables
    TextView tvC203, tvC206, tvC218, tvC235, tvC346, tvG953;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Linking variables to UI elements
        tvC203 = findViewById(R.id.tvC203);
        tvC206 = findViewById(R.id.tvC206);
        tvC218 = findViewById(R.id.tvC218);
        tvC235 = findViewById(R.id.tvC235);
        tvC346 = findViewById(R.id.tvC346);
        tvG953 = findViewById(R.id.tvG953);

        // Click event - C203
        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleC203", "C203");
                startActivity(intent);
            }
        });

        // Click event - C206
        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleC206", "C206");
                startActivity(intent);
            }
        });

        // Click event - C218
        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleC218", "C218");
                startActivity(intent);
            }
        });

        // Click event - C235
        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleC235", "C235");
                startActivity(intent);
            }
        });

        // Click event - C346
        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleC346", "C346");
                startActivity(intent);
            }
        });

        // Click event - G953
        tvG953.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleG953", "G953");
                startActivity(intent);
            }
        });
    }
}