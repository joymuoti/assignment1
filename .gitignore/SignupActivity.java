package assignment1.com.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

      Button btnSignup=(Button) findViewById(R.id.button);

        final EditText txtFname=(EditText) findViewById(R.id.fname);
        final EditText txtlname=(EditText) findViewById(R.id.lname);
        final EditText txtphonenumber=(EditText) findViewById(R.id.phonenumber);
        final EditText txtemail=(EditText) findViewById(R.id.email);
        final EditText txtpassword=(EditText) findViewById(R.id.password);

        btnSignup.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                String fnamevalue=txtFname.getText().toString();
                String lnamevalue=txtlname.getText().toString();
                String phonenumbervalue=txtphonenumber.getText().toString();
                String emailvalue=txtemail.getText().toString();
                String passwordvalue=txtpassword.getText().toString();

                Intent homeintent = new Intent(SignupActivity.this, HomeActivity.class);
                startActivity(homeintent);
            }
                                     }


        );

    }

}
