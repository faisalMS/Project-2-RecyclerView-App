package com.example.project_2_recyclerview_app.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project_2_recyclerview_app.R
import com.example.project_2_recyclerview_app.model.Anime


// - Bind data with views
// - send list of data to RecyclerView
class HunterXHunterAdapter(
    private val dataset: List<Anime>,
    private val context: Context
)
    : RecyclerView.Adapter<HunterXHunterAdapter.AthkarViewHolder>() {

    // Adapter helper class to arrange data in layout file
    class AthkarViewHolder(private val view : View) : RecyclerView.ViewHolder(view){
        val textView : TextView = view.findViewById(R.id.item_title)
        val imageView : ImageView = view.findViewById(R.id.item_image)
    }

    // 3 functions
    // تعرف ملف ال layout الخاص بالعنصر
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AthkarViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)

        return AthkarViewHolder(adapterLayout)
    }

    // تربط البيانات بالقالب الخاص بها بمساعدة ViewHolder
    override fun onBindViewHolder(holder: AthkarViewHolder, position: Int) {
        // save the position of them (which item i'm dealing with)
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.animeStringId)
        holder.imageView.setImageResource(item.animeImage)
    }

    // تحدد عدد البيانات في القائمة
    override fun getItemCount() = dataset.size


}