package com.app.myapplication3.utilities.daggerinjections.annotations

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass

@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION,AnnotationTarget.PROPERTY_GETTER,AnnotationTarget.PROPERTY_SETTER)
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)