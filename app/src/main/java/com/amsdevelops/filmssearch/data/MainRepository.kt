package com.amsdevelops.filmssearch.data

import com.amsdevelops.filmssearch.domain.Film
import com.example.filmssearch.R

class MainRepository {
    val filmsDataBase = listOf(
        Film(
            title = "The Alice in Wonderland",
            poster = R.drawable.poster_11_alice,
            description = "It tells the story of a girl named Alice, who falls through a rabbit hole into an imaginary world inhabited by strange anthropomorphic creatures.",
            rating = 7.7f
        ),
        Film(
            "The Heat",
            R.drawable.poster_12_heat,
            "The two strongest teams face off against each other in a deadly battle.",
            2.0f
        ),
        Film(
            "The Marilyn Monroe",
            R.drawable.poster_13_marilyn,
            "The film shows Marilyn's excited meeting with the head of the studio, Mr. Z, a meeting that could be a big breakthrough for her if it leads to a contract with the studio.",
            6.7f
        ),
        Film(
            "Terminator",
            R.drawable.poster_14_term,
            "The story of the confrontation between soldier Kyle Reese and cyborg Terminator.",
            8.7f
        ),
        Film(
            "The Martian",
            R.drawable.poster_15_martian,
            "The Ares-3 Mars mission was forced to leave the planet urgently due to an impending sandstorm.",
            9.7f
        ),
        Film(
            "Bad Santa",
            R.drawable.poster_16_bad,
            "Willy is an unusual Santa Claus. Once a year, on Christmas Day, he and his partner rob another department store.",
            8.6f
        ),
        Film(
            "Avatar",
            R.drawable.poster_17_avatar,
            "Former Marine Jake Sully is confined to a wheelchair, but is assigned to travel several light-years to the Earthlings' base on the planet Pandora.",
            5.7f
        ),
        Film(
            "Moana 2",
            R.drawable.poster_18_moana,
            "After receiving a call from the adventurer ancestors, Moana and Maui set off for the remote and dangerous waters of Oceania.",
            4.7f
        ),
        Film(
            "Oppenheimer",
            R.drawable.poster_19_oppen,
            "The life story of American theoretical physicist Robert Oppenheimer.",
            8.0f
        ),
        Film(
            "Mufasa -The Lion King",
            R.drawable.poster_20_mufasa,
            "Orphaned Mufasa meets a royal heir named Taka.",
            8.4f
        )
}