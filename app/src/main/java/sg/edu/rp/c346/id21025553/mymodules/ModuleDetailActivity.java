package sg.edu.rp.c346.id21025553.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvAnswer;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvAnswer = findViewById(R.id.textView);
        backButton = findViewById(R.id.backButton);
        String moduleInfo = "";

        Intent intentReceived = getIntent();

        if(intentReceived.hasExtra("ModuleC203")){
            String modulesSelected = intentReceived.getStringExtra("ModuleC203");
            moduleInfo = "Module Code: " + modulesSelected;
            moduleInfo += "\nModule Name: Web Application Development in PHP";
            moduleInfo += "\nAcademic Year: 2022" + "\nSemester: 1" + "\nModule Credit: 4" + "\nVenue: W65H";

        } else if (intentReceived.hasExtra("ModuleC206")){
            String modulesSelected = intentReceived.getStringExtra("ModuleC206");
            moduleInfo = "Module Code: " + modulesSelected;
            moduleInfo += "\nModule Name: Software Development Process";
            moduleInfo += "\nAcademic Year: 2022" + "\nSemester: 1" + "\nModule Credit: 4" + "\nVenue: E66K";

        } else if (intentReceived.hasExtra("ModuleC218")){
            String modulesSelected = intentReceived.getStringExtra("ModuleC218");
            moduleInfo = "Module Code: " + modulesSelected;
            moduleInfo += "\nModule Name: UI/UX Design for Apps";
            moduleInfo += "\nAcademic Year: 2022" + "\nSemester: 1" + "\nModule Credit: 4" + "\nVenue: E66B";

        } else if (intentReceived.hasExtra("ModuleC235")){
            String modulesSelected = intentReceived.getStringExtra("ModuleC235");
            moduleInfo = "Module Code: " + modulesSelected;
            moduleInfo += "\nModule Name: IT Security and Management";
            moduleInfo += "\nAcademic Year: 2022" + "\nSemester: 1" + "\nModule Credit: 4" + "\nVenue: E66G";

        } else if (intentReceived.hasExtra("ModuleC346")){
            String modulesSelected = intentReceived.getStringExtra("ModuleC346");
            moduleInfo = "Module Code: " + modulesSelected;
            moduleInfo += "\nModule Name: Mobile App Development";
            moduleInfo += "\nAcademic Year: 2022" + "\nSemester: 1" + "\nModule Credit: 4" + "\nVenue: E62E";

        } else {
            String modulesSelected = intentReceived.getStringExtra("ModuleG953");
            moduleInfo = "Module Code: " + modulesSelected;
            moduleInfo += "\nModule Name: Life Skills III";
            moduleInfo += "\nAcademic Year: 2022" + "\nSemester: 1" + "\nModule Credit: 1" + "\nVenue: Home (Home-Based Learning)";
        }

        tvAnswer.setText(moduleInfo);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }
}