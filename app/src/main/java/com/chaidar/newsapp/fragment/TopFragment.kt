package com.chaidar.newsapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chaidar.newsapp.data.DataNews
import com.chaidar.newsapp.adapter.NewsAdapter
import com.chaidar.newsapp.R
import com.chaidar.newsapp.initViewHeadline


class TopFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_top, container, false)

        val rvNews = view.findViewById<RecyclerView>(R.id.rv_top_news)
        rvNews.layoutManager = LinearLayoutManager(view.context)
        rvNews.adapter = NewsAdapter(DataNews.listTopnews)



        val newsHeadline = view.findViewById<View>(R.id.news_headline)
        initViewHeadline(view.context, newsHeadline, 2)
        return view
    }


}