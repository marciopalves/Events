package br.com.ufg.www.events.mvp.register

import br.com.ufg.www.events.extensions.isValid
import br.com.ufg.www.events.model.RegisterUser

class Presenter(private val view: Contract.View) : Contract.Presenter {

    private val interactor = Interactor()

    override fun register(registerUser: RegisterUser) {
        val callback = { id: Long ->
            if (id.isValid()) {
                view.onRegistered()
            }
        }

        interactor.register(registerUser, callback).start()
    }
}