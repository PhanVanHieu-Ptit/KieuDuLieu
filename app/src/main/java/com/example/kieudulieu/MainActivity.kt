package com.example.kieudulieu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            button.setOnClickListener {
                Toast.makeText(this,"Chao ban ", Toast.LENGTH_SHORT).show()
            }
//            button.setOnClickListener(object : View.OnClickListener{
//                override fun onClick(v: View?) {
//                    TODO("Not yet implemented")
//                }
//
//            })
//       var mangten: ArrayList<String> = ArrayList()
//        // them phan tu trong mang
//        mangten.add("Phat")
//        mangten.add("Huy")
//        mangten.add("Hoa")
//        // kiem tra so phan tu trong mang
//        //mangten.size
//        // xoa phan tu trong mang
//       // mangten.remove("Hoa")
//      //  mangten.removeAt(2)
//        // sua gia tri trong mang
//        mangten.set(2,"Tuan")
//        Log.d("BBB", mangten.get(2))
       // ShowName("Hieu")

//       var sv1: SinhVien = SinhVien("Phan Van Hieu", "Tien Giang", 2001)
//
////        sv1.HoTen = " Phan Van Hieu"
////        sv1.DiaChi = "Tien Giang"
////        sv1.NamSinh = 2001
////        sv1.setHoTen("Phan Van Hieu")
////        sv1.setDiaChi("Tien Giang")
////        sv1.setNamSinh(1990)
//        Log.d("DDD", sv1.getHoTen() +" - "+ sv1.getDiaChi() + " - " + sv1.tinhTuoi())
//
//        val ptien:PhuongTien = PhuongTien("Xe dap", " Mau Den", 2)
//
//        Log.d("AAA","Phuong tien: ${ptien.ten} - ${ptien.mau} - So banh: ${ptien.banh}")
//
//        val hoten = "Hieu"
//        Log.d("AAA", "Ho ten: $hoten")

    }
//    fun ShowName(ten :String ){
//        Log.d("TTT","Chao ban "+ ten)
//    }
}