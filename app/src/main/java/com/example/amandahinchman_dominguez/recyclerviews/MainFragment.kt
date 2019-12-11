package com.example.amandahinchman_dominguez.recyclerviews

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_main.*

data class gram(val title: String, val desc: String, val Url: String)

class MainFragment : Fragment() {
    public var a: String = "abhiram.shuttercode"
    private val gramobjects = listOf(
        gram(a, "Another day in Paradise.\n" +
                "-------------------------------------------------------------\n" +
                "In a beautiful morning, walking barefoot through the green fields with the company of the singing birds... and there you shall meet the real happiness!", "https://scontent-frt3-1.cdninstagram.com/v/t51.2885-15/sh0.08/e35/s750x750/74601353_602841083856357_7382673795890545382_n.jpg?_nc_ht=scontent-frt3-1.cdninstagram.com&_nc_cat=109&oh=0e4667755f62d00008d2b5f3eb67a31d&oe=5E872477&ig_cache_key=MjE5MzQ3MTM1MjE2MDYyMzYyMg%3D%3D.2"),
        gram(a, "Where flowers bloom so does Hope.", "https://scontent-frt3-1.cdninstagram.com/v/t51.2885-15/sh0.08/e35/s750x750/72466619_145474380081828_3396078401002307847_n.jpg?_nc_ht=scontent-frt3-1.cdninstagram.com&_nc_cat=100&oh=6f4ff8758d428c5f35a5fd64237ef1b1&oe=5E7F3E77&ig_cache_key=MjE4MzUzMTA4NjYwMzUzNjY4MA%3D%3D.2"),
        gram(a,"It's never too late to Learn.\n" +
                "Get yourself Cloud Ready on GCP with sessions and tutorials.","https://scontent-frt3-1.cdninstagram.com/v/t51.2885-15/sh0.08/e35/p750x750/71922595_148625103071932_1586063489933046980_n.jpg?_nc_ht=scontent-frt3-1.cdninstagram.com&_nc_cat=104&oh=2789a26dd43611b8cd9dfec3188c7d4b&oe=5E7383E6&ig_cache_key=MjE2MjQ4NjY1MzE1ODQwMjgyNQ%3D%3D.2"),
        gram(a,"\uD83E\uDD8BWings Of Hope.....\uD83E\uDD8B","https://scontent-frt3-1.cdninstagram.com/v/t51.2885-15/sh0.08/e35/s750x750/73407453_233031324344651_3781267323368726631_n.jpg?_nc_ht=scontent-frt3-1.cdninstagram.com&_nc_cat=111&oh=fdd1a9aa34538847dd2a21e7f9c9aba3&oe=5E6AB36F&ig_cache_key=MjE3MTc2NzQzNTk5MTIyNTUxMA%3D%3D.2"),
        gram(a,"Every sunset brings the promise of a new dawn. Remember there will always be tommorow.","https://scontent-frt3-1.cdninstagram.com/v/t51.2885-15/sh0.08/e35/s750x750/70880125_534537410707522_6119255369041328173_n.jpg?_nc_ht=scontent-frt3-1.cdninstagram.com&_nc_cat=110&oh=4cf76d94be029554e40581ca4ebe9662&oe=5E6A3D3F&ig_cache_key=MjE0OTQxMjA1MDQ3NTQwODgzMg%3D%3D.2"),
        gram(a,"\uD83E\uDD17\uD835\uDFE1\uD835\uDFDD\uD835\uDFDC \uD835\uDD44\uD835\uDD56\uD835\uDD5E\uD835\uDD60\uD835\uDD63\uD835\uDD5A\uD835\uDD56\uD835\uDD64 \uD835\uDD3E\uD835\uDD52\uD835\uDD5D\uD835\uDD60\uD835\uDD63\uD835\uDD56\uD83D\uDE0D\uD83D\uDE0F\uD83D\uDE02\uD83E\uDD26\u200D♂️","https://scontent-frt3-1.cdninstagram.com/v/t51.2885-15/sh0.08/e35/s750x750/66859595_472895796877825_4436741855527545236_n.jpg?_nc_ht=scontent-frt3-1.cdninstagram.com&_nc_cat=101&oh=d20c6f673acec8fd0ccc43585017158c&oe=5E785B8C&ig_cache_key=MjExODA0MjIxMzc0NDUxNjg5Mg%3D%3D.2")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.fragment_main, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list_recycler_view.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = ListAdapter(gramobjects)
        }
    }

    companion object {
        fun newInstance(): MainFragment = MainFragment()
    }
}