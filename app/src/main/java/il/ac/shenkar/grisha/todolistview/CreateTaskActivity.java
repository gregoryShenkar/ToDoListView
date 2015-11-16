package il.ac.shenkar.grisha.todolistview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class CreateTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_task);
    }

    public void submitTask(View view){
        EditText editText = (EditText) findViewById(R.id.edit_message);
        Intent returnIntent = new Intent();
        returnIntent.putExtra("result", editText.getText().toString());
        setResult(Activity.RESULT_OK, returnIntent);
        finish();
    }
}
