package com.amsdevelops.filmssearch.domain

import android.os.Parcelable


@Parcelize
abstract class Film(
    val title: String,
    val poster: Int,
    val description: String,
    var rating: Float = 0f,
    var isInFavorites: Boolean = false
) : Parcelable

annotation class Parcelize
