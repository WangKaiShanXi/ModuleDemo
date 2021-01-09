package com.example.moduledemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.sharemodule.ServiceFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login.setOnClickListener(this)
        shopping.setOnClickListener(this)
        bill.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.login -> {
                login()
            }
            R.id.shopping -> {
                shopping()
            }
            R.id.bill -> {
                fragment()
            }
        }
    }
    fun login() {
        ServiceFactory.getInstance().loginService.launch(this, "")
    }

    fun shopping() {
        ServiceFactory.getInstance().shoppingService.launch(this, "")
    }

    fun fragment() {
        // v-4包的FragmentManager,注意是否是在Activity中使用，
        // 因为Activity中并没有此方法的定义，必须是继承FragmentActivity或者AppCompatActivity，然后使用
        val bundle = Bundle()
        ServiceFactory.getInstance().shoppingService.newBillFragment(supportFragmentManager,R.id.billFragment,bundle)
    }
}