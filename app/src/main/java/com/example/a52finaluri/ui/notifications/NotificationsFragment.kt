package com.example.a52finaluri.ui.notifications

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.a52finaluri.MainActivity
import com.example.a52finaluri.R
import com.example.a52finaluri.databinding.FragmentNotificationsBinding
import com.google.firebase.auth.FirebaseAuth

class NotificationsFragment : Fragment(R.layout.fragment_notifications) {
    private lateinit var logout : Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        logout = view.findViewById(R.id.out)
        super.onViewCreated(view, savedInstanceState)


        logout.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            val intent = Intent(this@NotificationsFragment.requireContext(), MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
    }

}