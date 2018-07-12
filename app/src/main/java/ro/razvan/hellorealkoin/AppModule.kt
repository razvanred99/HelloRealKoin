package ro.razvan.hellorealkoin

import org.koin.dsl.module.applicationContext

object AppModule {

    fun getModule() = applicationContext {
        bean { Datastore(get()) }
    }

}