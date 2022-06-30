package com.example.animation_ex

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val lin:LinearLayout=findViewById(R.id.Liner1)
        lin.setOnClickListener {
            Toast.makeText(this,"Linerlayout",Toast.LENGTH_SHORT).show()
        }




        val text:TextView =findViewById(R.id.text1)
        text.setOnClickListener {
            Toast.makeText(this,"TextView",Toast.LENGTH_SHORT).show()
        }



        val view:View=findViewById(R.id.view1)
        view.setOnClickListener{
            Toast.makeText(this," View Class ", Toast.LENGTH_SHORT ).show()
        }



        val relativeLayout:RelativeLayout = findViewById(R.id.Rel)

        relativeLayout.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, " RelativeLayout", Toast.LENGTH_SHORT).show()
        })




        val button:Button=findViewById(R.id.but)
        button.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"This is Button ", Toast.LENGTH_SHORT).show()
        })

        val imageView:ImageView=findViewById(R.id.image)
        imageView.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"This is image View ",Toast.LENGTH_SHORT).show()
        })
        val editText:EditText=findViewById(R.id.edittext)
        editText.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"Edit Text Enter you number  ",Toast.LENGTH_SHORT).show()

        })


        val videoView:VideoView=findViewById(R.id.video1)
        videoView.setVideoURI(Uri.parse("android.resource://"+packageName+"/"+R.raw.video))

        videoView.start()


        videoView.setOnClickListener{
            Toast.makeText(this,"VideoView  ",Toast.LENGTH_SHORT).show()

        }





    }
}