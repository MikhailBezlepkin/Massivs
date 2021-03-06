package com.example.massiv_praktika

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val bad = 0..3
    val normal = 4..6
    val nice = 7..9
    val excellent = 10
    var gradeArray = arrayOf(4, 7, 3, 6, 10, 2)
    val nameArray = arrayOf("Антон", "Егор", "Маша", "Светлана", "Юля", "Семен")
    val badArray = ArrayList<String>()
    val normalArray = ArrayList<String>()
    val niceArray = ArrayList<String>()
    val excellentArray = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var i = 0
        for (i in gradeArray.indices){
            if (gradeArray[i] in bad){
                Log.d("MyLog", "Плохие оценки: Ученик: ${nameArray[i]} - ${gradeArray[i]} ")
            }
        }
        for (i in gradeArray.indices){
            if (gradeArray[i] in normal){
                Log.d("MyLog", "Нормальные оценки: Ученик: ${nameArray[i]} - ${gradeArray[i]} ")
            }
        }
        for (i in gradeArray.indices){
            if (gradeArray[i] in nice){
                Log.d("MyLog", "Хорошие оценки: Ученик: ${nameArray[i]} - ${gradeArray[i]} ")
            }
        }
        for (i in gradeArray.indices){
            if (gradeArray[i] == excellent){
                Log.d("MyLog", "Отличные оценки: Ученик: ${nameArray[i]} - ${gradeArray[i]} ")
            }
        }
for((index, name) in nameArray.withIndex()){
    when(gradeArray[index]){
        in bad -> badArray.add("Плохие оценки: Ученик $name - ${gradeArray[index]}")
        in normal -> normalArray.add("Нормальные оценки: Ученик $name - ${gradeArray[index]}")
        in nice -> niceArray.add("Хорошие оценки: Ученик $name - ${gradeArray[index]}")
         excellent -> excellentArray.add("Отличные оценки: Ученик $name - ${gradeArray[index]}")
    }
}
badArray.forEach{Log.d("MyLog", it)}
normalArray.forEach{Log.d("MyLog", it)}
niceArray.forEach{Log.d("MyLog", it)}
excellentArray.forEach{Log.d("MyLog", it)}

    }
}