package com.dungcts.uidesign.constract;

import android.content.Context;
import android.widget.Toast;

import com.dungcts.uidesign.FormLoginActivity;
import com.dungcts.uidesign.data.model.User;

public class LoginPresenter implements ILoginConstract.IPresenter{
    User userList[] = {
            new User("admin", "123"),
            new User("us", "123")
    };
    private ILoginConstract.IView mView;
    public LoginPresenter(ILoginConstract.IView view) {
        mView = view;
    }
    @Override
    public void login(String email, String password) {
        for (User user : userList) {
            if(email == user.email && user.password == "123"){
                mView.loginSuccess();
                return;
            }
            mView.loginFailed();
        }
    }
}
