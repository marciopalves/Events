package br.com.ufg.www.events.mvp.user.login

import br.com.ufg.www.events.domain.UIFeedback
import br.com.ufg.www.events.model.Login

interface Contract {

    interface View : UIFeedback {
        fun login()
        fun register()
        fun onLoggedIn()
        fun loginFailed()
    }

    interface Presenter {
        fun login(login: Login)
    }

}