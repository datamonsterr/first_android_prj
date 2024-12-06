package com.example.learnandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learnandroid.ui.common.InputLabel
import com.example.learnandroid.ui.theme.Blue
import com.example.learnandroid.ui.theme.Dark
import com.example.learnandroid.ui.theme.LearnAndroidTheme

class SignInActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnAndroidTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SignInBody(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun SignInBody(modifier: Modifier = Modifier) {
    Column {
        SignInHeader(modifier)
        SignInForm(modifier)
    }
}

@Composable
fun SignInHeader(modifier: Modifier = Modifier) {
    Surface(color = Dark, contentColor = Color.White) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(32.dp, 48.dp)
        ) {
            Text(
                text = "Sign in to your Account.",
                fontSize = 32.sp,
                lineHeight = 40.sp,
                fontWeight = FontWeight.Bold,
                modifier = modifier
            )
            Row {
                Text(
                    text = "Don't have an account? ",
                    modifier = modifier
                )
                Text(
                    text = "Sign up",
                    color = Blue,
                    textDecoration = TextDecoration.Underline,
                    modifier = modifier
                )
            }
        }
    }
}

@Composable
fun SignInForm(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(32.dp, 64.dp).fillMaxWidth()) {
        InputLabel(modifier = modifier.fillMaxWidth(),"Email", "your_email@gmail.com")
        InputLabel(modifier = modifier.fillMaxWidth(),"Password", "Enter your password", hidden = true)
        Button(
            colors = ButtonDefaults.buttonColors(containerColor = Blue),
            onClick = { /* Handle sign in */ },
            modifier = modifier.padding(top = 16.dp).fillMaxWidth()
        ) {
            Text("Login", fontSize = 18.sp)
        }
    }
}


@Preview(showBackground = true, showSystemUi = true, device = "id:pixel_8")
@Composable
fun HeaderPreview() {
    SignInBody()
}