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


class AllNewsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_all_news, container, false)
        val rvNews = view.findViewById<RecyclerView>(R.id.rv_all_news)
        rvNews.layoutManager = LinearLayoutManager(view.context)
        rvNews.adapter = NewsAdapter(DataNews.listAllnews)

        val imgHeadLine: ImageView = view.findViewById(R.id.img_headline)
        val tvTitleHeadLine: TextView = view.findViewById(R.id.tv_title_headline)
        val tvDescriptionHeadLine: TextView = view.findViewById(R.id.tv_desc_headline)
        val tvDateHeadLine: TextView = view.findViewById(R.id.tv_date_headline)
        val tvAuthorHeadLine: TextView = view.findViewById(R.id.tv_author_headline)

        imgHeadLine.setImageResource(DataNews.photoHeadline[0])
        tvTitleHeadLine.text = DataNews.titleHeadline[0]
        tvDescriptionHeadLine.text = DataNews.descriptionHeadline[0]
        tvDateHeadLine.text = DataNews.dateHeadline[0]
        tvAuthorHeadLine.text = DataNews.authorHeadline[0]
        return  view
    }
}

