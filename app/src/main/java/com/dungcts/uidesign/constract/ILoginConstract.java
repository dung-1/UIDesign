package com.dungcts.uidesign.constract;

public interface ILoginConstract {
    interface IView{
        void loginFailed();
        void loginSuccess();
    }
    interface IPresenter{
        void login(String email, String password);
    }
}
