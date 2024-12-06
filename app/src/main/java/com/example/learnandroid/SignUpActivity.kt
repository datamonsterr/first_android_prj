package com.example.learnandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.InputChip
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learnandroid.ui.common.InputLabel
import com.example.learnandroid.ui.common.InputLabelPreview
import com.example.learnandroid.ui.theme.Blue
import com.example.learnandroid.ui.theme.LearnAndroidTheme

class SignUpActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnAndroidTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SignUpBody(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun SignUpBody(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        SignUpHeader()
        SignUpForm(modifier= modifier.fillMaxWidth())
    }
}

@Composable
fun SignUpHeader(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(32.dp, 48.dp)) {
        Text("Sign Up", fontSize = 32.sp, fontWeight = FontWeight.Bold)
        Text("Create an account to continue", fontSize = 16.sp)
    }
}

@Composable
fun SignUpForm(modifier: Modifier = Modifier) {
    Column (modifier = modifier.padding(32.dp, 32.dp)) {
        InputLabel(label = "Full name", placeholder = "Enter your username", modifier = modifier)
        InputLabel(label = "Email", placeholder = "Enter your email", modifier = modifier)
        InputLabel(label = "Phone Number", placeholder = "Enter your phone number", modifier = modifier)
        InputLabel(label = "Username", placeholder = "Enter your username", modifier = modifier)
        InputLabel(label = "Password", placeholder = "Enter your password", hidden = true, modifier = modifier)
        InputLabel(label = "Confirm Password", placeholder = "Confirm your password", hidden = true, modifier = modifier)
        Button(onClick = {}, modifier = modifier.padding(top = 16.dp).fillMaxWidth(), colors = ButtonDefaults.buttonColors(containerColor = Blue)) {
            Text("Sign Up")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true, device = "id:pixel_8")
@Composable
fun BodyPreview() {
    LearnAndroidTheme {
        SignUpBody(Modifier)
    }
}