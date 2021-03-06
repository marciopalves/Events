package br.com.ufg.www.events.mvp.places.register

import br.com.ufg.www.events.database.AppDatabase
import br.com.ufg.www.events.model.Place
import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.launch

class Interactor {

    fun register(place: Place, callback: ((Long) -> Unit)) = launch(UI) {
        val deferred = async(CommonPool) { AppDatabase.getInstance().placeDAO().insert(place.toEntity()) }
        val result = deferred.await()
        callback.invoke(result)
    }

}