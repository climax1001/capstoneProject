package com.example.capstone0531

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_insert_class.*
import kotlinx.android.synthetic.main.list_one_item.*


class InsertClass : AppCompatActivity() {
    val classList = arrayListOf<class_list>(
        class_list("algo", "월15~17", "kim",null),
        class_list("AI", "목4~8", "park",null),
        class_list("automata", "금8~16", "choi",null),
        class_list("DB", "월15~17", "kim",null),
        class_list("OS", "목4~8", "park",null),
        class_list("GOOD", "금8~16", "choi",null)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert_class)

        val classAdapter_activity = classAdapter(classList)
        classListView.adapter = classAdapter_activity
        classListView.layoutManager = LinearLayoutManager(this)

//        classListView.onItemClickListener = AdapterView.OnItemClickListener{parent, view, position, id ->
//            val selectItem = parent.getItemAtPosition(position) as String
//            Toast.makeText(this , "hello", Toast.LENGTH_SHORT ).show()
//        }
    }
}
