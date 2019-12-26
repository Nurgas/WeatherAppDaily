package kg.nurga.weatherappdaily;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChangeCityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chnge_city);

        final EditText editTextField = findViewById(R.id.editCityName);
        Button backButton = findViewById(R.id.showBtn);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newCity = editTextField.getText().toString();
                Intent newCityIntent = new Intent(ChangeCityActivity.this, MainActivity.class);

                newCityIntent.putExtra("City", newCity);

                setResult(Activity.RESULT_OK, newCityIntent);
                finish();
            }
        });


        editTextField.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                String newCity = editTextField.getText().toString();
                Intent newCityIntent = new Intent(ChangeCityActivity.this, MainActivity.class);

                newCityIntent.putExtra("City", newCity);

                setResult(Activity.RESULT_OK, newCityIntent);

                finish();
                return true;
            }
        });
    }
}
