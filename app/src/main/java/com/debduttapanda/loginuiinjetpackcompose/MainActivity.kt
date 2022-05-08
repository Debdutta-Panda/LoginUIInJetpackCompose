package com.debduttapanda.loginuiinjetpackcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.debduttapanda.loginuiinjetpackcompose.ui.theme.LoginUIInJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginUIInJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        modifier = Modifier
                            .background(Color.White)
                            .padding(24.dp)
                    ){
                        IconButton(
                            onClick = { /*TODO*/ },
                            modifier = Modifier.offset(x = (-18).dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.KeyboardArrowLeft,
                                contentDescription = "",
                                modifier = Modifier.size(32.dp)
                            )
                        }
                        Spacer(Modifier.height(24.dp))
                        Text(
                            "Welcome Back!",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp
                        )
                        Text(
                            "Sign in to continue",
                            color = Color.Gray,
                            fontSize = 12.sp
                        )
                        Spacer(Modifier.height(24.dp))
                        Text(
                            "Username",
                            color = Color.Gray,
                            fontSize = 12.sp
                        )
                        val email = remember { mutableStateOf("") }
                        TextField(
                            value = email.value,
                            onValueChange = {
                                email.value = it
                            },
                            modifier = Modifier.fillMaxWidth(),
                            colors = TextFieldDefaults.textFieldColors(
                                backgroundColor = Color.Transparent,
                                cursorColor = Color(0xffFF2B57),
                                focusedIndicatorColor = Color(0xffFF2B57)
                            ),
                            placeholder = {
                                Text(
                                    "Email ID"
                                )
                            }
                        )
                        Spacer(Modifier.height(32.dp))
                        ////////////////////////////
                        Text(
                            "Password",
                            color = Color.Gray,
                            fontSize = 12.sp
                        )
                        val password = remember { mutableStateOf("") }
                        TextField(
                            value = password.value,
                            onValueChange = {
                                password.value = it
                            },
                            modifier = Modifier.fillMaxWidth(),
                            colors = TextFieldDefaults.textFieldColors(
                                backgroundColor = Color.Transparent,
                                cursorColor = Color(0xffFF2B57),
                                focusedIndicatorColor = Color(0xffFF2B57)
                            ),
                            placeholder = {
                                Text(
                                    "Password"
                                )
                            },
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Password
                            ),
                            visualTransformation = PasswordVisualTransformation()
                        )
                        TextButton(
                            onClick = { /*TODO*/ },
                            colors = ButtonDefaults.textButtonColors(
                                contentColor = Color.Gray,
                            ),
                            modifier = Modifier.align(Alignment.End)
                        ) {
                            Text(
                                "Forgot your password?",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Normal,
                            )
                        }
                        Spacer(Modifier.height(56.dp))
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(40.dp),
                            colors = ButtonDefaults.textButtonColors(
                                backgroundColor = Color(0xffFF2B57),
                                contentColor = Color.White
                            )
                        ) {
                            Text(
                                "SIGN IN",
                                fontSize = 12.sp
                            )
                        }
                        Spacer(Modifier.height(90.dp))
                        Row(
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        ){
                            Box(
                                modifier = Modifier
                                    .size(72.dp)
                                    .clip(CircleShape)
                                    .background(Color(0xff0D6FCA))
                                    .clickable {
                                        Toast
                                            .makeText(
                                                this@MainActivity,
                                                "Facebook",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },
                                contentAlignment = Alignment.Center
                            ){
                                Text(
                                    "f",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 48.sp,
                                    color = Color.White
                                )
                            }
                            Spacer(Modifier.width(24.dp))
                            Box(
                                modifier = Modifier
                                    .size(72.dp)
                                    .clip(CircleShape)
                                    .background(Color(0xff39D0FF))
                                    .clickable {
                                        Toast
                                            .makeText(
                                                this@MainActivity,
                                                "Twitter",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },
                                contentAlignment = Alignment.Center
                            ){
                                Image(
                                    painter = painterResource(id = R.drawable.twitter)
                                    , contentDescription = "",
                                    modifier = Modifier.size(40.dp)
                                )
                            }
                            Spacer(Modifier.width(24.dp))
                            Box(
                                modifier = Modifier
                                    .size(72.dp)
                                    .clip(CircleShape)
                                    .background(Color(0xffFF3C47))
                                    .clickable {
                                        Toast
                                            .makeText(
                                                this@MainActivity,
                                                "Google",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },
                                contentAlignment = Alignment.Center
                            ){
                                Image(
                                    painter = painterResource(id = R.drawable.google_logo)
                                    , contentDescription = "",
                                    modifier = Modifier.size(40.dp)
                                )
                            }
                        }
                        Spacer(Modifier.height(48.dp))
                        Row(
                            modifier = Modifier.align(Alignment.CenterHorizontally),
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Text(
                                "Don’t have an account?",
                                fontSize = 12.sp
                            )
                            TextButton(
                                onClick = { /*TODO*/ },
                                colors = ButtonDefaults.textButtonColors(
                                    contentColor = Color.Black
                                )
                            ) {
                                Text(
                                    "Sign up",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 12.sp
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}