package com.example.filmssearch

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import com.amsdevelops.filmssearch.FilmListRecyclerAdapter
import com.example.filmssearch.databinding.FragmentHomeBinding
import androidx.recyclerview.widget.LinearLayoutManager
import com.amsdevelops.filmssearch.Film
import com.example.filmssearch.R.drawable
import java.util.*

class HomeFragment : Fragment() {
    private lateinit var filmsAdapter: FilmListRecyclerAdapter
    private lateinit var binding: FragmentHomeBinding
    private val filmsDataBase = listOf(
        Film(
            "The Alice in Wonderland",
            drawable.poster_11_alice,
            "It tells the story of a girl named Alice, who falls through a rabbit hole into an imaginary world inhabited by strange anthropomorphic creatures.",
            7.7f
        ),
        Film(
            "The Heat",
            drawable.poster_12_heat,
            2.0f
        ),
        Film(
            "The Marilyn Monroe",
            drawable.poster_13_marilyn,
            6.7f
        ),
        Film(
            "Terminator",
            drawable.poster_14_term,
            8.7f
        ),
        Film(
            "The Martian",
            drawable.poster_15_martian,
            9.7f
        ),
        Film(
            "Bad Santa",
            drawable.poster_16_bad,
            8.6f
        ),
        Film(
            "Avatar",
            drawable.poster_17_avatar,
            5.7f
        ),
        Film(
            "Moana 2",
            drawable.poster_18_moana,
            4.7f
        ),
        Film(
            "Oppenheimer",
            drawable.poster_19_oppen,
            8.0f
        ),
        Film(
            "Mufasa -The Lion King",
            drawable.poster_20_mufasa,
            8.4f
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        AnimationHelper.performFragmentCircularRevealAnimation(binding.homeFragmentRoot, requireActivity(), 1)

        initSearchView()

        //находим наш RV
        initRecyckler()
        //Кладем нашу БД в RV
        filmsAdapter.addItems(filmsDataBase)
    }

    private fun initSearchView() {
        binding.searchView.setOnClickListener {
            binding.searchView.isIconified = false
        }

        //Подключаем слушателя изменений введенного текста в поиска
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            //Этот метод отрабатывает при нажатии кнопки "поиск" на софт клавиатуре
            override fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }

            //Этот метод отрабатывает на каждое изменения текста
            override fun onQueryTextChange(newText: String): Boolean {
                //Если ввод пуст то вставляем в адаптер всю БД
                if (newText.isEmpty()) {
                    filmsAdapter.addItems(filmsDataBase)
                    return true
                }
                //Фильтруем список на поискк подходящих сочетаний
                val result = filmsDataBase.filter {
                    //Чтобы все работало правильно, нужно и запроси и имя фильма приводить к нижнему регистру
                    it.title.toLowerCase(Locale.getDefault())
                        .contains(newText.toLowerCase(Locale.getDefault()))
                }
                //Добавляем в адаптер
                filmsAdapter.addItems(result)
                return true
            }
        })
    }

    private fun initRecyckler() {
        binding.mainRecycler.apply {
            filmsAdapter =
                FilmListRecyclerAdapter(object : FilmListRecyclerAdapter.OnItemClickListener {
                    override fun click(film: Film) {
                        (requireActivity() as MainActivity).launchDetailsFragment(film)
                    }
                })
            //Присваиваем адаптер
            adapter = filmsAdapter
            //Присвои layoutmanager
            layoutManager = LinearLayoutManager(requireContext())
            //Применяем декоратор для отступов
            val decorator = TopSpacingItemDecoration(8)
            addItemDecoration(decorator)
        }
    }
}