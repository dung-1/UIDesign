package com.dungcts.uidesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.dungcts.uidesign.constract.ILoginConstract;
import com.dungcts.uidesign.constract.LoginPresenter;

public class FormLoginActivity extends AppCompatActivity implements ILoginConstract.IView {
    private EditText mEdtEmail;
    private EditText mEdtPassword;
    private Button mBtnLogin;

    private ILoginConstract.IPresenter mPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_relativelayout);

        initGUI();
    }

    private void initGUI() {
        mEdtEmail = (EditText) findViewById(R.id.edt_email);
        mEdtPassword = (EditText) findViewById(R.id.edt_password);
        mBtnLogin = (Button) findViewById(R.id.btn_login);

        mBtnLogin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String email = mEdtEmail.getText().toString();
                String password = mEdtPassword.getText().toString();
                mPresenter.login(email, password);
            }
        });

        mPresenter = new LoginPresenter(this);
    }

    @Override
    public void loginFailed() {
        Toast.makeText(FormLoginActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(FormLoginActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
    }
}