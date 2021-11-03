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

        val imgHeadLine: ImageView = view.findViewById(R.id.img_headline)
        val tvTitleHeadLine: TextView = view.findViewById(R.id.tv_title_headline)
        val tvDescriptionHeadLine: TextView = view.findViewById(R.id.tv_desc_headline)
        val tvDateHeadLine: TextView = view.findViewById(R.id.tv_date_headline)
        val tvAuthorHeadLine: TextView = view.findViewById(R.id.tv_author_headline)

        imgHeadLine.setImageResource(DataNews.photoHeadline[2])
        tvTitleHeadLine.text = DataNews.titleHeadline[2]
        tvDescriptionHeadLine.text = DataNews.descriptionHeadline[2]
        tvDateHeadLine.text = DataNews.dateHeadline[2]
        tvAuthorHeadLine.text = DataNews.authorHeadline[2]
        return  view

    }
}