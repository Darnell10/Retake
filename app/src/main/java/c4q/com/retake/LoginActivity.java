package c4q.com.retake;

import android.app.ListActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

/**
 * Created by D on 1/16/18.
 */

public class LoginActivity  extends AppCompatActivity{

    /** 2. Create variable call "Login"  set the value to Shared preference */
    private SharedPreferences login;


    private static final String SHARED_PREF_KEY = "work";
    /**v  3.create variable for the xml properties */


    EditText userName;
    EditText passWord;
    CheckBox checkBox1;
    Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        //4.get layout info from xml into the onCreate method t
        login = getSharedPreferences(SHARED_PREF_KEY, MODE_PRIVATE);

        userName = (EditText) findViewById(R.id.login_text1);
        passWord = (EditText) findViewById(R.id.password_text2);
        checkBox1 = (CheckBox) findViewById(R.id.checkbox);
        button1 = (Button) findViewById(R.id.button);


        button1.setOnClickListener(new View.OnClickListener() {

            //5. create onclick logic
            @Override
            public void onClick(View v) {
                //6.create an instance of the Editor class and assign it the value of login and the .edit() method.
                SharedPreferences.Editor editor = login.edit();
                // 7. the below code checks to see if the checkBox1 is checked
                if (checkBox1.isChecked()) {
                    //code take the user input gets user input and checks to see if CheckBox1 is clicked
                    //then commits it
                    editor.putString("username", userName.getText().toString());
                    editor.putString("password", passWord.getText().toString());
                    editor.putBoolean("isChecked", checkBox1.isChecked());
                    editor.commit();
                }


                String checkUser = "user" + userName.getText().toString();
                String checkPassword = "password" + userName.getText().toString();

                // code below checks to see if userName is equal to "user@aol.com" && password equal to "password1234"
                //then an intent to another class begins. Put extra the userName with a key of current
                // then the activity is started.
                if (userName.getText().toString().equals("user@aol.com") && passWord.getText().toString().equals("password1234")) {
                    Intent intent = new Intent(getApplicationContext(), ListActivity.class);
                    intent.putExtra("current", userName.getText().toString());
                    startActivity(intent);
                }

            }
        });

    }




}
