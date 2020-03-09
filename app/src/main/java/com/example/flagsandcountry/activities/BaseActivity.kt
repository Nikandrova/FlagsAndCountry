package com.example.flagsandcountry.activities

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.flagsandcountry.R

abstract class BaseActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initActivity(savedInstanceState)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        if(supportFragmentManager.backStackEntryCount == 0) {
            finish()
        }
    }

    @LayoutRes
    abstract fun getLayoutId() : Int

    protected open fun initActivity(savedInstantState: Bundle?) {

    }

     fun showFragment(fragment: Fragment, addToBack: Boolean = false, containerId: Int = R.id.container) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.setTransition(FragmentTransaction.TRANSIT_NONE)
        transaction.replace(containerId, fragment, fragment.javaClass.simpleName)
        if(addToBack) transaction.addToBackStack(null)
        transaction.commitAllowingStateLoss()
    }

    fun goBack() {
        if (supportFragmentManager.backStackEntryCount == 1) {
            finish()
        } else {
            supportFragmentManager.popBackStackImmediate()
            if(supportFragmentManager.backStackEntryCount == 0) {
                finish()
            }
        }
    }

    fun showProgress() {
        val progressBar: View = findViewById(R.id.progressBar)
        val container: View = findViewById(R.id.container)

        progressBar.visibility = View.VISIBLE
        container.visibility = View.GONE
    }

    fun hideProgress() {
        val progressBar: View = findViewById(R.id.progressBar)
        val container: View = findViewById(R.id.container)

        progressBar.visibility = View.GONE
        container.visibility = View.VISIBLE
    }

    fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}