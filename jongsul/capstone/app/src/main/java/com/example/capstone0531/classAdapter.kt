package com.example.capstone0531

import android.content.ClipData
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_insert_class.view.*
import kotlinx.android.synthetic.main.list_one_item.view.*
import org.jetbrains.anko.matchParent


class classAdapter(val list: List<class_list>): RecyclerView.Adapter<ClassDataViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClassDataViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_one_item, parent, false)
        return ClassDataViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: ClassDataViewHolder, position: Int) {
        holder.containerView.classNameText.text = list[position].className
        holder.containerView.classTimeText.text = list[position].classTime
        holder.containerView.professorText.text = list[position].professor
        holder.containerView.addText.setOnClickListener {

        }

    }
}
//class classAdapter(val context : Context, val classList: ArrayList<class_list>) : RecyclerView.Adapter<classAdapter.ViewHolder> {
//    private val mContext = context
//    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
//        lateinit var viewHolder : ViewHolder
//        var view = convertView
//        if(view == null) {
//            viewHolder = ViewHolder()
//            view = LayoutInflater.from(mContext).inflate(R.layout.list_one_item, parent, false)
//            viewHolder.className_activity = view.findViewById(R.id.classNameText)
//            viewHolder.classTime_activity = view.findViewById(R.id.classTimeText)
//            viewHolder.professor_activity = view.findViewById(R.id.professorText)
//            viewHolder.addButton = view.findViewById(R.id.addText)
//            view.tag = ViewHolder()
//        }else {
//            viewHolder = view.tag as ViewHolder
//            view = convertView
//        }
//        val classes = classList[position]
//        viewHolder.className_activity?.text = classes.className
//        viewHolder.classTime_activity?.text = classes.classTime
//        viewHolder.professor_activity?.text = classes.professor
//        viewHolder.addButton.setOnClickListener {
//            Toast.makeText(context,"hello",Toast.LENGTH_SHORT)
//        }
//        return view
//    }
//
//    override fun getItem(position: Int): Any {
//
//        return classList[position]
//    }
//
//    override fun getItemId(position: Int): Long {
//
//        return 0
//    }
//
//    override fun getCount(): Int {
//
//        return classList.size
//    }
//    inner class ViewHolder{
//        var className_activity : TextView? = null
//        var classTime_activity : TextView? = null
//        var professor_activity : TextView? = null
//        lateinit var addButton : Button
//    }
//
//}