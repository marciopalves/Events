package br.com.ufg.www.events.mvp.login;

import br.com.ufg.www.events.domain.UIFeedback;
import br.com.ufg.www.events.model.Login;

public interface Contract {

    interface View extends UIFeedback {
        void login();

        void onLoggedIn();
    }

    interface Presenter {
        void login(Login login);
    }

    interface Interactor {
        void login(Login login);
    }

}